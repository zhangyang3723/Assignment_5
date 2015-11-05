package assignment_5_YangZhang;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

@SuppressWarnings("rawtypes")
public class Person implements Comparable{
	private String fName, lName;
	
	public Person(String fName, String lName){
		
		this.fName = fName;
		this.lName = lName;
	}
	
	public void setFName(String name){
		this.fName = name;
	}
	public String getFName(){
		return this.fName;
	}
	public void setLName(String name){
		this.lName = name;
	}
	public String getLName(){
		return this.lName;
	}
	
	@Override // why only use first name?
	public boolean equals(Object o) {
		Person p = (Person) o;
		return fName.equals(p.fName);
	}
	
	@Override // why onlt use first name?
	public int hashCode() {
		return fName.hashCode();
	}
	
	@Override// how about if the first name is equal?
	public int compareTo(Object o) {              //sort by first name
		Person p = (Person) o;
		return this.fName.compareTo(p.fName);
	}
	
	@Override
	public String toString(){
		String s = this.fName+" "+this.lName ;
		return s;
	}
	
	/*
	 * -- sort by map value
	 * in the main method, I define a new comparator which allow the map can be sort by the first name of a person, 
	 * which is also an attribute of the map value.
	 */
	
	public static void main(String[] args) {
		HashMap<Phone, Person> phonePersonMap = new HashMap<Phone, Person>();
		phonePersonMap.put(new Phone("111-222-3333"), new Person("Li","Lin"));
		phonePersonMap.put(new Phone("111-221-3311"), new Person("Jigang","Jia"));
		phonePersonMap.put(new Phone("121-221-3344"), new Person("Yang","Zhang"));
		phonePersonMap.put(new Phone("121-221-3044"), new Person("Apple","Pie"));
		phonePersonMap.put(new Phone("121-221-3274"), new Person("Ben","Andy"));
		System.out.println(phonePersonMap.size());
		
		Set<Entry<Phone,Person>> set = phonePersonMap.entrySet();
		ArrayList<Entry<Phone, Person>> list = new ArrayList<Entry<Phone, Person>>(set); 
		
		Collections.sort(list, new Comparator<Map.Entry<Phone, Person>>(){
			public int compare( Map.Entry<Phone, Person> o1, Map.Entry<Phone, Person> o2 ){
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		
		for(Map.Entry<Phone, Person> entry:list){
            System.out.println(entry.getKey().number + " -->"
					+ entry.getValue().toString());
        }

		
	}
}

class Phone {
	String number;

	Phone(String number) {
		this.number = number;
	}
}
