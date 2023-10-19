package assign4;

public class Apple extends Fruit {
	
	public Apple(){
		this("red",45,"apple",true);
		
	}
	public Apple(String color, double weight, String name, boolean isFresh){
      super(color,weight,name,isFresh);
		
	}
	
	
	public String taste() {
		return "sweet n sour in taste";
	}
	
	@Override
    public String toString() {
    	return (" [ name : "+super.getName() + ", color : "+super.getColor()+", weight : "+super.getWeight() +"]");
    	
    }

}
