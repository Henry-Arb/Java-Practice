package phone;

import java.util.ArrayList;

public class Contact {
	static ArrayList<Contact> contacts = new ArrayList<>();
	private final String name;
	private final int number;

	public static void addContact(Contact c){
		contacts.add(c);
	}

	public static void deleteContact(int i){
		contacts.remove((i-1));
	}

	public static Contact searchContact(String name){
		for(Contact c : contacts){
			if(c.name.equals(name)){
				return c;
			}
		}
		return null;
	}

	public static ArrayList getContact(){
		return contacts;
	}

	public String getName(){
		return this.name;
	}

	public int getNumber(){
		return this.number;
	}
	public Contact(String name, int number){
		this.name = name;
		this.number = number;
	}
}
