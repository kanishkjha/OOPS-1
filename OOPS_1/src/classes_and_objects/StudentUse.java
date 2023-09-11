package classes_and_objects;
import java.util.Scanner;

public class StudentUse {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println(Student.getNumStudents());
		
		Student s1= new Student("Ankush", 123);
		System.out.println(Student.getNumStudents());
		
		Student s2= new Student("Manisha", 121);
		System.out.println(Student.getNumStudents());
		
		s1.print();
		s2.print();

	}

}
