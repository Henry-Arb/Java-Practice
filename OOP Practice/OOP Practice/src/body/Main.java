package body;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Patient p = new Patient("Mathew",25,new LeftEye("Short sighted", "Blue"), new RightEye("Normal", "Blue"),new Heart("Normal", 65),new Stomach("PUD", true),new Skin("Burned"));
		System.out.println("Name: "+p.getName());
		System.out.println("Age: "+p.getAge());
		int choice = -1;
		while(choice != 6){
			System.out.println("Choose and organ:");
			System.out.println("1. Left Eye");
			System.out.println("2. Right Eye");
			System.out.println("3. Heart");
			System.out.println("4. Stomach");
			System.out.println("5. Skin");
			System.out.println("6. Quit");
			choice = s.nextInt();
			int option = 0;
			switch (choice){
				case 1:
					while(option != 1){
						System.out.println("Name: "+p.leftEye.getName());
						System.out.println("Color: "+p.leftEye.getColor());
						System.out.println("Condition: "+p.leftEye.getCondition());
						System.out.println("1. To Close Organ");
						option = s.nextInt();
					};
					System.out.println(p.leftEye.getName() + " Closed");
					break;
				case 2:
					while (option != 1){
						System.out.println("Name: "+p.rightEye.getName());
						System.out.println("Color: "+p.rightEye.getColor());
						System.out.println("Condition: "+p.rightEye.getCondition());
						System.out.println("1. To Close Organ");
						option = s.nextInt();
					}
					System.out.println(p.rightEye.getName() + " Closed");
					break;
				case 3:
					System.out.println("Name: "+p.heart.getName());
					System.out.println("Heart Rate: "+p.heart.getHr());
					System.out.println("Condition: "+p.heart.getCondition());
					System.out.println("1. Change Heart Rate");
					option = s.nextInt();
					if(option == 1){
						System.out.print("Enter new HR: ");
						int newHr = s.nextInt();
						p.heart.setHr(newHr);
						System.out.println("New Heart Rate set to: "+p.heart.getHr());
					}
					break;
				case 4:
					System.out.println("Name: "+p.stomach.getName());
					System.out.println("Condition: "+p.stomach.getCondition());
					p.stomach.hunger();
					if(p.stomach.isHungry()){
						System.out.println("1. Feed");
						if(s.nextInt() == 1){
							p.stomach.feed();
						}
					}
					break;
				case 5:
					System.out.println("Name: "+p.skin.getName());
					System.out.println("Condition: "+p.skin.getCondition());
					break;
				default:
					break;
			}
		};
	}
}
