package thinlet.drafts;

import java.awt.*;
import java.lang.reflect.*;
import thinlet.*;

public class ClassExplorer {
	
	private Image classicon, methodicon, parametericon, fieldicon, exceptionicon;
	
	public void initClass(Thinlet thinlet, Object combobox, Object tree) {
		classicon = thinlet.getIcon("/icon/class.gif");
		methodicon = thinlet.getIcon("/icon/method.gif");
		parametericon = thinlet.getIcon("/icon/parameter.gif");
		fieldicon = thinlet.getIcon("/icon/field.gif");
		exceptionicon = thinlet.getIcon("/icon/exception.gif");
	
		Class thinletclass = thinlet.getClass();
		int n = 0;
		for (Class c = thinletclass; c != null; c = c.getSuperclass()) {
			Object choice = Thinlet.create("choice");
			thinlet.setString(choice, "text", c.getName());
			thinlet.setIcon(choice, "icon", classicon);
			thinlet.add(combobox, choice, 0);
			n++;
		}
		thinlet.setInteger(combobox, "selected", n - 1);
		
		loadClass(thinlet, thinletclass.getName(), tree);
	}
	
	public void loadClass(Thinlet thinlet, String classname, Object tree) {
		thinlet.removeAll(tree);
		try {
			Class aclass = Class.forName(classname);
			Object classnode = createNode(thinlet, tree, aclass.getName(), classicon);
			try {
				Constructor[] constructors = aclass.getConstructors();
				for (int i = 0; i < constructors.length; i++) {
					Object constructornode = createNode(thinlet, 	classnode,
						Modifier.toString(constructors[i].getModifiers()) + " " +
						constructors[i].getName(), classicon);
					
					Class[] cparameters = constructors[i].getParameterTypes();
					Class[] cexceptions = constructors[i].getExceptionTypes();
					if ((cparameters.length > 0) || (cexceptions.length > 0)) {
						for (int j = 0; j < cparameters.length; j++) {
							createNode(thinlet, constructornode, getNameOf(cparameters[j]), parametericon);
						}
						for (int j = 0; j < cexceptions.length; j++) {
							createNode(thinlet, constructornode, getNameOf(cexceptions[j]), exceptionicon);
						}
						thinlet.setBoolean(constructornode, "expanded", false);
					}
				}
				
				Field[] fields = aclass.getDeclaredFields();
				for (int i = 0; i < fields.length; i++) {
					Object fieldnode = createNode(thinlet, classnode,
						Modifier.toString(fields[i].getModifiers()) + " " +
						fields[i].getName(), fieldicon);
				}
				
				Method[] methods = aclass.getDeclaredMethods();
				for (int i = 0; i < methods.length; i++) {
					Object methodnode = createNode(thinlet, classnode,
						Modifier.toString(methods[i].getModifiers()) + " " +
						getNameOf(methods[i].getReturnType()) + " " +
						methods[i].getName(), methodicon);
					
					Class[] parameters = methods[i].getParameterTypes();
					Class[] exceptions = methods[i].getExceptionTypes();
					if ((parameters.length > 0) || (exceptions.length > 0)) {
						for (int j = 0; j < parameters.length; j++) {
							createNode(thinlet, methodnode, getNameOf(parameters[j]), parametericon);
						}
						for (int j = 0; j < exceptions.length; j++) {
							createNode(thinlet, methodnode, getNameOf(exceptions[j]), exceptionicon);
						}
						thinlet.setBoolean(methodnode, "expanded", false);
					}
				}
			} catch (SecurityException se) {
				createNode(thinlet, classnode, se.getMessage(), exceptionicon);
			} 
		} catch (ClassNotFoundException cnfe) { /*never*/}
	}
	
	private Object createNode(Thinlet thinlet, Object parent, String text, Image icon) {
		Object node = Thinlet.create("node");
		thinlet.setString(node, "text", text);
		thinlet.setIcon(node, "icon", icon);
		thinlet.add(parent, node);
		return node;
	}
	
	private String getNameOf(Class aclass) {
		return (aclass.isArray()) ? (getNameOf(aclass.getComponentType()) + "[]") : aclass.getName();
	}
}