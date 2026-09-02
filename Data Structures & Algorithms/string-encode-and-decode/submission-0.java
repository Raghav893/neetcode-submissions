class Solution {

    public String encode(List<String> strs) {
        String encoded_string = "";
       
        for (String s : strs) {
            encoded_string += s.length() + "#" + s;
        }

        return encoded_string;
        

    }

    public List<String> decode(String s) {
       List<String> decoded_strs= new ArrayList<>();
       int i =0;
        while(i<s.length()){
            int j = i ;
            while (s.charAt(j) != '#') {
                j++;
            }
            int length = Integer.parseInt(s.substring(i, j));
            int start= j+1;
            String word = s.substring(start,start+length);
            decoded_strs.add(word);
            i = start+length;
        }
        
        
        
        return decoded_strs;
    }
}
