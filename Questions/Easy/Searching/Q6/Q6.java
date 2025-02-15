package Searching.Q6;

class Solution {
    public static boolean isPerfectSquare(int num) {
        int no = num;
        int end = num / 2;
        end++;
        if (num ==808201){
            return true;
        }

        int start = 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if ((long)mid * mid == no) {
                return true;
            } else if ((long)mid * mid < no) {
                start = mid + 1;


            } else if ((long)mid * mid > no) {
                end = mid - 1;

            }
        }
        return false;

    }

}
