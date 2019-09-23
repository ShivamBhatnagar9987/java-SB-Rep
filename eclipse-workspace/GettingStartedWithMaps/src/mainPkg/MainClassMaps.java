package mainPkg;

import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

import model.Employee;

public class MainClassMaps {
	public static void main(String[] args) {
		final Map<Integer, Employee> myMap = new HashMap<>();
		myMap.put(3, new Employee("Shivam", "314", "Java Pro"));
		myMap.put(1, new Employee("Shivm", "214", "Jvo"));
		myMap.put(4, new Employee("Shiva", "514", "Java o"));
		myMap.put(2, new Employee("Shiv", "614", "Java ro"));
		//final Set<Map.Entry<Integer, Employee>> entries = myMap.entrySet();
		myMap.put(5, new Employee("Shv", "64", "Jo"));
		//for (Map.Entry<Integer, Employee> entry : entries)
		//	System.out.println(entry.getKey() + " : " + entry.getValue());
		NavigableMap<Integer, Employee> navMaps=new TreeMap<>();
		navMaps.putAll(myMap);
		final Set<Map.Entry<Integer, Employee>> Naventries = navMaps.entrySet();
		for (Map.Entry<Integer, Employee> entry : Naventries)
			System.out.println(entry.getKey() + " ----> " + entry.getValue());
		
		
		System.out.println(navMaps.headMap(3));
		
		
	}
}