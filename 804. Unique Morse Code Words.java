class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] MORSE = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        //把資料存進去集合裡面
        //Set裡面不會重複計算
        Set<String> set = new HashSet<String>();
        
        //一個字一個字拿出來換成morse code
        for(String word : words){
            //存換成morse code之後的符號
            StringBuffer sBuffer = new StringBuffer();
            //將字裡面的單字換成morse code
            //用陣列的方式讀取上面的MORSE陣列
            //所以要把字換成陣列
                for(char c: word.toCharArray())
                //換成morsecode後要存入sBuffer
                sBuffer.append(MORSE[c-'a']);
            //把sBuffer的東西存入集合裡面
            //把sBuffer換成String
            set.add(sBuffer.toString());
        }
        
        //裡用size計算集合裡面不一樣的String
        
        return set.size();       
    }
}
