class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int r=0;
        HashSet<Character> set = new HashSet<>();
        int currentL =0;
        int longest = 0;
        while(r<s.length()){
            if(!set.contains(s.charAt(r))){
                set.add(s.charAt(r));
                r++;
                currentL++;
                longest = Math.max(currentL,longest);
            }
            else{
                set.remove(s.charAt(l));
                l++;
                currentL--;
            }
            


        }
        return longest;
    }
}
