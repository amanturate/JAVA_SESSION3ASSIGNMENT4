import java.util.PrimitiveIterator.OfDouble;


public class Student {
	int rollno;
	String name;
	int marks1;
	int marks2;
	int marks3;
	int marks4;
	
	public Student(int rollno, String name, int marks1, int marks2, 
			int marks3, int marks4){
		this.rollno = rollno;
		this.name = name;
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
		this.marks4 = marks4;
	}
	
	public void totalMarks() {
		int totalMarks = marks1 + marks2 + marks3 + marks4;
		System.out.println("Total Marks are " + totalMarks);
	}
	
	public void percentage() {
		int totalMarks = marks1 + marks2 + marks3 + marks4;
		float perc = (float)totalMarks / 4;
		System.out.println("Percentage Is " + perc);
	}
}
