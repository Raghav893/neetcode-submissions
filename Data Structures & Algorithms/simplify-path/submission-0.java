class Solution {
    public String simplifyPath(String path) {
        String[] parts = path.split("/");
        Stack<String> res = new Stack<>();
        for (String s : parts) {
            if (s.equals("")) {
                continue;
            } else if (s.equals(".")) {
                continue;
            } else if (s.equals("..")) {
                if (!res.isEmpty()) {
                    res.pop();
                }

            } else {
                res.push(s);
            }
        }
        if(res.isEmpty()){return "/";}
        String a = "";
        for (int i = 0; i < res.size(); i++) {
            a = a + "/" + res.get(i);
        }
        return a;
    }
}