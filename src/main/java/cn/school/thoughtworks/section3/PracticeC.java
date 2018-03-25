package cn.school.thoughtworks.section3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //统计出collection1中相同的元素的个数，形成collection3，
        // collection3是一个map其中元素key是collection1中的元素value是该元素在collection1中出现次数，
        // 然后选出collection3跟collection2中value属性对应的list中的元素相同的元素,把他们的count，满3减1，输出减过之后的新集合
        ArrayList<String> list1 = new ArrayList<>(collectionA);
        Map<String, Integer> collection3 = new HashMap<>();
        for (String list : list1) {
            if (collection3.containsKey(list)) {
                collection3.put(list, collection3.get(list) + 1);
            } else {
                collection3.put(list, 1);
            }
        }
        ArrayList<String> collection2 = new ArrayList<>(object.get("value"));
        int count = 0;
        for (String str : collection2) {
            count = collection3.get(str);
            collection3.put(str, count - count/3);
        }
        return collection3;
    }
}
