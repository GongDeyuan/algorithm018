//给定一个 没有重复 数字的序列，返回其所有可能的全排列。 
//
// 示例: 
//
// 输入: [1,2,3]
//输出:
//[
//  [1,2,3],
//  [1,3,2],
//  [2,1,3],
//  [2,3,1],
//  [3,1,2],
//  [3,2,1]
//] 
// Related Topics 回溯算法 
// 👍 985 👎 0


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        List<Integer> source = new ArrayList<>();
        for (int i : nums) {
            source.add(i);
        }
        backtrack(source, res, 0);
        return res;
    }

    public void backtrack(List<Integer> nums, List<List<Integer>> res, int n) {
        if (n == nums.size()) {
            res.add(new ArrayList<>(nums));
        }
        for (int i = n; i < nums.size(); i++) {
            Collections.swap(nums, n, i);
            backtrack(nums, res, n+1);
            Collections.swap(nums, i, n);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
