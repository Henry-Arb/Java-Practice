package body;

public class Patient {
	String name;
	int age;
	LeftEye leftEye;
	RightEye rightEye;
	Heart heart;
	Stomach stomach;
	Skin skin;

	public Patient(String name, int age, LeftEye leftEye, RightEye rightEye, Heart heart, Stomach stomach, Skin skin) {
		this.name = name;
		this.age = age;
		this.leftEye = leftEye;
		this.rightEye = rightEye;
		this.heart = heart;
		this.stomach = stomach;
		this.skin = skin;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}
