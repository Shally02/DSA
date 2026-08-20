class Solution {
    int missingNum(int arr[]) {
        // code here
        long n = arr.length+1; //el range
        long totalSum = n*(n+1)/2;
        long arrSum=0;
        
        for(int el:arr){
            arrSum += el;
        }
        return (int)(totalSum - arrSum);
    }
}