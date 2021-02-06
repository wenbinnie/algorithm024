学习笔记

思考题
#### haspmap的小总结
* haspmap 的几个重要参数:
 * DEFAULT_INITIAL_CAPACITY(默认初始化容量)：1<<4:16 ,必须是2^n
 * MAXIMUM_CAPACITY(最大容量) 1<<30: 10亿级
 * TREEIFY_THRESHOLD = 8;（当linked list 数量大于这个值时，会使用树保存（发生hash碰撞时，使用linked list 解决，为了避免linked list O(n)时间复杂度的查询）
 * UNTREEIFY_THRESHOLD = 6;


* hash算法：(h = key.hashCode()) ^ (h >>> 16)

把32位的int值hash值的高16位和低16位做异或运算,是为了让hase值具备高16位与低16位的特征.减少hash冲突

* 寻址算法：n为容量
hashcode mod n,  对应的工程实现是 i=（n-1）& hashcode，效果相同，但位运算性能更高 

为什么容量必须是2^n ？因为只有这样，(n-1) & hash 才能与 hash % n 等效。

* resize方法



#### 二叉树、二叉搜索树

* 二叉搜索树 binary search tree 的特点：
1、左子树上所有节点的值都小于根的值
2、右子树上所有节点的值都大于根的值
3、依次类推，左右子树也都是二叉搜索树 （这就是重复性）

查询和插入操作都是 O(log2N)

* 二叉树的遍历 
前序：根左右
中序：左根右
后序：左右根




