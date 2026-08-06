class Solution {
    public int[] twoSum(int[] numbers, int target) {

      Map<Integer, Integer> map = new HashMap();
      int[] returnValue = new int[2];

      for(int i=0;i<numbers.length;i++){
        int findNum = target - numbers[i];
        
        if(map.containsKey(findNum)){
            returnValue = new int[]{map.get(target-numbers[i])+1, i+1 };
        } else {
            map.put(numbers[i], i);
        }
      }
    return returnValue;

    }
}
