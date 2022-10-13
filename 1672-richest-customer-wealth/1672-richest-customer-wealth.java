class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans=Integer.MIN_VALUE;
        for (int person=0 ; person<accounts.length; person++ ){
            int rowSum=0;
            for (int account=0; account<accounts[person].length; account++){
                rowSum += accounts[person][account];
            }
            if (rowSum>ans){
                ans= rowSum;
            }
        }
        return ans;
    }
}