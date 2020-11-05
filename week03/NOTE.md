#### 学习笔记

##### 二叉树的中序遍历
###### 总结：
	牢记前序中序后序递归的代码模板
```
	public void loop(List list, TreeNode root) {
		if (root == null) 
			return;
		loop(list, root.left);
		list.add(root.val);
		loop(list, root.right);
	}
```
*	前序根左右，中序左根右，后续左右根 (左节点始终在右节点之前)
*	(根据访问次数理解)前序第一次访问节点,左序第二次访问节点，右序第三次访问节点


##### 剑指 Offer 06. 从尾到头打印链表
###### 思路：
	利用递归的思路，先走至链表尾端，然后依次弹出栈顶，加入列表，然后列表转数组输出

##### 剑指 Offer 68 - II. 二叉树的最近公共祖先
###### 思路：
	若 rootrootroot 是 p,qp, qp,q 的 最近公共祖先 ，则只可能为以下情况之一：

	1.ppp 和 qqq 在 rootrootroot 的子树中，且分列 rootrootroot 的 异侧（即分别在左、右子树中）；
	2.p=rootp = rootp=root ，且 qqq 在 rootrootroot 的左或右子树中；
	3.q=rootq = rootq=root ，且 ppp 在 rootrootroot 的左或右子树中；

```
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //如果p/q ==root，返回root
        if(root == null || root == p || root ==q){
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);
        if(left == null && right == null)
            return null;
        //左节点为空，p,q在右节点中
        if(left == null)
            return right;
        //右节点为空，p,q在左节点中
        if(right == null)
            return left;
        //左右节点都不为空，返回root节点
        return root;
    }
```