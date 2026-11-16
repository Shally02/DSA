class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int count =0;
        int maxCount = 0;

        for(int j=0; j<n; j++){
            if(nums[j] == 1) count++;
            else{
                maxCount = Math.max(count, maxCount);
                count=0;
            }
        }
        return Math.max(maxCount, count);
    }
}