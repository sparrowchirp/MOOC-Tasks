
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        int countOfStars;
        for (int i = 0; i < array.length; i++) {
            countOfStars = array[i];
            for (int k = 1; k <= countOfStars; k++) {
                 System.out.print("*");
            }
            System.out.println();
        }
    }

}
