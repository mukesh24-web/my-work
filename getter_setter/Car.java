package getter_setter;

public class Car {
	private final String model;
	// if we add final we can't change variable
	private String color;
	private int price;
	
	Car(String model,String color,int price){
		this.model = model;
		this.color = color;
		this.price = price;
	}
	
	String getModel() {
		return this.model;
	}
	String getColor() {
		return this.color;
	}
	int getPrice() {
		return this.price;
	}
	
	/* void setModel(String model) {
		this.model = model;
	} */
	
	void setColor(String color) {
		this.color = color;
	}
	
	void setPrice(int price) {
		this.price = price;
	}
}
