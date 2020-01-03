package collectiondemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
public static void main(String[] args) {
	HashMap<String, Double> hm = new HashMap<String, Double>();
	hm.put("John Deo", 3434.34);
	hm.put("Tom Smith ", 123.22);
	hm.put("Jane Baker", 1378.00);
	hm.put("Todd Hall", 99.22);
	hm.put("Ralph Smith", -19.08);
	Set set = hm.entrySet();
	Iterator i = set.iterator();
	while(i.hasNext())
	{
		Map.Entry me =(Map.Entry) i.next();
		System.out.println(me.getKey() + ":");
		System.out.println(me.getValue());
	}
	System.out.println();
	double balance = ((Double) hm.get("John Deo")).doubleValue();
	hm.put("John Deo",new Double(balance + 1000));
}
}
