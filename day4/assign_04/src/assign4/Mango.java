package assign4;

public class Mango extends Fruit {
	
	public Mango(){
		this("yellow",50,"Mango",true);
		
	}
	public Mango(String color, double weight, String name, boolean isFresh){
      super(color,weight,name,isFresh);
		
	}
	
	public String taste() {
		return "sweet in taste";
	}
	
	
	
	
	
	  
	@Override
    public String toString() {
    	return (" [ name : "+super.getName() + ", color : "+super.getColor()+", weight : "+super.getWeight() +"]");
    	
    }

}
