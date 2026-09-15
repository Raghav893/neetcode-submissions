class Solution {
    public String minWindow(String s, String t) {
        if (t.length() > s.length()) {
            return "";
        }

        HashMap<Character, Integer> need = new HashMap<>();

        for (char c : t.toCharArray()) {
            need.merge(c, 1, Integer::sum);
        }

        HashMap<Character, Integer> window = new HashMap<>();

        int have = 0;
        int needCount = need.size();

        int l = 0;
        int minLength = Integer.MAX_VALUE;
        int start = 0;
        for (int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            window.merge(c, 1, Integer::sum);
            if (need.containsKey(c) && window.get(c).intValue() == need.get(c).intValue()) {
                have++;
            }
            while (have == needCount) {
                if (r - l + 1 < minLength) {
                    minLength = r - l + 1;
                    start = l;
                }

                char leftChar = s.charAt(l);
                window.put(leftChar, window.get(leftChar) - 1);

                if (need.containsKey(leftChar) && window.get(leftChar) < need.get(leftChar)) {
                    have--;
                }

                l++;
            }
        }

        return minLength == Integer.MAX_VALUE ? "" : s.substring(start, start + minLength);
    }
}
