class Solution {
    public int numSquares(int n) {
   
        //DP
        //num[0] 不會用到，因為要放到 n 也因為包含 0，所以數列是 n+1
        int[] num = new int[n+1];
        for (int i = 1; i <= n ;i++) {
            num[i] = i;
            for (int j = 1; j*j <= i; j++) {
                //數列放每個數的最小段數
                num[i] = Math.min(num[i], num[i-j*j]+1);
            }
        }
        return num[n];
    }
}
