package com.study.demo01list;

/**
 * public class Vector<E>
 * extends AbstractList<E>
 * implements List<E>, RandomAccess, Cloneable, Serializable
 * Vector类实现了可扩展的对象数组。 像数组一样，它包含可以使用整数索引访问的组件。 但是， Vector的大小可以根据需要增长或缩小，以适应在创建Vector之后添加和删除项目。
 * 每个向量尝试通过维护capacity和capacityIncrement优化存储capacityIncrement 。 capacity总是至少与矢量大小一样大; 通常较大，因为当向量中添加组分时，向量的存储空间大小capacityIncrement 。 应用程序可以在插入大量组件之前增加向量的容量; 这减少了增量重新分配的数量。
 * The iterators returned by this class's个 iterator和listIterator方法是快速失败的 ：如果向量在任何时间从结构上修改创建迭代器之后，以任何方式除非通过迭代器自身remove种或add方法，迭代器都将抛出一个ConcurrentModificationException 。 因此，面对并发修改，迭代器将快速而干净地失败，而不是在未来未确定的时间冒着任意的非确定性行为。 由elements返回的Enumerations 不是故障快速的。
 * 请注意，迭代器的故障快速行为无法保证，因为一般来说，在不同步并发修改的情况下，无法做出任何硬性保证。 失败快速迭代器尽力投入ConcurrentModificationException 。 因此，编写依赖于此异常的程序的正确性将是错误的：迭代器的故障快速行为应仅用于检测错误。
 * 从Java 2平台v1.2，这个类被改造为实现List接口，使其成为成员Java Collections Framework 。 与新集合实现不同， Vector是同步的。 如果不需要线程安全的实现，建议使用ArrayList代替Vector 。
 * 从以下版本开始：
 * JDK1.0
 * 另请参见：
 * Collection ， LinkedList ， Serialized Form
 */
public class Demo03Vector {
    public static void main(String[] args) {

    }
}
