package model;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
//    private Player[] players = new Player[2];
    private List<Player> players = new ArrayList<Player>();
    private Player teamLeader;

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public Player[] getPlayers() {
//        return players;
//    }

    public List<Player> getPlayers() {
        return players;
    }

//    public void setPlayers(Player[] players) {
//        this.players = players;
//    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Player getTeamLeader() {
        return teamLeader;
    }

    public void setTeamLeader(Player teamLeader) {
        this.teamLeader = teamLeader;
    }

    public Player chooseRandomPlayer() {
//        int position = (int) (Math.random() * players.length);
//        Player player = players[position];
        int position = (int) (Math.random() * players.size());
        Player player = players.get(position);
        return player;
    }

}
