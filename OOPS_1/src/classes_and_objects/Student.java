package classes_and_objects;

public class Student {
	
	public String name;
	final private int rollNumber;
	private static int numStudents;
	
//	public Student(String n) {
//		name=n;
//	}
	
	public Student(String name, int rollNumber) {
		
		this.name=name;
		this.rollNumber=rollNumber;
		numStudents+=1;
	}
	
	public int getRollNumber() {
		return rollNumber;
	}
	
//	public void setRollNumber(int rn) {
//		
//		if(rn<=0) {
//			return;
//		}
//		rollNumber=rn;
//	}
	
	public static int getNumStudents() {
		return numStudents;
	}
	
	public void print() {
		System.out.println(name+" : "+rollNumber);
	}
}
