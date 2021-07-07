package Decorator;

public class OfferedPrice extends CarDecorator{

	public OfferedPrice(ICar car) {
		super(car);
	}

	@Override
	public double getDiscountedPrice() {
		
		return 0.8 * this.getPrice();
	}
	
}
