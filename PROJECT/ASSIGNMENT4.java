
public class ASSIGNMENT4 {

	public static void main(String[] args) {
		
		System.out.println("Details about the students are :");
		
		System.out.println("*******************************************");
		
		Student st1 = new Student(001, "Aman", 80, 88, 90, 77);
		System.out.println("Roll No. " + st1.rollno);
		System.out.println("Name : " + st1.name);
		System.out.println("Marks in Subject 1 : " + st1.marks1);
		System.out.println("Marks in Subject 2 : " + st1.marks2);
		System.out.println("Marks in Subject 3 : " + st1.marks3);
		System.out.println("Marks in Subject 4 : " + st1.marks4);
		st1.totalMarks();
		st1.percentage();
		
		System.out.println("*******************************************");
		
		Student st2 = new Student(002, "Shanky", 70, 89, 99, 67);
		System.out.println("Roll No. " + st2.rollno);
		System.out.println("Name : " + st2.name);
		System.out.println("Marks in Subject 1 : " + st2.marks1);
		System.out.println("Marks in Subject 2 : " + st2.marks2);
		System.out.println("Marks in Subject 3 : " + st2.marks3);
		System.out.println("Marks in Subject 4 : " + st2.marks4);
		st2.totalMarks();
		st2.percentage();
		
		System.out.println("*******************************************");
		
		Student st3 = new Student(003, "Monu", 89, 79, 89, 97);
		System.out.println("Roll No. " + st3.rollno);
		System.out.println("Name : " + st3.name);
		System.out.println("Marks in Subject 1 : " + st3.marks1);
		System.out.println("Marks in Subject 2 : " + st3.marks2);
		System.out.println("Marks in Subject 3 : " + st3.marks3);
		System.out.println("Marks in Subject 4 : " + st3.marks4);
		st3.totalMarks();
		st3.percentage();
		
		System.out.println("*******************************************");
	}
}
