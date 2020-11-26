//给定一个 N 叉树，返回其节点值的前序遍历。 
//
// 例如，给定一个 3叉树 : 
//
// 
//
// 
//
// 
//
// 返回其前序遍历: [1,3,5,6,2,4]。 
//
// 
//
// 说明: 递归法很简单，你可以使用迭代法完成此题吗? Related Topics 树 
// 👍 116 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

import java.util.LinkedList;

class Solution {
    public List<Integer> preorder(Node root) {
        LinkedList<Node> list = new LinkedList<Node>();
        LinkedList<Integer> result = new LinkedList<>();
        if(root == null)
            return result;
        list.add(root);
        while (!list.isEmpty()){
            Node node = list.pollLast();
            result.add(node.val);
            for (int i = node.children.size()-1; i >=0; i--) {
                list.add(node.children.get(i));
            }
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
