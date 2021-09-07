class Solution {
    public int maximumWealth(int[][] accounts) {
        int wealth=accounts[0][0];
        int i,j;
        for(i=0;i<accounts.length;i++){
            int sum=0;
            for(j=0;j<accounts[i].length;j++){
               sum +=  accounts[i][j];
            }
            if(sum>wealth)
            wealth = sum;
        }
        return wealth;
    }
}