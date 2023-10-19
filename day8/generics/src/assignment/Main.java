package assignment;

 class Box<T extends Employee> {
	 
	
	private T obj;         //T - employee

	
	public void set(T obj) {
		 this.obj=obj;
			
	}
	
	public T get() {
		return this.obj;
	}
	
	public double getTotalSalary() {
		return this.obj.calculateSalary();
	}
	
	

}
 public class Main{
	 public static void main(String args[]){
		 
		 Manager m = new Manager();
		 m.acceptData();
		 m.displayData();
		 
		 Box<Manager> e = new Box<Manager>();
		 e.set(m);
		 System.out.println("Total Salary :"+e.getTotalSalary());
		 
		 Salesman s = new Salesman();
		 s.acceptData();
		 s.displayData();
		 
		 Box<Salesman> e1 = new Box<Salesman>();
		 e1.set(s);
		 System.out.println("Total Salary:"+e1.getTotalSalary());
		 
	 }
 
 }

