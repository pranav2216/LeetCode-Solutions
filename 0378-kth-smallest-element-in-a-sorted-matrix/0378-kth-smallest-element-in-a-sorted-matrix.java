class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        ArrayList<Integer> NewArray = new ArrayList<>();
        int n = matrix.length;
        for(int i = 0;i < n;i++){
            for (int j = 0;j<n;j++){
                NewArray.add(matrix[i][j]);
            }
        }
        
        Collections.sort(NewArray);

        int ans = NewArray.get(k-1);
        return ans;
    }
}