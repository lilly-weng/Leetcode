class Solution {
    public int countPrimes(int n) {
        //創建一個boolean，default都是false到n
        boolean NotPrime[] = new boolean[n];
        int count = 0;
        //把n以下能相乘的都相乘
        for (int i = 2; i < n; i++) {
            if (!NotPrime[i]) {
                count ++;
            }
            for (int j = 2; i*j < n; j++) {
                NotPrime[i*j] = true;
            }
        } 
        return count;       
    }
}
