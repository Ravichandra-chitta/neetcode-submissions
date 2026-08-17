class Solution {

    /*

       5

       0 1 2 3 4 5 6 7

        7/2 = 3.5 ~ 3


        start = 4 
        end 7

        mid = 4+7 /2 = 5



    */



    public int search(int[] nums, int target) {        

        int start = 0;
        int end = nums.length-1;

        for(int i=0; i< nums.length;i++){
            
            int mid = (end + start) / 2;

            System.out.println(mid);

            if(nums[mid] == target){
                return mid;
            } else if(nums[mid] > target){
                start = i;
                end = mid -1;
            } else {
                start = mid +1;
            }
        }
        return -1;
    }
}
