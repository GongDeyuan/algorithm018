class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length){
            return intersect(nums2,nums1);
        }
        Map<Integer,Integer> map = new HashMap<>();
        for(int i= 0;i < nums1.length; i++){
            if(map.containsKey(nums1[i])){
               map.put(nums1[i],map.get(nums1[i])+1) ;
            }else{
                map.put(nums1[i],1);
            }
        }
        int[] num3 = new int[nums1.length];
        int position = 0;
        for(int i= 0;i < nums2.length; i++){
            if(map.containsKey(nums2[i])){
                if(map.get(nums2[i])>0){
                    map.put(nums2[i],map.get(nums2[i])-1);
                    num3[position++] = nums2[i];
                }
            }
        }
        return Arrays.copyOfRange(num3, 0, position);
    }
}