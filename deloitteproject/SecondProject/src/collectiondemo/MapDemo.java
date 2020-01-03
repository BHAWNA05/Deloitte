package collectiondemo;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
public static void main(String[] args) {
	//Map<Integer, String> allData = new TreeMap<Integer, String>();//in the given order
	//Map<Integer, String> allData = new Hashtable<Integer, String>(); // not sync , thread safe , data can be in any order
	Map<Integer, String> allData = new LinkedHashMap<Integer, String>();
	
	allData.put(1098, "bhawna");
	allData.put(1099, "anjali");
	allData.put(2000, "pooja");
	System.out.println(allData);
}
}
