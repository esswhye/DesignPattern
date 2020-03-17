package Singleton.Scrabble;

public class ScrabbleTest {

    public static void main(String[] args) {

        Scrabble newInstance = Scrabble.getInstance();

        System.out.println("Card size " +newInstance.getTotalLength());

        System.out.println("First instance ID: " + System.identityHashCode(newInstance));

        System.out.println(newInstance.getLetterList());

        System.out.println("P1 tiles: "+newInstance.getTiles(7));

        System.out.println("Card size " +newInstance.getTotalLength());

        Scrabble instanceTwo = Scrabble.getInstance();

        System.out.println("Second instance ID: " + System.identityHashCode(instanceTwo));

        System.out.println(instanceTwo.getLetterList());

        System.out.println("P2 tiles: "+instanceTwo.getTiles(7));

        System.out.println("Cards left: " + newInstance.getLetterList());

        System.out.println("Card size " +newInstance.getTotalLength());


    }
}
