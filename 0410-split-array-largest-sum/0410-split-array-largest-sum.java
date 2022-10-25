class Solution {
    public int splitArray(int[] nums, int m) {
        int start=0;
        int end=0;
        for (int i=0; i<nums.length; i++){
            start = Math.max(start,nums[i]);
            end += nums[i];
        }
        
        while(start<end){
            int mid = start + (end-start)/2;
            int sum=0;
            int pices=1;

            for(int num:nums){
                if(sum+num>mid){
                    sum=num;
                    pices++;
                }else{
                    sum+=num;
                }
            }
            if(pices>m){
                start=mid+1;
            }else{
                end=mid;
            }
        }
        return start;
    }
}