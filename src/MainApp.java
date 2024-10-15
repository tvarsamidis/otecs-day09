import model.Player;
import model.Team;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        runTeamsDemo();

        // runScannerDemo();

    }

    private static void runScannerDemo() {
        int[] numbers = new int[2];
        String[] names = new String[2];

        System.out.println(numbers[0]);
        System.out.println(names[0]);

        Scanner scanner = new Scanner(System.in);
        for (int i = 0 ; i < numbers.length; i++) {
            System.out.print("Give number " + (i+1) + ": ");
            numbers[i] = scanner.nextInt();
        }
    }

    private static void runTeamsDemo() {
        Player p1 = new Player("Dimitris", 600);
        Player p2 = new Player("Dora", 601);
        Player p3 = new Player("Thomas", 2);
        Player p4 = new Player("Aaron", 599);
        Team firstTeam = new Team("OTE Career Shift");
        Team secondTeam = new Team("Ampelokipi Power");

        firstTeam.getPlayers()[0] = p1;
        firstTeam.getPlayers()[1] = p4;

        Player[] players2 = new Player[2];
        players2[0] = p2;
        players2[1] = p3;
        secondTeam.setPlayers(players2);


        System.out.println( firstTeam.getPlayers()[1].getAbility());

    }


}
