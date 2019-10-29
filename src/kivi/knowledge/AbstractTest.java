package kivi.knowledge;

public class AbstractTest {

	public static void main(String[] args) {
		BasicTeacher bt = new BasicTeacher();
		bt.teach();

	}
}

abstract class Teacher {
	String name;
	int age;
	String gender;

	public abstract void teach();
}

class BasicTeacher extends Teacher {
	public void teach() {
		System.out.println("BasicTeacher");
	}
}

class JobTeacher extends Teacher {
	public void teach() {
		System.out.println("JobTeacher");
	}
}