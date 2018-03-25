package cn.school.thoughtworks.section3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        //选出collection1中key跟collection2中value对应的list中的元素相同的元素,把他们的count，满3减1，输出减过之后的新集合
        ArrayList<String> list2 = new ArrayList<>(object.get("value"));
        int count = 0;
        for (String str : list2) {
            count = collectionA.get(str);
            collectionA.put(str, count - count/3);
        }
        return collectionA;
    }
}
