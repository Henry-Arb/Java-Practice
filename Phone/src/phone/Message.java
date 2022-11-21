package phone;

import java.util.ArrayList;

public class Message {
	static ArrayList<Message> messages= new ArrayList<>();
	private String message;

	private Message(String message){
		this.message = message;
	}

	public static void createMessage(String msg){
		messages.add(new Message(msg));
	}

	public String getMessage(){
		return this.message;
	}

	public static ArrayList returnMessages(){
		return messages;
	}
}
