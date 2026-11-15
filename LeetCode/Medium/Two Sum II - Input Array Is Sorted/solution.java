class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int[] result = new int[2];
        int i=0, j=n-1;
        while(i<j){
            if(numbers[i] + numbers[j] == target){
                result[0] = i+1;
                result[1] = j+1;
                break;
            }
            else if(numbers[i] + numbers[j] > target){
                j--;
            }
            else if(numbers[i] + numbers[j] < target){
                i++;
            }
        }
        return result;
    }
}