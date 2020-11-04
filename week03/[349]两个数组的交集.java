//给定两个数组，编写一个函数来计算它们的交集。 
//
// 
//
// 示例 1： 
//
// 输入：nums1 = [1,2,2,1], nums2 = [2,2]
//输出：[2]
// 
//
// 示例 2： 
//
// 输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//输出：[9,4] 
//
// 
//
// 说明： 
//
// 
// 输出结果中的每个元素一定是唯一的。 
// 我们可以不考虑输出结果的顺序。 
// 
// Related Topics 排序 哈希表 双指针 二分查找 
// 👍 267 👎 0


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
		//保证nums1是最短的
        if(nums2.length < nums1.length)
            intersection(nums2,nums1);
		//set去重
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i: nums1)
            set1.add(i);
        for (int i: nums2)
            set2.add(i);

        int[] result = new int[set1.size()];
        int index = 0;
        for (int i:set1) {
            if(set2.contains(i)){
                result[index] = i;
                index++;
            }
        }
        return Arrays.copyOf(result,index);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
