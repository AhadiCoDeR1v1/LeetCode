package Searching.Q4;

class Solution {
    static{
        for(int i = 0; i< 100; i++){
            twoSum(new int[]{0,0}, 0);
        }
    }
    public static int[] twoSum(int[] numbers, int target) {
        int left = 1, right = numbers.length;

        while (left < right) {
            int leftNum = numbers[left - 1];
            int rightNum = numbers[right - 1];
            int sum = leftNum + rightNum;

            if (sum == target)
                return new int[] { left, right };
            else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return null;
    }
}


// my solution
//class Solution {
//    public int[] twoSum(int[] numbers, int target) {
//        int [] arr =new int [2];
//        int target1;
//        int start =1;
//        int end = numbers.length;
//        int mid =start + (end -start)/2;
//        for (int i =1 ;i <= numbers.length; i++){
//            target1 = target - numbers[i-1];
//            start =1;
//            end = numbers.length;
//            mid = start + (end -start)/2;
//            if (numbers[i-1] == target1){
//                arr[0] =i;
//                arr[1]= i+1 ;
//                return arr;
//            }
//            else{
//                while (start <= end ){
//                    mid = start + (end -start)/2;
//                    if (numbers[mid-1] == target1){
//                        arr[0] =i;
//                        arr[1]=mid  ;
//                        return arr;
//                    }
//                    else if (numbers[mid-1] > target1 ){
//                        end = mid -1;
//                    }
//                    else {
//                        start = mid+1 ;
//                    }
//
//                }
//            }
//
//
//        }
//        return arr;
//    }
//}
