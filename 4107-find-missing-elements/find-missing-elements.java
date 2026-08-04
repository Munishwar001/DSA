class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = Arrays.stream(nums).min().getAsInt(); 
        int max = Arrays.stream(nums).max().getAsInt(); 
        List<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ; i<nums.length ; i++){
            set.add(nums[i]);
        }
        for(int i = min ; i<=max ; i++){
            Boolean value = set.contains(i);
            if(!value){
                list.add(i);
            }

        } 
        return list;
    }
}