class Solution {
    void segregate0and1(int[] arr) {
        // code here
        int n= arr.length;
        
        int noOfZero = 0;
        int noOfOne = 0;
        
        for(int el: arr){
            if(el==0) noOfZero++;
            else noOfOne++;
        }
        for(int i=0; i<noOfZero; i++){
            arr[i] =0;
        }
        for(int i=noOfZero; i<n; i++){
            arr[i] =1;
        }

        
    }
}
