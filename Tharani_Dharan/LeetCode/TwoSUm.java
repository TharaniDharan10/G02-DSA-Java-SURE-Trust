package Tharani_Dharan.LeetCode;

import java.util.Arrays;
import java.util.HashMap;

//leetcode 1
public class TwoSUm {
    public  static int[] twoSum(int[] nums, int target) {

        int[] arr = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int diff = target - nums[i];
            if(map.containsKey(diff)){
                arr[0] = i;
                arr[1] = map.get(diff);
                return arr;
            }
            map.put(nums[i] , i);
        }
        return arr;
    }


    //T.C = O(N) + (NlogN)
    // S.C = O(1)
    public static String read(int n, int []book, int target){
        // Write your code here.
        Arrays.sort(book);
        int left = 0;
        int right = book.length-1;
        // int rem = 0;
        int sum = 0;
        while(left<right){
            sum = book[left]+book[right];
            if(sum==target){
                return "YES";
            }
            if(sum>target){
                right--;
            }else if(sum<target){
                left++;
            }

        }
        return "NO";
    }

    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        String bool = TwoSUm.read(arr.length, arr , target);
        int[] output = twoSum(arr,target);
        System.out.println(bool);
        System.out.println("Output of TwoSum is : ["+output[0]+","+output[1]+"]");

    }

}
