package com.study.demo05properties;

import java.util.Properties;
import java.util.Set;

/**
 * java.lang.Object
 *   继承者 java.util.Dictionary<K,V>
 *       继承者 java.util.Hashtable<Object,Object>
 *           继承者 java.util.Properties
 *   Object setProperty(String key, String value) 调用 Hashtable 的方法 put
 *   Set<String> stringPropertyNames() 返回此属性列表中的键集，其中该键及其对应值是字符串，如果在主属性列表中未找到同名的键，则还包括默认属性列表中不同的键。
 *    String getProperty(String key) 用指定的键在此属性列表中搜索属性。
 */
public class Demo01Properties {
    public static void main(String[] args) {
        Properties props = new Properties();
        props.setProperty("镜华","12");       // 存储Stirng类型的<Key,Value>到Properties里
        props.setProperty("美美","10");
        props.setProperty("猫羽雫", "16");
        Set<String> set = props.stringPropertyNames();      // 将Properties类型里的<K,V>存储到Set集合中
        for (String key : set) {
            String value = props.getProperty(key);
            System.out.println("key="+key+" value="+value);
        }
    }
}
