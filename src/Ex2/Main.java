package Ex2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Transaction transaction1 = new Transaction("Peter", "Sam", 100L);
        Transaction transaction2 = new Transaction("Sam", "Dave", 800L);
        Transaction transaction3 = new Transaction("Sam", "Dave", 800L);
        Transaction transaction4 = new Transaction("Dave", "Peter", 800L);

        System.out.println(transaction1);
        System.out.println(transaction2);
        System.out.println(transaction3);
        Block firstBlock = new Block(0, Arrays.asList(transaction1, transaction2));
        System.out.println(firstBlock.hashCode());
        Block secondBlock = new Block(firstBlock.hashCode(), Arrays.asList(transaction3));
        System.out.println(secondBlock.hashCode());
        Block thirdBlock = new Block(secondBlock.hashCode(), Arrays.asList(transaction4));
        System.out.println(thirdBlock.hashCode());



    }
}
