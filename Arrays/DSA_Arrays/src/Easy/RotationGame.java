/*
Given an integer array A of size N and an integer B, you have to print the same array after rotating it B times towards the right.

Constraint:
1 <= N <= 10^5
-10^5 <= A[i] <= 10^5

Sample:
Input : 4 1 2 3 4
        2

Output: 3 4 1 2
*/
package Easy;

public class RotationGame {
    int[] RotationGame(int[] array, int rotate){
        int n = array.length;
        reverse(array, 0, n-1);
        reverse(array, 0, rotate-1);
        reverse(array, rotate, n-1);
        return array;
    }

    void reverse(int[] arr, int s, int e){
        int n = arr.length;
        while(s < e){
            arr[s] += arr[e];
            arr[e] = arr[s] - arr[e];
            arr[s] = arr[s] - arr[e];
            s++;
            e--;
        }
    }
}
