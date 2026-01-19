
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
        int gamesCounter = 0;
        int wins = 0;
        int losses = 0;

        try {
            Scanner fileReader = new Scanner(Paths.get(file));
            while (fileReader.hasNextLine()) {
                String[] parts = fileReader.nextLine().split(",");
                String teamHome = parts[0];
                String teamGuest = parts[1];
                int teamHomePoints = Integer.valueOf(parts[2]);
                int teamGuestPoints = Integer.valueOf(parts[3]);

                if (teamHome.equals(team)||teamGuest.equals(team)) {
                    gamesCounter++;
                    if ((team.equals(teamHome) && teamHomePoints > teamGuestPoints) || (team.equals(teamGuest) && teamHomePoints < teamGuestPoints)) {
                        wins++;
                    } else if ((team.equals(teamHome) && teamHomePoints < teamGuestPoints) || (team.equals(teamGuest) && teamHomePoints > teamGuestPoints)) {
                        losses++;
                    }
                }
                
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Games: " + gamesCounter);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }

}
