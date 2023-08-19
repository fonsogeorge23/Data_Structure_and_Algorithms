package Easy;

//Given an array A and an integer B. A pair(i, j) in the array is a good pair if i != j and (A[i] + A[j] == B).
//        Check if any good pair exist or not.
// Constraint:
// 1 <= A.size() <= 10^4
// 1 <= A[i] <= 10^9
// 1 <= B <= 10^9
// Input :  A = [1,2,3,4]
//          B = 7
// Output:  1
//
// Input :  A = [1,2,4]
//          B = 4
// Output:  0
//
// Input :  A = [1,2,2]
//          B = 4
// Output:  1
// Solution: Two Sum using Sorting and Two-Pointers technique

import java.util.*;

public class Q2_GoodPairs {
    int goodPair(int[] array, int sum){
        int n = array.length;
        // Sorting the array
        Arrays.sort(array);

        // using 2 pointer method to check existence
        for(int l = 0, r = n-1; l < r; ){
            int currSum = array[l] + array[r];
            if(currSum>sum){
                r--;
            }
            else if(currSum < sum){
                l++;
            }
            else{
                return 1;
            }
        }
        return 0;
    }
}
