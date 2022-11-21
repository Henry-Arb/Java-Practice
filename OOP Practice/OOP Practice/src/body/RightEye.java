package body;

public class RightEye extends Organ{
	String name = "Right Eye", color;
	public RightEye(String condition, String color) {
		super(condition);
		this.color = color;
	}
	public String getName(){
		return name;
	}

	public String getColor() {
		return color;
	}
}
