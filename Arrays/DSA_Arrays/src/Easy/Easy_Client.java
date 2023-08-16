package Easy;

import java.util.Arrays;

public class Easy_Client {
    public static void main(String[] args) {
        int[] array = new int[]{2, 3, 6, 7, 5};
        int rotate = 2;
        Q1_RotationGame r = new Q1_RotationGame();

        r.RotationGame(array, rotate);
//        System.out.println(Arrays.toString(array));

        Q2_GoodPairs gp = new Q2_GoodPairs();
        int res = gp.gootPair(array, 13);
        System.out.println(res);
    }
}
