package com.study.Demo01Object;

public class ObjectDifferFromObjects {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        /** String类已经去重写了父类的方法，直接返回这个字符串
         *     public String toString() {
         *         return this;
         *     }
         */
        System.out.println(s1);     //String类型直接打印能打印出具体值
        /**  这是Object的toString方法，所以返回的不是具体的值
           public String toString() {
           return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
         */
        Student student = new Student("张三", 123);
        System.out.println(student);        //打印的是地址值

        /**     而这里的student比较的就是对象是否相等，比较的是 引用数据类型（也就是堆内存的地址）
         *     public boolean equals(Object obj) {
         *         return (this == obj);
         *     }
         */
        Student student2 = new Student("张三", 123);

        boolean b = student.equals(student2);
        /**     这里就做了重写Object类里的equals方法
         *     public boolean equals(Object anObject) {
         *         if (this == anObject) {
         *             return true;
         *         }
         *         if (anObject instanceof String) {
         *             String anotherString = (String)anObject;
         *             int n = value.length;
         *             if (n == anotherString.value.length) {
         *                 char v1[] = value;
         *                 char v2[] = anotherString.value;
         *                 int i = 0;
         *                 while (n-- != 0) {
         *                     if (v1[i] != v2[i])
         *                         return false;
         *                     i++;
         *                 }
         *                 return true;
         *             }
         *         }
         *         return false;
         *     }
         */
        boolean b1 = s1.equals(s2);
//        System.out.println(b);      //student默认没有重写Object类里的equals方法  重写前  false
        System.out.println(b1);     //String类默认重写了Object里的equals方法

        System.out.println(b);       //重写后   true


    }
}
