//给定不同面额的硬币 coins 和一个总金额 amount。编写一个函数来计算可以凑成总金额所需的最少的硬币个数。如果没有任何一种硬币组合能组成总金额，返回
// -1。 
//
// 你可以认为每种硬币的数量是无限的。 
//
// 
//
// 示例 1： 
//
// 
//输入：coins = [1, 2, 5], amount = 11
//输出：3 
//解释：11 = 5 + 5 + 1 
//
// 示例 2： 
//
// 
//输入：coins = [2], amount = 3
//输出：-1 
//
// 示例 3： 
//
// 
//输入：coins = [1], amount = 0
//输出：0
// 
//
// 示例 4： 
//
// 
//输入：coins = [1], amount = 1
//输出：1
// 
//
// 示例 5： 
//
// 
//输入：coins = [1], amount = 2
//输出：2
// 
//
// 
//
// 提示： 
//
// 
// 1 <= coins.length <= 12 
// 1 <= coins[i] <= 231 - 1 
// 0 <= amount <= 104 
// 
// Related Topics 动态规划 
// 👍 932 👎 0


import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int coinChange(int[] coins, int amount) {
        int max = amount+1;
        //dp表示 从0开始到amount的需要的硬币最少数量
        //例 输入: coins = [1, 2, 5], amount = 11
        //解释: dp[0]=0 ,dp[1]=1, dp[2]=1 , dp[3]=2, dp[4]=2, dp[5]=1
        int[] dp = new int[max];
        //初始化dp，填充硬币最大值
        Arrays.fill(dp,max);
        // amount==0 时，dp[0] = 0
        //必须初始化为0
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                //当金额大于 硬币面值时，表示存在解
                if(i>=coins[j]){
                    //dp[i-coins[j]]+1 解释：拆分子问题，类似于爬楼梯(走一步或走二步或走五步， 一共11阶 ，一共多少中走法，最小的步数)
                    // i-coins[j]表示减去当前硬币面值后剩余的金额
                    // dp[i-coins[j]]取得剩余金额的最小硬币数量
                    // +1 计算上当前已匹配面值coins[j]
                    dp[i] = Math.min(dp[i],dp[i-coins[j]]+1);
                }
            }
        }
        return dp[amount] > amount?-1:dp[amount];
    }
}
//leetcode submit region end(Prohibit modification and deletion)
