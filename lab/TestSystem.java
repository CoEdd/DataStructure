package lab;

public class TestSystem {
    public static void main(String[] args) {
        
        CheckoutCounterStack<Integer> comer = new CheckoutCounterStack<>(4);
        CustomerCheckoutQueue<String> jiu = new CustomerCheckoutQueue<>(4);

        System.out.println("Scenario at counter : ");
        System.out.println();

        System.out.println("Open checkout counter is now 1, 2, 3 and 4");

        comer.openCheckoutCounter(1);
        comer.openCheckoutCounter(2);
        comer.openCheckoutCounter(3);
        comer.openCheckoutCounter(4);

        System.out.println("\n3 counter will be closed ");

        comer.closeCheckoutCounter();
        comer.closeCheckoutCounter();
        comer.closeCheckoutCounter();

        System.out.print("\nNext Counter : ");
        System.out.println(comer.viewTopCheckoutCounter());

        System.out.print("Is all Counter not open : ");
        System.out.println(comer.isStackEmpty());

        System.out.print("Is all counter open : ");
        System.out.println(comer.isStackFull());

        System.out.println("\n\"Counter 2, 3, 4 will be open\"");

        comer.openCheckoutCounter(2);
        comer.openCheckoutCounter(3);
        comer.openCheckoutCounter(4);

        System.out.print("Is all Counter open :");
        System.out.println(comer.isStackFull());
        System.out.println();

        System.out.println("Scenario at queue :");
        System.out.println();

        System.out.println("\"Four customer comes in queue\"");
        jiu.joinCheckoutLine("Amirul");
        jiu.joinCheckoutLine("Hafis");
        jiu.joinCheckoutLine("Sayyid");
        jiu.joinCheckoutLine("Syakir");

        System.out.println("\"After A while two customer finish the checkout process\"");
        jiu.processCheckout();
        jiu.processCheckout();

        System.out.print("Next Customer : ");
        System.out.println(jiu.viewNextCustomer());

        System.out.print("Is queue Empty : ");
        System.out.println(jiu.isQueueEmpty());

        System.out.print("Is queue full : ");
        System.out.println(jiu.isQueueFull());

        System.out.print("How many people are in queue now : ");
        System.out.println(jiu.getSize());

        System.out.println("\n\"Now two customer comes in queue\"");
        jiu.joinCheckoutLine("Lim");
        jiu.joinCheckoutLine("Matthew");

        System.out.print("Is Queue Full : ");
        System.out.println(jiu.isQueueFull());



    }
}
