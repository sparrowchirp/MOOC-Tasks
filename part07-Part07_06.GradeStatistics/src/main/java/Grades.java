import java.util.ArrayList;

public class Grades {

    private final int PASSING_MINIMUM = 50;
    private ArrayList<Integer> grades;
    

    public Grades() {
        this.grades = new ArrayList<>();
    }

    public void add(String gradeAsString) {
        int gradeAsInt = Integer.valueOf(gradeAsString);
        
        if (gradeAsInt >=0 && gradeAsInt <= 100) {
            this.grades.add(gradeAsInt);
        }
    }

    public double averageOfPoints() {
        double averageOfPoints;
        int sum = 0;

        for (Integer temp : grades) {
            sum += temp;
        }
        if (sum == 0) {
            return 0.0;
        }
        averageOfPoints = (double) sum / this.grades.size();
        return averageOfPoints;
    }

    private boolean isPassingGrade(int grade) {
        return  grade >= PASSING_MINIMUM;
    }

    public double averageForPassed() {
        double averageForPassed;
        int sum = 0;
        int count = 0;
        
        for (Integer temp : grades) {
            if (isPassingGrade(temp)) {
                sum += temp;
                count++;
            }
        }
        averageForPassed = (double) sum / count;
        return averageForPassed;
    }

    public double passPercentage() {
        double passPercentage;
        int passedCount = 0;
        
        for (Integer temp : grades) {
            if (isPassingGrade(temp)) {
                passedCount++;
            }
        }
        passPercentage = passedCount * 100.0 / grades.size();
        return passPercentage;
    }

    public void printGradeDistribution() {
        int[] gradeCounters = new int[6];

        for (int temp : grades) {
            int grade = convertToGrade(temp);
            gradeCounters[grade]++;
        }

        for (int i = 5; i >= 0; i--) {
            System.out.print(i + ": "); 
            printStars(gradeCounters[i]);
            System.out.println();
        }
    }

    private int convertToGrade (int points) {
        int grade = 0;

        if (points >= 0 && points < 50) {
                grade = 0;
            } else if (points >= 50 && points < 60) {
                grade = 1;
            } else if (points >= 60 && points < 70) {
                grade = 2;
            } else if (points >= 70 && points < 80) {
                grade = 3;
            } else if (points >= 80 && points < 90) {
                grade = 4;
            } else if (points >= 90 && points <= 100) {
                grade = 5;
            }
        return grade;
    }

    private void printStars(int number) {
        for(int i = 0; i < number; i++) {
            System.out.print("*");
        }
    }

    public String toString() {
        StringBuilder output = new StringBuilder();

        output.append("Point average (all): ")
              .append(averageOfPoints())
              .append("\nPoint average (passing): ");

        if (averageForPassed() == 0.0) {
            output.append(" -");
        } else {
            output.append(averageForPassed());
        }
        output.append("\nPass percentage: ")
              .append(passPercentage());

        return output.toString();
    }

    
} 


