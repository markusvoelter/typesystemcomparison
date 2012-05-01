import java.awt.Color;

import thinlet.FrameLauncher;
import thinlet.Thinlet;

public class PersonFormGui extends Thinlet {

	private Person entity = new Person();
	private PersonForm personForm = new PersonForm();

	public boolean validateFirstName(final Person it, final String widgetcontent) {
		return personForm.validateFirstName(it, widgetcontent);
	}

	public boolean validateName(final Person it, final String widgetcontent) {
		return personForm.validateName(it, widgetcontent);
	}

	public boolean validateAge(final Person it, final String widgetcontent) {
		int widgetcontent_converted;
		try { widgetcontent_converted = Integer.parseInt(widgetcontent); }
		catch (NumberFormatException e) {
			return false;
		}
		return personForm.validateAge(it, widgetcontent_converted);
	}
	
	public PersonFormGui() throws Exception {
		add(parse("FormTest.xml"));
	}

	public void initHeadline(Object it) {
		setString(it, "text", this.getClass().getSimpleName() + " edits "
				+ entity.getClass().getSimpleName());
	}

	public void initGreeting(Object it) {
		setString(it, "text", entity.getGreeting());
	}

	public void formChanged() {
		// update Entity
		entity.setName(getString(find("name"), "text"));
		entity.setFirstName(getString(find("firstName"), "text"));
		entity.setAge(toInt(getString(find("age"), "text")));
		entity.setLikesCake(getBoolean(find("likesCake"), "selected"));
		// update derived attributes
		setBoolean(find("isAdult"), "selected", entity.getIsAdult());
		setString(find("greeting"), "text", entity.getGreeting());

		// validate firstName
		if (!validateFirstName(entity, getString(find("firstName"), "text"))) {
			setBoolean(find("firstName" + "Valid"), "selected", false);
			setColor(find("firstName"), "background", Color.red);
		} else {
			setBoolean(find("firstName" + "Valid"), "selected", true);
			setColor(find("firstName"), "background", null);
		}
		
		// validate name
		if (!validateName(entity, getString(find("name"), "text"))) {
			setBoolean(find("name" + "Valid"), "selected", false);
			setColor(find("name"), "background", Color.red);
		} else {
			setBoolean(find("name" + "Valid"), "selected", true);
			setColor(find("name"), "background", null);
		}
		
		// validate age
		if (!validateAge(entity, getString(find("age"), "text"))) {
			setBoolean(find("age" + "Valid"), "selected", false);
			setColor(find("age"), "background", Color.red);
		} else {
			setBoolean(find("age" + "Valid"), "selected", true);
			setColor(find("age"), "background", null);
		}
		
		// validate likesCake
		setBoolean(find("likesCake" + "Valid"), "selected", true);
		
	}
	
	public int toInt(String s) {
		try {
			return Integer.parseInt(s);
		} catch (NumberFormatException e) {
			return 0;
		}

	}

	public static void main(String[] args) throws Exception {
		PersonFormGui formTest = new PersonFormGui();
		FrameLauncher frameLauncher = new FrameLauncher("Form", formTest, 200,
				200);
		formTest.formChanged();
		frameLauncher.doLayout();
	}
}