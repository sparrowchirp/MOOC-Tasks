import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        sort(array);

    }

    public static int smallest (int[] array) {
        int smallest = array[0];
        for( int temp : array) {
            if (temp < smallest) {
                smallest = temp;
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int index = 0;
        int smallest = array[0];
        int max = array.length;

        for(int i = 0; i < max; i++) {
            if (array[i] < smallest) {
                index = i;
                smallest = array[i];
            }
        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int index = startIndex;
        int smallest = table[startIndex];
        int max = table.length;

        for (int i = startIndex; i < max; i ++) {
            if (table[i] < smallest) {
                index = i;
                smallest = table[i];
            }
        }
        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        int indexOfSmallest;
        for(int i = 0; i < array.length; i++) {
            indexOfSmallest = indexOfSmallestFrom(array, i);
            swap(array, i, indexOfSmallest);
            System.out.println(Arrays.toString(array));
        }
    }
}
