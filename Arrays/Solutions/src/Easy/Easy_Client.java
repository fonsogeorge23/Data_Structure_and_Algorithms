package Easy;

import java.util.Arrays;

public class Easy_Client {
    public static void main(String[] args) {
        int[] array = new int[]{2, 3, 6, 7, 5};
        int[] B = new int[]{2, 5, 3};
        int num = 13;

//        Rotation Game Test run
//        Q1_RotationGame r = new Q1_RotationGame();
//        r.RotationGame(array, num);
//        System.out.println(Arrays.toString(array));

//        Good Pair Test run
//        Q2_GoodPairs gp = new Q2_GoodPairs();
//        int res = gp.goodPair(array, num);
//        System.out.println(res);

//          Reverse Array Test run
//        Q3_ReverseArray rev = new Q3_ReverseArray();
//        rev.reverse(array);
//        System.out.println(Arrays.toString(array));

//            Left Rotate array
            Q4_LeftRotation rot = new Q4_LeftRotation();
            int[][] res = rot.leftRotate(array, B);
            for(int[] arr: res)
                System.out.println(Arrays.toString(arr));
    }
}
