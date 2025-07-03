package LeetCode.ArrayProblems;

// Link : https://leetcode.com/problems/remove-duplicates-from-sorted-array

public class RemoveDuplicates {
        public int solution(int[] nums) {
        int i = 0;
        int j = 1;
        while(j < nums.length){
            if(nums[i] == nums[j]){
                j ++;
            }
            else{
                i ++;
                nums[i] = nums[j];
                j ++;
            }
        }
        return i + 1;
    }
}
