package inheritance;

public class Car extends Vehicle {
	  private String modelName = "Q3";    
	  public static void main(String[] args) {

	    Car myCar = new Car();

	    myCar.honk();

	    System.out.println(myCar.brand + " " + myCar.modelName);
	  }
}
