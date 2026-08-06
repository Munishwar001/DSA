class Solution {
    public int product(int n){
        int p = 1; 
         while(n>0){
            int temp = n%10;
            p *= temp;
            n = n/10;
         }
        return p;
    }
    public int smallestNumber(int n, int t) {
        int current = n ; 
        while (true){
            int p = product(current);
            if(p%t == 0 ){
                return current;
            }
            current++;
        }
    }
}