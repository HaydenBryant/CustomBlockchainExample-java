package Ex1;

import java.util.ArrayList;

public class Main {

    public static void main(String args[]){

        ArrayList<Block> blockChain = new ArrayList<Block>();

        String[] initial = {"Hayden has $600", "Cliff has $500"};
        Block firstBlock = new Block(initial, 0);
        blockChain.add(firstBlock);
        System.out.println("First Ex1.Block" + firstBlock.toString());
        System.out.println(blockChain.toString());


        String[] haydenGives = {"Hayden gives tim $40", "Hayden gives dave $100"};
        Block secondBlock = new Block(haydenGives, firstBlock.getBlockHash());
        blockChain.add(secondBlock);
        System.out.println("second Ex1.Block" + secondBlock.toString());
        System.out.println(blockChain.toString());

        String[] haydenGets = {"Hayden gets $60", "Hayden gets $10"};
        Block thirdBlock = new Block(haydenGets, secondBlock.getBlockHash());
        blockChain.add(thirdBlock);
        System.out.println("third Ex1.Block" + thirdBlock.toString());
        System.out.println(blockChain.toString());

    }
}
