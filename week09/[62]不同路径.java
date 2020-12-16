//一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为 “Start” ）。 
//
// 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为 “Finish” ）。 
//
// 问总共有多少条不同的路径？ 
//
// 
//
// 示例 1： 
//
// 
//输入：m = 3, n = 7
//输出：28 
//
// 示例 2： 
//
// 
//输入：m = 3, n = 2
//输出：3
//解释：
//从左上角开始，总共有 3 条路径可以到达右下角。
//1. 向右 -> 向右 -> 向下
//2. 向右 -> 向下 -> 向右
//3. 向下 -> 向右 -> 向右
// 
//
// 示例 3： 
//
// 
//输入：m = 7, n = 3
//输出：28
// 
//
// 示例 4： 
//
// 
//输入：m = 3, n = 3
//输出：6 
//
// 
//
// 提示： 
//
// 
// 1 <= m, n <= 100 
// 题目数据保证答案小于等于 2 * 109 
// 
// Related Topics 数组 动态规划 
// 👍 829 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int uniquePaths(int m, int n) {
        if(m==0 || n==0)
            return 0;
        int[][] ints = new int[m][n];
        //处理边界情况
        for (int i = 0; i < m; i++) {
            ints[i][0] = 1;
        }
        //处理边界情况
        for (int i = 0; i < n; i++) {
            ints[0][i] = 1;
        }
        //拆分为向右走多少步+向下走多少步
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                ints[i][j] = ints[i-1][j] + ints[i][j-1];
            }
        }
        return ints[m-1][n-1];
    }
}
//leetcode submit region end(Prohibit modification and deletion)
