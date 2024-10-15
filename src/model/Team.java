package model;

public class Team {
    private String name;
    private Player[] players = new Player[2];
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

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    public Player getTeamLeader() {
        return teamLeader;
    }

    public void setTeamLeader(Player teamLeader) {
        this.teamLeader = teamLeader;
    }
}
