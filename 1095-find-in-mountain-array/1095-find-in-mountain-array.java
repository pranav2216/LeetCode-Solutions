/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray nums){
        int peak = findInMountainArray(nums);
        int firstTry = orderAgnosticbinarysearch(nums,target,0,peak);
        if (firstTry!=-1){
            return firstTry;
        }
        return orderAgnosticbinarysearch(nums,target,peak+1,nums.length()-1);
        
    }
    

    
    public int orderAgnosticbinarysearch(MountainArray nums,int target, int start, int end){
        boolean isAsn = nums.get(start)<nums.get(end);
        
        while(start<=end){
            int mid = start + (end-start)/2;
            if (nums.get(mid)==target){
                return mid;
            }
            if(isAsn==true){
                if(target<nums.get(mid)){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
                
            }
            
            else{
                if(target>nums.get(mid)){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                } 
             
            }
            
        }
        return -1;
    }
    
        public int findInMountainArray( MountainArray nums) {
        int start = 0;
        int end = nums.length()-1;
        
        while (start<end){
            int mid = start + (end-start)/2;
            if (nums.get(mid) > nums.get(mid+1)){
                end = mid ;
            }
            else{
                start = mid + 1;
            }
             
        }
      return start;
        
    }
    
}


