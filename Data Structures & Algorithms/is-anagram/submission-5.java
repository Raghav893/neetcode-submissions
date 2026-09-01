class Solution {
    public boolean isAnagram(String s, String t) {
            HashMap <String,Integer>map = new HashMap();
            int n = s.length();
            if (s.length() != t.length()) {
            return false;
        }
            for(int i =0;i<n;i++){
                
                    map.merge(String.valueOf(s.charAt(i)), 1, Integer::sum);
                }
             
            for(int i =0;i<t.length();i++){
                
                   map.merge(String.valueOf(t.charAt(i)), -1, Integer::sum);
            }
           
        for (int value : map.values()) {
            if (value != 0) {
                return false;
            }
        }
            return true;
    }
}
