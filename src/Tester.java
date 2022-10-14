import java.util.Arrays;

/**
 * @author Drumstyle92
 * Class that contains the entire program.
 */
public class Tester {
    /**
     * @param args main parameter.
     * main method that contains an array, modification of the same and then printed.
     */
    public static void main(String[] args) {

        String[] arr = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println("-------------------------------Array----------------------------");
        for (int i = 0; i < arr.length; i += 2) {
            arr[i] = arr[i].toUpperCase();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("----------------------------------------------------------------");
    }
}