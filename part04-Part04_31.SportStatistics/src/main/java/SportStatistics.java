
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Filename: ");
        String file = scan.nextLine();
        System.out.print("Team name: ");
        String team = scan.nextLine();
       
        ArrayList<Game> games = readingFromFile(file);
        ArrayList<Game> gamesOfTeam = new ArrayList<>();

        for (Game temp : games) {
            String teamHome = temp.getTeamHomeName();
            String teamGuest = temp.getTeamGuestName();

            if (team.equals(teamHome) || team.equals(teamGuest)) {
               gamesOfTeam.add(temp);
            }
        }

        int wins = 0;
        int losses = 0;
        for (Game temp : gamesOfTeam) {
            if (temp.teamIsAWinner(team) == true) {
                wins++;
            } else {
                losses++;
            }
        }

        System.out.println("Games: " + gamesOfTeam.size());
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }
    
    public static ArrayList<Game> readingFromFile(String file) {
        ArrayList<Game> games = new ArrayList<>();
        try {
            Scanner fileReader = new Scanner(Paths.get(file));
            while (fileReader.hasNextLine()) {
                String[] parts = fileReader.nextLine().split(",");
                String teamHome = parts[0];
                String teamGuest = parts[1];
                int teamHomePoints = Integer.valueOf(parts[2]);
                int teamGuestPoints = Integer.valueOf(parts[3]);
                Game game = new Game(teamHome, teamGuest, teamHomePoints, teamGuestPoints);
                games.add(game);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return games;
    }


}
