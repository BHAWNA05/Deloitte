package designp;

public class Bank {
public static void main(String[] args) {
	Payment payment = Payment.getPaymentObject();
	payment.pay(10000);

	Payment payment2 = Payment.getPaymentObject();
	payment2.pay(14000);

	Payment payment3 = Payment.getPaymentObject();
	payment3.pay(19000);
}
}
