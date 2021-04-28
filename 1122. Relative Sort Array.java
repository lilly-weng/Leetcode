class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] count = new int[1001];
        
        //遍歷 arr1 中的元素並且記數
        for (int num: arr1) {
            count[num]++;
        }
        //處理 arr2 中的元素
        int index = 0;
        for (int num: arr2) {
            while (count[num] > 0) {
                //System.out.println(index);
                //System.out.println(num);
                arr1[index++] = num; //用count[num] > 0 的條件加入 arr2的值 和 count 裡面的值
                
                count[num]--;
            }
        }
        //處理剩餘不是 arr2 中的元素
        for (int i = 0; i < count.length; i++){
            while (count[i] > 0) {
                arr1[index++] = i;
                count[i] --;
            }
        }
        return arr1;
    }
}
