package phone;

import java.util.ArrayList;
import java.util.Scanner;

public class Phone{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Good Morning! Welcome to the phone simulator!");
		int choice = -1;
		while(choice != 3){
			System.out.println("Please choose one of the following options: ");
			System.out.println("\t1. Manage Contacts \n\t2. Messages \n\t3. Quit");
			choice = s.nextInt();
			int option = -1;
			switch (choice){
				case 1:
				while (option != 5) {
					System.out.println("\t1. Show all contacts \n\t2. Add a new contact \n\t3. Search for a new contact \n\t4. Delete a contact \n\t5. Go back to the previous menu");
					option = s.nextInt();
					switch (option) {
						case 1:
							ArrayList<Contact> tmp = Contact.getContact();
							int index = 1;
							for (Contact c : tmp) {
								System.out.print(index+". Name: " + c.getName() + " | ");
								System.out.println("Phone Number: " + c.getNumber());
								index++;
							}
							break;
						case 2:
							String name;
							int number;

							System.out.println("Please enter the contact: ");
							System.out.println("Name: ");
							name = s.next();
							System.out.println("Number: ");
							number = s.nextInt();
							Contact c = new Contact(name, number);
							Contact.addContact(c);

							break;
						case 3:
							String name1;
							System.out.print("Enter the name: ");
							name1 = s.next();
							if(Contact.searchContact(name1) != null){
								Contact x = Contact.searchContact(name1);
								System.out.print("Name: " + x.getName() + " | ");
								System.out.println("Phone Number: " + x.getNumber());
							}
							else {
								System.out.println("User does not exist...");
							}
							break;
						case 4:
							System.out.print("Select index of user to delete: ");
							Contact.deleteContact(s.nextInt());
						default:
							break;
					}
				}
				break;
				case 2:
					while(option != 3){
						System.out.println("\t1. See the list of all messages \n\t2. Send a new message \n\t3. Go back to previous menu");
						option = s.nextInt();
						s.nextLine();
						switch (option){
							case 1:
								ArrayList<Message> tmp = Message.returnMessages();
								for (Message m : tmp){
									System.out.println(m.getMessage());
								}
								break;
							case 2:
								System.out.println("Send a new message: ");
								String message = s.nextLine();
								Message.createMessage(message);
								break;
							default:
								break;
						}
					}
			}

		}
	}
}
