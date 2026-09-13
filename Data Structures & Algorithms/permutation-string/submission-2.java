class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> map1 = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            map1.merge(s1.charAt(i), 1, Integer::sum);
        }
        int l = 0;
        int r = s1.length();
        while (r <= s2.length()) {
            HashMap<Character, Integer> map2 = new HashMap<>();
            int ctr = 0;
            for (int i = l; i < r; i++) {
                char c = s2.charAt(i);
                if (map1.containsKey(c) && map2.getOrDefault(c, 0) < map1.get(c)) {
                    map2.merge(c, 1, Integer::sum);
                    ctr++;
                } else {
                    break;
                }
            }
            if (ctr == s1.length()) {
                return true;
            }
            l++;
            r++;
        }

        return false;
    }
}