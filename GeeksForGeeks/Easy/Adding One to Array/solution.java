class Solution {
    // Function for adding one to the number represented by the array
    Vector<Integer> addOne(int[] arr) {
        // code here
        Vector<Integer> list = new Vector<>();
        for (int el: arr){
            list.add(el);
        }
        
        int carry = 1;
        for(int i=list.size()-1; i>=0; i--){
            if(list.get(i)<9){
                list.set(i, list.get(i) + carry);
                break;
            }
            else if(list.get(i)==9) list.set(i, 0);
            if(i==0) list.add(0, 1);
        }
        return list;
    }
}