class Solution {
    public int removeDuplicates(int[] nums) {
    int i=0;
    int j=0;
        while(i<nums.length) {
            while(i<nums.length-1 && nums[i]==nums[i+1]){
                i+=1;
            }
            nums[j] = nums[i];
            i+=1;
            j+=1;
        }   
    return j;
  }
} 