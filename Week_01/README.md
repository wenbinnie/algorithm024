学习笔记

#### 如何高效学习算法训练营课程

* 三分看视频理解,七分练习
* 五毒神掌(限时5分钟、临摹、理解、模仿、次日写、看高手多题解、通过是开始,看高票代码、高质量题解) 
* 把每节课的不理解的内容整理脑图或笔记，经常看

#### 数据结构与算法总览

* 预习、预习、预习课件
* 思考
* 课后作业

##### 一维数据结构

* 基础:数组array(String) 链表 linked list
* 高级：stack, queue , deque, set map

##### 二维数据结构

* 基础：Tree,graph
* 高级：binary search tree(rea-balck  AVL) , heap, 并查集 disjoint set， 字典树 Trie

#### 特殊

* 位运算 bitwise, 布隆过滤器 bloomFilter
* LRU cache

#### 算法

* if-else -》 branch
* for, while loop -〉 iteration
* 递归 recursion (divide,)
* 搜索 Search ： 深度优先 Depth first seach ，广度优先 Breadth first 
* 动态规划：
* 二分查找
* 贪心 greedy
* 数学，几何

#### 知识点
本来想到第一节课不会有什么收货，没想到提到了 '跳表' 的数据结构，完全没有听说过。
然后google了java的工程实现，好像没有






#### 1月26日 21：30
##### homework 总结
jdk中，Stack是类，Queue是接口，但是一般都使用Deque
* Queue是接口，方法按类型分，有三对，共6个方法。增加 2个 删除 2个 获取2个
add 在受容量限制使，添加元素失败会抛异常。 offer 保存失败不抛异常，所以在有容量约束的的实现中，优先使用add
队列为空时，remove抛异常，poll 返回nullelement
获取元素，队列为空时，element 抛异常，peek 返回nullelement

* PriorityQueue 为什么默认容量是11，而一般的都是2的n次方
选择2n的次方，是因为在hash计算中，高效的mod是通过位运算计算的，在数学上依赖这个容量必须是2的指数。

看了源码，说使用 

* 每日一题
```
1128. 等价多米诺骨牌对的数量 * 2

首先用最傻的暴力法，两层循环解，居然没写对。是循环没写对，打击。写完后，发现O(n2）高，导致超时。
直接看题解，count += num[val]; num[val]++ 的骚操作，没读懂。手算了一遍，懂了。

在new 的新数组里，index 是 val，index上的value是计数器

283. 移动零 * 3

```

#### 1月28日
##### daily 

```
20. 有效的括号
  最近相关性 的问题可以用栈来解决，记忆。即使知道了用栈，还是有一些技巧的，直接看海外站
 
```



