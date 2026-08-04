class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set s = new HashSet();
        for(int num: nums)
            s.add(num);
        return s.size() != nums.length;
    }
}