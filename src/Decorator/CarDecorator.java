package Decorator;

public abstract class CarDecorator implements ICar{
	
	private ICar car;
	
	public CarDecorator(ICar car) {
		this.car = car;
	}
	
	@Override
	public String make() {
		return car.make();
	};
	
	@Override
	public double getPrice() {
		return car.getPrice();
	}
	
	// desired new functionality without disturbing legacy code
	public abstract double getDiscountedPrice();
	
}
