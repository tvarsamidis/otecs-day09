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
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Give number " + (i + 1) + ": ");
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
        firstTeam.setTeamLeader(p4);

        Player[] players2 = new Player[2];
        players2[0] = p2;
        players2[1] = p3;
        secondTeam.setPlayers(players2);
        secondTeam.setTeamLeader(secondTeam.getPlayers()[0]);

        playGame(firstTeam, secondTeam);

    }

    private static void playGame(Team team1, Team team2) {
        Player p1 = chooseRandomPlayer(team1);
        Player p2 = chooseRandomPlayer(team2);
        int result = compareAbility(p1, p2);
        Team winningTeam = null;
        if (result < 0) {
            winningTeam = team2;
        } else if (result > 0) {
            winningTeam = team1;
        }
        System.out.println(p1.getName() + " vs. " + p2.getName());
        if (winningTeam == null) {
            System.out.println("The game was a draw");
        } else {
            System.out.println("The winning team is " + winningTeam.getName());
        }
    }

    private static int compareAbility(Player p1, Player p2) {
        if (p1.getAbility() < p2.getAbility()) {
            return -1;
        } else if (p1.getAbility() == p2.getAbility()) {
            return 0;
        } else {
            return 1;
        }
    }

    public static Player chooseRandomPlayer(Team team) {
        int position = (int) (Math.random() * team.getPlayers().length);
        Player player = team.getPlayers()[position];
        return player;
    }


}
