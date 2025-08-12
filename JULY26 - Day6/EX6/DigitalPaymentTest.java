package com.wipro.threads;


public class DigitalPaymentTest {
    public static void main(String[] args) {
        Payment googlePay = new GooglePay();
        Payment phonePe = new PhonePe();
        Payment paytm = new Paytm();

        PaymentProcessor processor1 = new PaymentProcessor(googlePay);
        processor1.process(500);

        PaymentProcessor processor2 = new PaymentProcessor(phonePe);
        processor2.process(250);

        PaymentProcessor processor3 = new PaymentProcessor(paytm);
        processor3.process(1000);
    }
}
