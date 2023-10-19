package question3;

public class Main1 {
	public static <T> T add(T a ,T b) {
		T res = a.
		return res;
		
	}
	public static void main(String args[]) {
		 class Point{
			int x;
			int y;
			
			
			
			public static int getX() {
				return x;
			}



			public void setX(int x) {
				this.x = x;
			}



			public int getY() {
				return y;
			}



			public void setY(int y) {
				this.y = y;
			}



			public Point(int x, int y){
				this.x =x;
				this.y =y;
				
				
			}
			
			
		}
		
		Point p =new Point(2,3);
		Point p1 =new Point(1,2);
		Main1.<Point>add(p, p1);
		
		
		
		
	}

}
