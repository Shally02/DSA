class Solution {

    static void reverse(int[] arr, int i, int j){
        while(i<j){
            int temp =arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public boolean check(int[] nums) {
        int n = nums.length;
        int d = 0;

        for(int i=0; i<n-1; i++){
            if(nums[i] > nums[i+1]) {
                d = n-i-1;  // 2
                reverse(nums, 0, n-1);
                reverse(nums, 0, d-1);
                reverse(nums, d, n-1);
                break;
            }
        }
        boolean isSorted = true;

        for(int i=0; i<n-1; i++){
            if(nums[i] > nums[i+1]) isSorted = false;
        }
        return isSorted;
    }
}