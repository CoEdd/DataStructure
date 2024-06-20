package Trash;

import java.util.Scanner;

public class TestIntMyStack {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        GenericStack<Integer> stackInt = new GenericStack<>();

        System.out.print("Enter an integer : ");
        int upperBound = input.nextInt();

        for (int i = 1; i <= upperBound; i++){
            stackInt.push(i);
        }
            
        System.out.printf("Size of stack: %d\n", stackInt.getSize());

        while (!stackInt.isEmpty()){
            System.out.printf("%d ", stackInt.pop());

        }

        input.close();

    }
}
