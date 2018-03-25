package cn.school.thoughtworks.section2;

import java.util.*;

public class PracticeB {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //把1集合中相同的元素统计出数量
        ArrayList<String> list1 = new ArrayList<>(collection1);
        Map<String, Integer> result = new HashMap<>();
        int temp;
        for (String list : list1) {
            if (list.contains("-")) {
                temp = Integer.parseInt(list.split("-")[1]);
                list = list.split("-")[0];
            }else{
                temp = 1;
            }
            if (result.containsKey(list)) {
                result.put(list, result.get(list) + temp);
            } else {
                result.put(list, temp);
            }
        }
        return result;
    }

}
