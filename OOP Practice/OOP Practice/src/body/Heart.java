package body;

public class Heart extends Organ{
	String name = "Heart";
	int hr;
	public Heart(String condition, int hr) {
		super(condition);
		this.hr = hr;
	}

	public String getName() {
		return name;
	}

	public int getHr() {
		return hr;
	}


	public void setHr(int i){
		this.hr = i;
	}
}
