class Solution {
    public int sumBase(int n, int k) {
        int sum = 0 ; 
        while(n>0){
            int temp = n%k;
             n = n/k;
            sum +=temp;
        }
        return sum ; 
    }
}