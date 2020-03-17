package Singleton.Scrabble;

import java.util.LinkedList;

public class ScrabbleTestThread {

    public static void main(String[] args) {
        Runnable getTiles = new GetTheTiles();

        Thread t1 = new Thread(getTiles);
        Thread t2 = new Thread(getTiles);

        t1.start();
        t2.start();

    }

}

class GetTheTiles implements Runnable{

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName());


        Scrabble newInstance = Scrabble.getInstance();

        System.out.println("Instance "+ Thread.currentThread().getName() +
                " " +System.identityHashCode(newInstance));

        System.out.println(newInstance.getLetterList());

        LinkedList<String> playerTiles = newInstance.getTiles(7);

        System.out.println(Thread.currentThread().getName() +" gets :" + playerTiles);

        System.out.println("Cards left: " + newInstance.getTotalLength());

    }
}
