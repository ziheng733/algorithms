# 算法与数据结构

+ 数据结构是为算法服务的  
+ 算法要作用在特定的数据结构之上

# lintCode解题
+ 入门 - [37.反转一个3位整数](src/main/java/com/ziheng733/algorithms/lintcode/NumReverseHelper.java)
+ 入门 - [145.146.大小写转换](src/main/java/com/ziheng733/algorithms/lintcode/CaseConversion.java)
+ 入门 - [283.三数之中的最大值](src/main/java/com/ziheng733/algorithms/lintcode/NumCompareHelper.java)
+ 入门 - [366. 斐波纳契数列](src/main/java/com/ziheng733/algorithms/lintcode/Fibonacci.java)


# 数据结构
+ [数组](array)
+ [链表](linkedlist)
+ 栈
+ 队列
+ 散列表
+ 二叉树
+ 堆
+ 跳表
+ 图
+ Trie 树

# 算法
+ 递归
+ 排序
+ 二分查找
+ 搜索
+ 哈希算法
+ 贪心算法
+ 分治算法
+ 回溯算法
+ 动态规划
+ 字符串匹配算法

# 复杂度分析

## 事后统计法
+ 测试结果非常依赖测试环境
+ 测试结果受数据规模的影响很大

## 大O复杂度表示法
+ 大O时间复杂度实际上并不具体表示代码真正的执行时间  
+ 而是表示代码执行时间随数据规模增长的变化趋势
```
T(n) = O(f(n))

T(n):代码执行时间
n:数据规模的大小
f(n):每次代码执行的次数总和
O:表示代码的执行时间T(n)与f(n)表达式成正比
```

## 时间复杂度分析
+ 只关注循环执行次数最多的一段代码
+ 加法法则：总复杂度等于量级最大的那段代码的复杂度
+ 乘法法则：嵌套代码的复杂度等于嵌套内外代码复杂度的乘积
+ 最好情况时间复杂度：在最理想的情况下，执行这段代码的时间复杂度
+ 最坏情况时间复杂度：在最糟糕的情况下，执行这段代码的时间复杂度
+ 平均情况时间复杂度：各种情况下，按照发生概率加权平均后的代码执行时间复杂度
+ 均摊时间复杂度：摊还分析法进行分析，例：若每次O(n)操作，都会跟着n-1次O(1)的操作，可进行均摊最后时间复杂度为O(1)


## 常见的时间复杂度
+ 常量阶 O(1)
+ 对数阶 O(logn)
+ 线性阶 O(n)
+ 线性对数阶 O(nlogn)
+ 次方阶 O(n^2), O(n^3), O(n^k) 
+ 指数阶 O(2^n)
+ 阶乘阶 O(n!)
+ 注：大O中的logn是指以2为底，n的对数。和数学中10为底不尽相同。(参考《算法导论》)

![时间复杂度函数图](src/main/resources/img/xy.jpg)

## 知识点脑图
![知识点脑图](src/main/resources/img/all.jpg)

## 参考学习
+ 极客时间《数据结构与算法之美》https://time.geekbang.org
+ 《算法导论》
