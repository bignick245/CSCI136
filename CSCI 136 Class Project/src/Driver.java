import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner msc = new Scanner(System.in);
		String goAgain = "Yes";
		while(goAgain.equals("Yes")) {
			System.out.println("Who manufactured the phone?");
			String manufacturer = msc.nextLine();
			System.out.println("What is the model of the phone?");
			String model = msc.nextLine();
			System.out.println("What is the price of the phone?");
			double price = msc.nextDouble();
			System.out.println("Who is the carrier of the phone?");
			String carrier = msc.nextLine();
			carrier = msc.nextLine();
			mobilePhone myPhone = new mobilePhone(manufacturer, model, price, carrier);
			System.out.println(myPhone.call(406-406-4064));
			System.out.println(myPhone.text("This is a text"));
			System.out.println(myPhone.toString());
			System.out.println("Would you like to create another phone?");
			goAgain = msc.nextLine();
			
		}

	}

}
