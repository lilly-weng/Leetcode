
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        if (numRows == 0) return triangle;
        
        //先放入三角形的頂點，1
        List<Integer> first_row = new ArrayList<>();
        first_row.add(1);
        triangle.add(first_row);
        
        //遍歷三角形
        for (int i = 1; i < numRows; i++) {
            List<Integer> prev_row = triangle.get(i-1);
            List<Integer> row = new ArrayList<>();
            
            //最前面的1
            row.add(1);
            //從第＝,index = 1，開始進行前後相加
            for (int j = 1; j < i; j++) {
                row.add(prev_row.get(j-1) + prev_row.get(j));
            }
            //最後面的1
            row.add(1);
            
            triangle.add(row);
        }
   
        return triangle;
    }
}
