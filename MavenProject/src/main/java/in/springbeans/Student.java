package in.springbeans;

public class Student {
	private String name;
	private int rollno;
	private float marks;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	public void display()
	{
		System.out.println("Name is: " +name);
		System.out.println("roll no is:" +rollno);
		System.out.println("marks is:" + marks);
	}
	public Student(String name, int rollno, float marks) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.marks = marks;
	}

}
