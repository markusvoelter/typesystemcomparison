package de.itemis.xtext.typesystem.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Multimap<K, V> {
	
	private Map<K, List<V>> map = new HashMap<K, List<V>>();
	private List<V> EMPTY_LIST = new ArrayList<V>();
	
	public Multimap() {
	}

	public void put( K key, V value ) {
		getList(key).add( value );
	}
	
	public List<V> get( K key ) {
		List<V> list = map.get(key);
		if ( list != null ) return list;
		return EMPTY_LIST;
	}
	
	public boolean containsKey( K key ) {
		return getList(key) != null;
	}

	private List<V> getList(K key) {
		List<V> list = map.get(key);
		if ( list == null ) {
			list = new ArrayList<V>();
			map.put(key, list);
		}
		return list;
	}
	
	
	
	
}
