class WordDictionary {
    //先定義 TrieNode 
    private class TrieNode {
        TrieNode[] children;
        boolean isWord;
        String word;
        public TrieNode(){
            children = new TrieNode[26];
            isWord = false;
            word = "";
        }
    }
    
    private TrieNode root;
    /** Initialize your data structure here. */
    public WordDictionary() {
        root = new TrieNode();
        
    }
    
    public void addWord(String word) {
        TrieNode cur = root;
        for (int i = 0; i < word.length(); i++){
            int index = word.charAt(i) - 'a';
          //如果沒有children 就增加 children  
          if (cur.children[index] == null){
                cur.children[index] = new TrieNode();
            }
            //往下移動一個
            cur = cur.children[index];
        }
        //最後一個節點標記為 true
        cur.isWord = true;
        cur.word = word;
    }
    
    public boolean search(String word) {
        
        return find(word, root, 0);
        
    }
    
    public boolean find(String word, TrieNode node, int index){
        if (node == null) return false;
        //如果index 字的長度則表示應該停止了，因為index = 長度是不存在的，此時的node就是最後一個node
        if (index == word.length()) return node.isWord;
        //遇到.的情況
        if (word.charAt(index) == '.'){
            //遍歷所有children
            for (TrieNode temp : node.children) {
                if (find(word, temp, index + 1)){
                    return true;
                }
            }
        }else {
            //遇到字母的情況
            int tempIndex = word.charAt(index) - 'a';
            TrieNode temp = node.children[tempIndex];
            //以temp為起點，往下一個index去找下一個character
            return find(word, temp, index+1);
        }
        return false;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */
