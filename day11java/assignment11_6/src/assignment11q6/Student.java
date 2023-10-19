package assignment11q6;

import java.util.Scanner;

public class Student {
	
	private int studId;
	private String name;
	private int rollno;
	
	
	public Student() {
	}


	public Student(int studId, String name, int rollno) {
		this.studId = studId;
		this.name = name;
		this.rollno = rollno;
	}


	public int getStudId() {
		return studId;
	}


	public void setStudId(int studId) {
		this.studId = studId;
	}


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
	

	public void accept(Scanner sc) {
		System.out.println("Enter student Details to add");
		
		System.out.println("enter studId");
		this.studId = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("enter name");
		this.name = sc.nextLine();
		
		System.out.println("enter rollno");
		this.rollno = sc.nextInt();
	}


	@Override
	public String toString() {
		return "Student [studId=" + studId + ", name=" + name + ", rollno=" + rollno + "]";
	}
	
	
	
	

}
