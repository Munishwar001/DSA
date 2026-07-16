class Solution {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }

    public long gcdSum(int[] nums) {
        int max = nums[0];
        int maxgcd = Integer.MIN_VALUE;
        int mingcd = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
            nums[i] = gcd(nums[i], max);
        }
        Arrays.sort(nums);
        long sum = 0 ; 
        int len = nums.length -1, i = 0 ; 
        while(i<len){
           sum += gcd(nums[i], nums[len]);
           i++;
           len--;
        }
        return sum;
    }
}