class Solution {
    public int numberOfMatches(int n) {
        int matches = 0;
        int adv = 0;
        
        while (n > 1) {
            if (n%2 == 1) {
                matches += (n-1)/2;
                //System.out.println(matches);
                n = (n-1)/2+1;
                //System.out.println("n:"+n);
            } else {
                matches += (n)/2;
                //System.out.println(matches);
                n = (n)/2;
                //System.out.println("n:"+n);
            }
        }
        return matches;       
    }
}
