package Task3;

public class Arrays {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        int x = array[0];
        array[0] = array[4];
        array[4] = x;

        System.out.println(array[0] + array[2]);
    }
}
