public class Game {
    String teamHome;
    String teamGuest;
    int teamHomePoints;
    int teamGuestPoints;
    
    public Game (String teamHome,  String teamGuest, int teamHomePoints, int teamGuestPoints) {
        this.teamHome = teamHome;
        this. teamGuest = teamGuest;
        this.teamHomePoints = teamHomePoints;
        this.teamGuestPoints = teamGuestPoints;
    }

    public String getTeamHomeName() {
        return teamHome;
    }

    public String getTeamGuestName() {
        return teamGuest;
    }

    public boolean teamIsAWinner (String team) {
        if ((team.equals(teamHome) && teamHomePoints > teamGuestPoints) || (team.equals(teamGuest) && teamHomePoints < teamGuestPoints)) {
            return true;
        } else {
            return false;
        }
    }
}