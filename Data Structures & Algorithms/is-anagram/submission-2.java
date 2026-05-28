class Solution {
    public boolean isAnagram(String s, String t) {
       // Map<Character, Integer> map = new HashMap<Character, Integer>();

        int slen = s.length();
        int tlen = t.length();

        if(slen != tlen) 
         return false;
        else {
            char[] c1 = new char[slen];
            char[] c2 = new char[tlen];
            c1= s.toCharArray();
            c2= t.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);

            for(int i=0;i<slen;i++){
                System.out.println(c1[i]);
                System.out.println(c2[i]);

                if(c1[i] != c2[i])
                    return false;
            }
            return true;
        }
    }
}
