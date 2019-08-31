# 链表linkedlist

## 实现
+ [java实现](https://github.com/ziheng733/algorithms/blob/master/src/main/java/com/ziheng733/algorithms/linkedlist/SingleLinkedList.java)

## 概述
+ 内存分布：通过“指针”把一组零散的内存块串联起来使用
![链表内存分布](img/linkedlist_mem.jpg)
+ 单链表有头节点和尾节点，尾节点的“指针”指向一个空地址 NULL
![单链表](img/single_linkedlist.jpg)

## 单链表操作时间复杂度
+ 访问某节点：O(n)
+ 插入、删除给定指针指向的节点：O(1)

## 循环链表
+ 尾结点指针指向头节点
![循环链表](img/circle_linkedlist.jpg)

## 双向链表
+ 除了next指针，还有prev指针
![双向链表](img/two_way_linkedlist.jpg)

## 双向循环链表
![双向循环链表](img/two_way_circle_linkedlist.jpg)
