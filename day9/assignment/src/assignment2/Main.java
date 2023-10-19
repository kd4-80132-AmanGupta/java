package assignment2;

public class Main {
	public static <T extends Number> T findMin(T arr[]) {
		T smallest = arr[0];
		for(T ele : arr) {
				if(ele.doubleValue()< smallest.doubleValue())
					smallest=ele;
			}
		return smallest;
		
	}
	public static void main(String args[]) {
		
		
		Integer arr[] = {3,5,2,7,9,8};
		System.out.println(Main.findMin(arr));
		
	}

}
