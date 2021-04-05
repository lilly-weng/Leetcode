class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        //corner cases
        if (matrix == null || matrix.length==0 || matrix[0].length==0) return new LinkedList<Integer>();
        //創建res
        LinkedList<Integer> res = new LinkedList<Integer>();
        //初始值 (index)
        int top =0, bottom = matrix.length -1;
        int left=0, right = matrix[0].length-1;
        //繞圈條件
        while (left < right && top < bottom) {
            for (int i = left; i < right; i++) res.add(matrix[top][i]); // top
            for (int i = top; i < bottom; i++) res.add(matrix[i][right]); // right
            for (int i = right; i > left; i--) res.add(matrix[bottom][i]); //bottom
            for (int i = bottom; i > top; i--) res.add(matrix[i][left]); //left
            top ++;
            right --;
            bottom --;
            left ++;
        }
        
        //剩下直的或是橫的的條件
        if (left==right) { //直的
            for (int i = top; i <= bottom; i++) res.add(matrix[i][left]);
        } else if (top==bottom) { //橫的
            for (int i = left; i <= right; i++) res.add(matrix[top][i]);
        }
        
        return res;
    }
}
