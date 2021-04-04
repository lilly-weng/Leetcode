class Solution {
    public int[][] merge(int[][] intervals) {
        //corner case
        if (intervals == null || intervals.length == 0) return intervals;
        
        List<int[]> result = new ArrayList<>();
        //排列數組，由小到大
        Arrays.sort(intervals, (a,b)->(a[0]-b[0]));
        //先把第一組數加入result
        result.add(intervals[0]);
        //從interval[1]開始和第一組數比較是否有overlap
        for (int i = 0; i < intervals.length; i++) {
            //紀錄result中的最後一組數來比較
            int[] lastArray = result.get(result.size()-1);
            //比較是否有overlap
            //如果end >= 前一個的 start，那就要以end為新interval的end
            if (lastArray[1] >= intervals[i][0]) {
                lastArray[1] = Math.max(lastArray[1], intervals[i][1]);
            } else {
                //獨立數組沒有overlap，直接加入result
                result.add(intervals[i]);
            }
        }
        return result.toArray(new int[result.size()][2]);
        
    }
}
