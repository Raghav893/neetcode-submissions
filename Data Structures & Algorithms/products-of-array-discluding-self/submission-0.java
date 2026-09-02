class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prefix =1; 
        int postfix =1 ; 
        int n = nums.length;
        int[] res = new int[n];
        for (int i=0;i<nums.length;i++){
            res[i]=prefix;
            prefix *= nums[i];
        }
        for(int i =n-1;i>=0;i--){
            res[i] *= postfix;
            postfix *= nums[i];
        }
        return res;
    }
}  
