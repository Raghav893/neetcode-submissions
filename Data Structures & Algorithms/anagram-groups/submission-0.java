class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        boolean[] used = new boolean[strs.length];

        for (int i = 0; i < strs.length; i++) {
            if (used[i]) continue;

            List<String> ds = new ArrayList<>();
            ds.add(strs[i]);
            used[i] = true;

            for (int j = i + 1; j < strs.length; j++) {
                if (!used[j] && isAnagram(strs[i], strs[j])) {
                    ds.add(strs[j]);
                    used[j] = true;
                }
            }
            res.add(ds);
        }
        return res;
    }

    private boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        int n = s.length();
        int k = t.length();

        for (int i = 0; i < n; i++) {
            map.merge(s.charAt(i), 1, Integer::sum);
        }
        for (int i = 0; i < k; i++) {
            map.merge(t.charAt(i), -1, Integer::sum);
        }
        for (int value : map.values()) {
            if (value != 0) {
                return false;
            }
        }
        return true;
    }
}