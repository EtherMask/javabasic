package exercise;

public class Student extends Human{

	String number;
	String major;

	Student() {
		number = "";
		major = "";
	}
	Student(String name, int age, int height, int weight, String number, String major) {
		super(name, age, height, weight);
		this.number = number;
		this.major = major;
	}

	public String printInformation() {
		String nall = name+" "+age+" "+height+" "+weight+" "+number+" "+major;

		return nall;
	}
}
