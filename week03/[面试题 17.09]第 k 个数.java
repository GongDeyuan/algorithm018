//有些数的素因子只有 3，5，7，请设计一个算法找出第 k 个数。注意，不是必须有这些素因子，而是必须不包含其他的素因子。例如，前几个数按顺序应该是 1，3，
//5，7，9，15，21。 
//
// 示例 1: 
//
// 输入: k = 5
//
//输出: 9
// 
// Related Topics 堆 队列 数学 
// 👍 37 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int getKthMagicNumber(int k) {
        if(k <=1)
            return 1;
        int[] result = new int[k+1];
        result[0] = 1;
        int p3=0,p5=0,p7=0;
        for (int i = 1; i <= k; i++) {
            result[i]=Math.min(Math.min(result[p3]*3,result[p5]*5),result[p7]*7);
            if(result[i]==result[p3]*3) p3++;
            if(result[i]==result[p5]*5) p5++;
            if(result[i]==result[p7]*7) p7++;

        }
        return result[k-1];
    }
}
//leetcode submit region end(Prohibit modification and deletion)
