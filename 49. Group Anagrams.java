class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        ArrayList<List<String>> result = new ArrayList<List<String>>();
        if (strs == null || strs.length == 0) return result;
        
        //定義HashMap來儲存值，key是string，值是文字List
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
        //遍歷文字
        for (int i = 0; i < strs.length; i++){
            //把文字拆開排序
            char[] curr = strs[i].toCharArray();
            Arrays.sort(curr);
            //把curr轉回string，定義為key
            String key = String.valueOf(curr);
            //如果map沒有key，就存入key和value
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<String>());
            }
            //如果map有key，就直接加入值
            map.get(key).add(strs[i]);
        }
        return new ArrayList<List<String>>(map.values());
        
        
    }
}
