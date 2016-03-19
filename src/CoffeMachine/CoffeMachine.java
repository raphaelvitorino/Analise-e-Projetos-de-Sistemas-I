package CoffeMachine;

public class CoffeMachine {
	
	public Coffe prepareNewCoffe(String type){
		Coffe coffe = new Coffe();
		coffe.setType(type);
		return coffe;
	}
	
}
