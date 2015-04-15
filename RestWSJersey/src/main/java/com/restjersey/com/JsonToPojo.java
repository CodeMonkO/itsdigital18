package main.java.com.restjersey.com;

public class JsonToPojo {
	private Tutorials tutorials;

	public Tutorials getTutorials() {
		return tutorials;
	}

	public void setTutorials(Tutorials tutorials) {
		this.tutorials = tutorials;
	}

	@Override
	public String toString() {
		return "ClassPojo [tutorials = " + tutorials + "]";
	}

}
