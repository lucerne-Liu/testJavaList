package cn.school.thoughtworks.section2;

import java.util.*;

public class PracticeA {
    Map<String,Integer> countSameElements(List<String> collection1) {
        //把1集合中相同的元素统计出数量
        ArrayList<String> list1 = new ArrayList<>(collection1);
        Map<String, Integer> result = new HashMap<>();
        for (String list : list1) {
            if (result.containsKey(list)) {
                result.put(list, result.get(list) + 1);
            } else {
                result.put(list, 1);
            }
        }
        return result;
    }
}
