import java.util.Arrays;

public class MainSort {
    public static void main(String[] args) {
        int [] numArray = {7, 3, 2, 8, 9, 4, 6, 1, 5};

        MySort test = new MySort();

//        test.insertSorting(numArray);
        test.insertSortPython(numArray);
        System.out.println(Arrays.toString(numArray));
    }
}
