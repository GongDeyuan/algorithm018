class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hashtab = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){          
            if(hashtab.containsKey(target-nums[i])){
                return new int[]{hashtab.get(target-nums[i]),i};
            }
            hashtab.put(nums[i],i);
        }
        return new int[0];
    }
}