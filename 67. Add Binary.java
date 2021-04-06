class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        
        int i = a.length() - 1; //index
        int j = b.length() - 1; 
        int carry = 0; // 紀錄進位
        
        while (i>=0 || j>=0) {
            int sum = carry; //紀錄每一次的sum
            if (i>=0) sum += a.charAt(i) - '0'; //轉換成數字
            if (j>=0) sum += b.charAt(j) - '0';
            sb.append(sum % 2); //紀錄當前位相加的結果
            carry = sum / 2; //進位
            
            i--;
            j--;
        }
        
        if (carry!=0) sb.append(carry); //處理最後一次的進位
        return sb.reverse().toString();
        
    }
}
