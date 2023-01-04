class Solution {
    public int[] productExceptSelf(int[] num) {
        
        if (num==null || num.length==0){
            return new int[0];
        }
        int[] result = new int[num.length];
        int rp=1;
            
        for(int i=0; i<num.length ;i++ ){
            result[i] = rp;
            rp = rp * num[i];
        }
        rp=1;
        for(int i = num.length - 1; i>=0 ;i-- ){
            result[i] = result[i]*rp;
            rp = rp * num[i];
        }
        return result;
    }
}