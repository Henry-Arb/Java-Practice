package body;

public class Stomach extends Organ{
	String name = "Stomach";
	boolean isHungry;
	public Stomach(String condition, boolean isHungry) {
		super(condition);
		this.isHungry = isHungry;
	}
	public String getName() {
		return name;
	}

	public boolean isHungry(){
		return this.isHungry;
	}

	public void hunger(){
		if(isHungry){
			System.out.println("Needs to be fed");
		}
		else{
			System.out.println("Is full");
		}
	}

	public void feed(){
		System.out.println("Digesting begin!");
	}
}
