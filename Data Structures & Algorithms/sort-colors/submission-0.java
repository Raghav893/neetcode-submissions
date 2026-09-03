class Solution {
    public void sortColors(int[] nums) {
        int c1=0;
        int c2=0;
        int c3 =0;
        for (int i:nums){
            if(i==0){
                c1++;
            }
            else if(i==1){
                c2++;}
            else if(i==2){
                c3++;
            }
        }
        List<Integer> res = new ArrayList<>();

        for (int j=0;j<c1;j++){
            res.add(0);
            
        }
        for (int j=0;j<c2;j++){
            res.add(1);
            
        }
        for (int j=0;j<c3;j++){
            res.add(2);
            
        }
        
        for (int k = 0; k < nums.length; k++) {
            nums[k] = res.get(k);
        }
    }
}
