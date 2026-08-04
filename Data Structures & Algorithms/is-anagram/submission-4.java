class Solution {
    public boolean isAnagram(String s, String t) {

        boolean returnFlag = false;
        Map<Character, Integer> map = new HashMap();

        if(s.length() != t.length())
            return false;       

        for(int i=0;i< s.length(); i++){
            Character c = s.charAt(i);
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            } else{
                map.put(s.charAt(i), 1);
            }

        }

        for(int i=0;i< t.length(); i++){
            Character c = t.charAt(i);
            if(map.containsKey(c)){
                map.put(c, map.get(c)-1);
            } 
        }        

        for(char c: map.keySet()){
            if(map.get(c) != 0){
                return false;
            }            
        }

        return true;
    }
}
