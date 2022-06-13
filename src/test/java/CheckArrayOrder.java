import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckArrayOrder {


    public static void main(String[] args) {
        assertTrue(checkArrayOrder(new int[]{1, 2, 3, 5}), "not in order");
    }

    public static boolean checkArrayOrder(int[] array) {

        for (int i = 0; i < array.length - 1; i++)
            if (!(array[i] < array[i + 1])) return false;
        return true;
    }
}
