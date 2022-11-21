package body;

public class LeftEye extends Organ{
	String name = "Left Eye", color;
	public LeftEye(String condition, String color) {
		super(condition);
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}
}
