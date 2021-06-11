class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> ans = new ArrayList<>();
        dfs(s.toCharArray(), 0, ans);
        return ans;
    }
    
    //思路: dfs ，遇到數字跳過，遇到字母就分為兩種情況傳給子問題
    private void dfs(char[] S, int i, List<String> ans) {
        //System.out.println(i);
        if (i == S.length) { //到底了，最後一層
            ans.add(new String(S)); //把 char 存為 string
            return;
        }

        dfs(S, i+1, ans); //往下一層
        //System.out.println(i);
        if (!Character.isLetter(S[i])) return; //判斷是否為數字，如果是的話就 return 到上一層
        S[i] ^= 1<<5; //利用異或轉變大小寫
        dfs(S, i+1, ans);//往下一層
        //System.out.println(i);
        S[i] ^= 1<<5; //恢復成原本的字母
    }   
}
