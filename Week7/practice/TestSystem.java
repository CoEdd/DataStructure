package Week7.practice;

// import Week1.Tutorial.C;

public class TestSystem {
    public static void main(String[] args) {
        
        EntranceGateStack<Integer> enter = new EntranceGateStack<>();
        RideWaitingQueue<String> wait = new RideWaitingQueue<>();

        enter.assignGATE(4);
        enter.assignGATE(1);
        enter.assignGATE(8);

        enter.releaseGate();
        enter.releaseGate();
        enter.releaseGate();


        System.out.println(enter.checkTopGate());
        System.out.println(enter.isStackEmpty());


        wait.joinWaitingLine("amirul");
        wait.joinWaitingLine("syakir");
        wait.joinWaitingLine("aidill");
        wait.joinWaitingLine("coedd");

        wait.completeRide();
        wait.completeRide();

        System.out.println(wait.getSize());

        System.out.println(wait.viewNextTicketNumber());







    }
}
