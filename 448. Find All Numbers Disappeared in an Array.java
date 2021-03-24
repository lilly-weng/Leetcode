class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        //創建list來儲存missing numbers
        List<Integer> missingNumbers = new ArrayList<Integer>();
        //創建HashSet來儲存nums中的numbers
        HashSet<Integer> numbers = new HashSet<Integer>();
        // 遍歷nums裡面的numbers，存入hashset中
        for (int i: nums) {
            numbers.add(i);
        }
        
        for (int i=1; i<= nums.length; i++) {
            if (!numbers.contains(i)){
                missingNumbers.add(i);
            }
        }
        return missingNumbers;
    }
}
