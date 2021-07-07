package Decorator;

public class Driver {

	public static void main(String[] args) {
		ICar car = new Suzuki();
		
		CarDecorator decorator = new OfferedPrice(car);
		
		System.out.println("Original Price : " + decorator.getPrice());
		System.out.println("Discounted Price : " + decorator.getDiscountedPrice());
	}
}
