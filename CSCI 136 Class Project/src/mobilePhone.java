
public class mobilePhone {

	
		private String manufacturer;
		private String model;
		private double price;
		private String carrier;
		
	public mobilePhone(String manufacturer, String model, double price, String carrier) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.price = price;
		this.carrier = carrier;
	}
	public String call(int phoneNum) {
		return ("I am calling " + phoneNum);
	}
	
	public String text(String textMessage) {
		return textMessage;
	}
	public String toString() {
		return "The manufacturer of the phone is: " + manufacturer + "\n" +
				"The model of the phone is: " + model + "\n" + 
				"This phone costs: " + price + "\n" +
				"The carrier of the phone is: " + carrier;
	}
}
