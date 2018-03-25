package cn.school.thoughtworks.section3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeD {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        ///统计出collection1中相同的元素的个数，有过有-就把-右边的数字也计算入个数，形成collection3，
        // collection3是一个map其中元素key是collection1中的元素value是该元素在collection1中出现次数，
        // 然后选出collection3中的元素的key属性跟collection2中value属性对应的list中的元素相同的元素,把他们的count，满3减1，输出减过之后的新集合
        ArrayList<String> list1 = new ArrayList<>(collectionA);
        Map<String, Integer> collection3 = new HashMap<>();
        int temp;
        for (String list : list1) {
            if (list.contains("-")) {
                temp = Integer.parseInt(list.split("-")[1]);
                list = list.split("-")[0];
            }else{
                temp = 1;
            }
            if (collection3.containsKey(list)) {
                collection3.put(list, collection3.get(list) + temp);
            } else {
                collection3.put(list, temp);
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
