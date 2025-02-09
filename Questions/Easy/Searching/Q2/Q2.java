package Searching.Q2;



/**
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

//public class Solution extends GuessGame {
//    public int guessNumber(int n) {
//
//
//        int ans1 = 12;
//        int start =0;
//        int end = n;
//        int mid = start + (end -start)/2;
//        if (n ==1 ) {
//            return n;
//        }
//        while (start <= end){
//            mid = start + (end -start)/2;
//            ans1 = guess(mid);
//            if (ans1 == 0){
//                return  mid ;
//            }
//            else if (ans1 == -1){
//                end = mid -1;
//            }
//            else {
//                start =mid +1;
//            }
//        }
//        return ans1;
//
//    }
//}