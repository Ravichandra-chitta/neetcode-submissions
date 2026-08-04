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
            // System.out.println(c+" " +map.get(c));
            // System.out.println("sstep  " + i);
        }

        for(int i=0;i< t.length(); i++){
            Character c = t.charAt(i);
            if(map.containsKey(c)){
                map.put(c, map.get(c)-1);
            } 
            // System.out.println("tstep  " + i);
            // System.out.println(c +" " +map.get(c));
            

        }        

        for(char c: map.keySet()){
            System.out.println(map.get(c));
            if(map.get(c) != 0){
                return false;
            }
            
        }

        return true;
    }
}
