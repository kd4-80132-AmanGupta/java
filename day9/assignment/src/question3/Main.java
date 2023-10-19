package question3;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String args[]) {
		
		class StudentComparator implements Comparator<Student>{
			
			public int compare(Student s1, Student s2) {
				int diff = -s1.getCity().compareTo(s2.getCity());
				if(diff == 0) {
					diff = -Double.compare(s1.getMarks(),s2.getMarks());
					if(diff == 0) 
						diff = s1.getName().compareTo(s2.getName());
				}
				return diff;
			}
		}
		
		
		
		Student s[] = new Student[6];
		s[0] = new Student(1,"shyam","pune",76.6);
		s[1] = new Student(3,"ram","bhilai",66.4);
		s[2] = new Student(5,"kunal","durg",56.8);
		s[3] = new Student(2,"kunal","durg",56.8);
		s[4] = new Student(6,"shivansh","pune",87.2);
		s[5] = new Student(4,"somesh","pune",68.3);
		
		StudentComparator sc = new StudentComparator();
		
		Arrays.sort(s,sc);
		
		for(Student stud : s)
			System.out.println(stud);
		
	}
	

}
