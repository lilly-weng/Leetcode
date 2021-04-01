class Solution {
    public int countPrimeSetBits(int L, int R) {
        int ans = 0;
        for (int n = L; n <= R; n++){
            if (isPrime(bits(n))) {
                ans ++;
            }
        }
        return ans;
    }
    
    //計算有多少個1
    private int bits(int n) {
        int s = 0;
        while (n != 0) {
            s += n & 1; //判斷最後一位是不是1 (&: 兩者為1才為1)
            n >>=  1; //n右移一位
        }
        return s;
    }
        
    //判斷是否為質數
    private boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        for (int i = 2; i <= (int)Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}


    
