package designp;

public class Payment {
	private static Payment payment = new Payment(); //singleton design pattern
	private Payment()
	{
		System.out.println("Memory allocated");
	}
	public static Payment getPaymentObject()
	{
		return payment;
	}
	public void pay(int amount)
	{
		System.out.println("Payment donhe for INR: " +amount);
	}

}
