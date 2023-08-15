package Easy;

import java.util.Arrays;

public class Easy_Client {
    public static void main(String[] args) {
        int[] array = new int[]{2, 3, 6, 7, 5};
        int rotate = 2;
        RotationGame r = new RotationGame();

        r.RotationGame(array, rotate);
        System.out.println(Arrays.toString(array));
    }
}
