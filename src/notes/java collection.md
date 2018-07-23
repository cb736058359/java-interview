#一、概览

容器主要包括Colletion和Map两种，Collection又包含List、Map、Queue

## Collection

![collection](https://github.com/CyC2018/Interview-Notebook/blob/master/pics/java-collections.png)

**1.Set**

- HashSet：基于Hash实现，查询速度快，但不支持排序。根TreeSet据一个范围查找元素，失去插入顺序信息
- TreeSet：基于红黑树实现，支持有序操作，但查询效率不如HashSet高，HashSet时间复杂度为O(1),而TreeSet为O(logNs)
- LinkedHashSet:具有HashSet查询效率，内部使用链表维护其插入顺序

**2.List**

- ArrayList:基于数据实现，支持随机访问
- Vector：和ArrayList类似，线程安全
- LinkedList：基于双向链表实现，查询时根据顺序访问，效率第，但可以快速的插入和删除元素。linkedList方便作为栈、队列、双向队列的数据结构

**3.Queue**

- LinkedList:可以用来支持双向队列
- PriorityQueue：基于堆数据结构实现，可以用他来实现优先队列

## Map

- HashMap:基于hash实现
- HashTable：
- TreeMap：红黑树实现，
- LinkedHashMap：使用链表来维护的顺序，顺序为插入顺序或者最近最少使用（LRU）顺序






