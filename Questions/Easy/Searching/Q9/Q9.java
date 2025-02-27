package Searching.Q9;
//Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.
//
//Return the kth positive integer that is missing from this array.
//
//
//
//        Example 1:
//
//Input: arr = [2,3,4,7,11], k = 5
//Output: 9
//Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.
//Example 2:
//
//Input: arr = [1,2,3,4], k = 2
//Output: 6
//Explanation: The missing positive integers are [5,6,7,...]. The 2nd missing positive integer is 6.
//
//
//Constraints:
//
//        1 <= arr.length <= 1000
//        1 <= arr[i] <= 1000
//        1 <= k <= 1000
//arr[i] < arr[j] for 1 <= i < j <= arr.length
//
//
//Follow up:
//
//Could you solve this problem in less than O(n) complexity?
public class Q9 {
    class Solution9 {
        public int findKthPositive(int[] arr, int k) {
            int num = 0;
            int pos = 0;

            int diff = arr[pos] - 1;
            for ( int l = 0; l < diff ;l++){
                pos= pos+1;
                num =num+1;
                if (pos == k){
                    return num ;
                }
            }
            for ( int i=1 ; i<arr.length; i++){
                diff = arr[i]- arr [i-1];
                for ( int j = 0; j < diff-1 ;j++){
                    pos = pos+1;
                    if(num < arr[i-1]){
                        num = arr[i-1];
                    }
                    num = num +1;
                    if (pos == k){
                        return num ;
                    }
                }
            }
            for (int m=0 ; m<k-pos ; m++){
                if(num < arr[arr.length-1]){
                    num = arr[arr.length-1];
                }
                num = num +1;
            }
            return num;
        }
    }
}
