package Easy;

//You are given a constant array A. You are required to return another array which is the reversed form of the input array.
//
//Constraints:
//        1 <= A.size() <= 10000
//        1 <= A[i] <= 10000
//
//
// Input 1: A = [1,2,3,2,1]
// Output:      [1,2,3,2,1]
//
// Input 2: A = [1,1,10]
// Output:      [10,1,1]
public class Q3_ReverseArray {
    void reverse(int[] array){
        int n = array.length;
        for(int l = 0, r = n-1; l < r; l++, r--){
            swap(array, l, r);
        }
    }

    void swap(int[] arr, int s, int e){
        arr[s] += arr[e];
        arr[e] = arr[s] - arr[e];
        arr[s] = arr[s] - arr[e];
    }
}
