import model.Player;
import model.Team;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

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

//        firstTeam.getPlayers()[0] = p1;
//        firstTeam.getPlayers()[1] = p4;
        List<Player> members = firstTeam.getPlayers();
        members.add(p1);
        members.add(p2);
        //members.clear();
        members.add(1, p1);
        members.remove(0);
        System.out.println(members.size());

        firstTeam.setTeamLeader(p4);

        Player firstPlayer = members.get(0);


        List<Player> players2 = List.of(p2, p3);

        secondTeam.setPlayers(players2);



        secondTeam.setTeamLeader(secondTeam.getPlayers().get(0));

        playGame(firstTeam, secondTeam);


        for (int i = 0; i < members.size(); i++) {
            Player p = members.get(i);
            System.out.println("The team also has player " + p.getName());
        }

        for (Player p: members) {
            System.out.println("The team also has player " + p.getName());
        }

        Set<Player> people = new HashSet<>();


    }

    private static void playGame(Team team1, Team team2) {
        Player p1 = team1.chooseRandomPlayer();
        Player p2 = team2.chooseRandomPlayer();
        int result = p1.compareAbility(p2);
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




}
