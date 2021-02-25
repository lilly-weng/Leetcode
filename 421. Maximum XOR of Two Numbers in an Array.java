class Solution {
    public int findMaximumXOR(int[] nums) {
        int maxResult = 0;
        int mask = 0;
        for (int i = 31; i >= 0 ; i--) {
            mask = mask | (1<<i); //第i位=1,後面的都是0
            
            Set<Integer> set = new HashSet<>();
            for (int num : nums) {
                set.add(num & mask); //遮住後面的其他位數,後面的都是0
            }
            
            int tmp = maxResult | (1<<i); //都假設第i位是 1 --> Greedy
            for (int prefix : set){
                if (set.contains(tmp ^ prefix)){ //如果prefix異或tmp的值存在，那假設是1就成立 (交換律)
                    maxResult = tmp; //更新最大值
                    break; //找到後一個就可以跳出
                }
            }
        }
        return maxResult;       
    }
}
