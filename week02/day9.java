class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length ==0 || k<=0){
            return new int[0];
        }
         Deque<Integer> deque = new LinkedList<>();
         //创建返回数组
         int[] result = new int[nums.length - k+1];
         //窗口形成前
         for(int i = 0;i<k-1;i++){
             //保证队列头部是最大的，递减队列
             while(!deque.isEmpty() && deque.peekLast() < nums[i]){
                 deque.removeLast();
             }
             deque.addLast(nums[i]);
         }
         //窗口形成后
         for(int i = k-1;i<nums.length;i++){
              while(!deque.isEmpty() && deque.peekLast() < nums[i]){
                 deque.removeLast();
             }
             deque.addLast(nums[i]);
             result[i-k+1] = deque.peekFirst();
             //如果队列头部等于窗口第一位，说明该值要滑出窗口了，从队列中移除该条数据
             if(!deque.isEmpty() && deque.peekFirst()==nums[i-k+1]){
                 deque.removeFirst();
             }
         }
         return result;
    }
}