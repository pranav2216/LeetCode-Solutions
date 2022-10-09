class Solution {
    public int searchInsert(int[] nums, int target) {
        int i;
        int k=0;
        for(i=0; i<nums.length; i++){
            if (target==nums[i]){
                k=i;
            }
            else if (nums[i]<target){
                k=i+1;
            }
        }
        return k;
        
    }
}