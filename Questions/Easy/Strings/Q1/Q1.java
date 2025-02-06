package Strings.Q1;
class Solution {
    public static void main(String[] args) {
        String s1 = "siyolsdcjthwsiplccjbuceoxmpjgrauocx";
        String s2 = "siyolsdcjthwsiplccpbuceoxmjjgrauocx";
        System.out.println(areAlmostEqual(s1, s2)); // Expected output: false
    }

    public static boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2)) {
            return true;
        }

        int first = -1, second = -1; // To store mismatched indices
        int count = 0; // Count mismatches

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                count++;
                if (first == -1) {
                    first = i;
                } else if (second == -1) {
                    second = i;
                } else {
                    return false; // More than two mismatches
                }
            }
        }

        // If exactly two mismatches, check if swapping makes them equal
        return count == 2 &&
                s1.charAt(first) == s2.charAt(second) &&
                s1.charAt(second) == s2.charAt(first);
    }
}
