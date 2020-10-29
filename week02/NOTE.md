## 学习笔记

#### 剑指 Offer 59 - I. 滑动窗口的最大值

##### 解题思路：
创建一个双端队列，数据从尾部入列，保持队列头部值是最大的，且值在窗口内
```
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
```

#### 1021. 删除最外层的括号
#### 解题思路：
设置一个标志位 `int left = 0`，记录左括号的个数
foreach循环字符串S
```
	if(c == ')')
		left--;
	if(c == '(')
		left++;
```
如果为‘（’left++;为‘)’left--;
因为要删除最外层括号，所以第一个左括号不保存
```
	if(left >0)
		sb.append(c);   
```
在left++之前执行过滤掉第一个'('左括号，
在left--之后执行过滤掉最后一个')'右括号