class Solution {
    public int trap(int[] height) {
        int left =0;
        int right =height.length-1;
        int maxL = height[0];
        int maxR = height[height.length-1];
        int vol =0;
        while(left<right){
            if (maxL<maxR){
                left++;
                maxL = Math.max(maxL,height[left]);
                if(maxL-height[left]>0){
                    vol=vol+(maxL-height[left]);
                }
            }
            else{
                right --;
                maxR = Math.max(maxR,height[right]);
                if(maxR-height[right]>0){
                    vol=vol+(maxR-height[right]);
                }
            }
          
        }
        return vol;
    }
}
