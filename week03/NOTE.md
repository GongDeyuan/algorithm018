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
	前序根左右，中序左根右，后续左右根 (左节点始终在右节点之前)
	(根据访问次数理解)前序第一次访问节点,左序第二次访问节点，右序第三次访问节点


##### 剑指 Offer 06. 从尾到头打印链表
###### 思路：
	利用递归的思路，先走至链表尾端，然后依次弹出栈顶，加入列表，然后列表转数组输出