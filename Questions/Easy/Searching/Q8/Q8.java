package Searching.Q8;
//You are given an array of characters letters that is sorted in non-decreasing order, and a character target. There are at least two different characters in letters.
//
//Return the smallest character in letters that is lexicographically greater than target. If such a character does not exist, return the first character in letters.
//
//
//
//        Example 1:
//
//Input: letters = ["c","f","j"], target = "a"
//Output: "c"
//Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'.
//Example 2:
//
//Input: letters = ["c","f","j"], target = "c"
//Output: "f"
//Explanation: The smallest character that is lexicographically greater than 'c' in letters is 'f'.
//Example 3:
//
//Input: letters = ["x","x","y","y"], target = "z"
//Output: "x"
//Explanation: There are no characters in letters that is lexicographically greater than 'z' so we return letters[0].
//
//
//Constraints:
//
//        2 <= letters.length <= 104
//letters[i] is a lowercase English letter.
//letters is sorted in non-decreasing order.
//letters contains at least two different characters.
//target is a lowercase English letter.

public class Q8 {
    class Solution8 {
        public char nextGreatestLetter(char[] letters, char target) {
            int start=0;
            int end = letters.length-1;
            int mid = start + (end - start)/2;
            while (start <= end){
                mid = start + (end - start)/2;
                if (letters[mid] == target  && mid+1 < letters.length && letters[mid + 1] == target){

                    start = mid +1;
                    continue;
                }
                if (letters[mid] == target && mid+1 < letters.length ){
                    return letters[mid+1];
                }
                if (letters [mid] == target && mid + 1 >= letters.length){
                    return letters[0];
                }
                if (letters[mid] < target){
                    start = mid +1;
                }
                if (letters[mid] > target){
                    end = mid -1;
                }

            }
            if ( start+1 < letters.length){
                return letters[start];
            }
            if ( letters[end] < target & start < letters.length){
                return letters[start];
            }

            return letters[0];

        }
    }
}
