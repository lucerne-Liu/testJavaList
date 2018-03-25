package cn.school.thoughtworks.section3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        //选出1集合中元素的key的值跟2对象中value属性中的元素相同的元素,把他们的count-1，输出减过之后的新集合
        ArrayList<String> list2 = new ArrayList<>(object.get("value"));
        for (String str : list2) {
            collectionA.put(str, collectionA.get(str) - 1);
        }
        return collectionA;
    }
}
