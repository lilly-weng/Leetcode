class Solution {
    public int climbStairs(int n) {
        //f(n) = f(n-1) + f(n-2)
        if (n==1) return 1; //第一個台階
        if (n==2) return 2; //第二個台階
        int prev = 1;
        int current = 2;
        for (int i = 3; i <= n ; i++) { //從第三個台階開始
            current = current + prev;
            prev = current - prev; //取得舊的current
        }
        return current;
        
    }
}
