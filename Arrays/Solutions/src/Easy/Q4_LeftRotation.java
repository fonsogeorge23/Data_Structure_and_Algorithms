package Easy;
//Given an array of integers A and multiple values in B, which represents the number of times array A needs to be left rotated.
//Find the rotated array for each value and return the result in the form of a matrix where ith row represents the rotated array
//        for the ith value in B.

//Constraint:
//        1 <= length of arrays <= 2000
//        -109 <= A[i] <= 109 (n)
//        0 <= B[i] <= 2000 (m)
//
//Input : A = [1, 2, 3, 4, 5]
//        B = [2, 3]
//
//Output: [ [3, 4, 5, 1, 2]
//        [4, 5, 1, 2, 3] ]
public class Q4_LeftRotation {
    int[][] leftRotate(int[] array, int[] rotate){
        int n = array.length;
        int m = rotate.length;
        int[][] res = new int[m][n];

        // each row will have rotate[i] times left rotated array
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                int curr = rotate[i];
                res[i][j] = array[(curr+j)%n];
            }
        }
        return res;
    }
}
