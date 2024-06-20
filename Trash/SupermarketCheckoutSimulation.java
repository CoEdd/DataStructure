package Trash;

import java.util.*;

// Checkout Counter Management (Stack)
class CheckoutCounterStack {
    private Stack<Integer> stack;
    private int maxCounters;

    public CheckoutCounterStack(int maxCounters) {
        this.stack = new Stack<>();
        this.maxCounters = maxCounters;
    }

    public void openCheckoutCounter(int counterNumber) {
        if (!isStackFull()) {
            stack.push(counterNumber);
            System.out.println("Checkout counter " + counterNumber + " opened.");
        } else {
            System.out.println("Checkout counter stack is full. Cannot open more counters.");
        }
    }

    public void closeCheckoutCounter() {
        if (!isStackEmpty()) {
            int closedCounter = stack.pop();
            System.out.println("Checkout counter " + closedCounter + " closed.");
        } else {
            System.out.println("Checkout counter stack is empty. No counter to close.");
        }
    }

    public int viewTopCheckoutCounter() {
        if (!isStackEmpty()) {
            return stack.peek();
        } else {
            System.out.println("Checkout counter stack is empty.");
            return -1;
        }
    }

    public boolean isStackEmpty() {
        return stack.isEmpty();
    }

    public boolean isStackFull() {
        return stack.size() == maxCounters;
    }
}

// Customer Checkout Line (Queue)
class CustomerCheckoutQueue {
    private Queue<String> queue;
    private int maxCapacity;

    public CustomerCheckoutQueue(int maxCapacity) {
        this.queue = new LinkedList<>();
        this.maxCapacity = maxCapacity;
    }

    public void joinCheckoutLine(String customerName) {
        if (!isQueueFull()) {
            queue.offer(customerName);
            System.out.println(customerName + " joined the checkout line.");
        } else {
            System.out.println("Checkout queue is full. " + customerName + " cannot join the line.");
        }
    }

    public void processCheckout() {
        if (!isQueueEmpty()) {
            String processedCustomer = queue.poll();
            System.out.println(processedCustomer + " completed checkout.");
        } else {
            System.out.println("Checkout queue is empty. No customer to process.");
        }
    }

    public String viewNextCustomer() {
        if (!isQueueEmpty()) {
            return queue.peek();
        } else {
            System.out.println("Checkout queue is empty.");
            return null;
        }
    }

    public boolean isQueueEmpty() {
        return queue.isEmpty();
    }

    public boolean isQueueFull() {
        return queue.size() == maxCapacity;
    }
}

// Testing and Verification
public class SupermarketCheckoutSimulation {
    public static void main(String[] args) {
        // Initialize checkout counter stack with maximum capacity of 3 counters
        CheckoutCounterStack counterStack = new CheckoutCounterStack(3);

        // Initialize checkout queue with maximum capacity of 5 customers per line
        CustomerCheckoutQueue checkoutQueue = new CustomerCheckoutQueue(5);

        // Simulate opening checkout counters
        counterStack.openCheckoutCounter(1);
        counterStack.openCheckoutCounter(2);
        counterStack.openCheckoutCounter(3);

        // Simulate customers joining checkout lines
        checkoutQueue.joinCheckoutLine("Alice");
        checkoutQueue.joinCheckoutLine("Bob");
        checkoutQueue.joinCheckoutLine("Charlie");
        checkoutQueue.joinCheckoutLine("David");
        checkoutQueue.joinCheckoutLine("Eve");

        // Simulate processing checkout
        checkoutQueue.processCheckout();
        checkoutQueue.processCheckout();
        checkoutQueue.processCheckout();
        checkoutQueue.processCheckout();
        checkoutQueue.processCheckout();

        // Simulate closing checkout counters
        counterStack.closeCheckoutCounter();
        counterStack.closeCheckoutCounter();
        counterStack.closeCheckoutCounter();
    }
}

