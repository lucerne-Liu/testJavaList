package cn.school.thoughtworks.section2;

import java.util.*;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //把1集合中相同的元素统计出数量
        ArrayList<String> list1 = new ArrayList<>(collection1);
        Map<String, Integer> result = new HashMap<>();
        int temp = 1;
        String str;
        for (String list : list1) {
            str = list;
            temp = 1;
            String concatNum = "";
            for (int i = 0; i < list.length(); i++) {
                if (list.charAt(i) >= 48 && list.charAt(i) <= 57) {
                    concatNum += (list.charAt(i) - 48)+"";
                }
            }
            if (concatNum != ""){
                temp = Integer.parseInt(concatNum);
                str = String.valueOf(list.charAt(0));
            }
            if (result.containsKey(str)) {
                result.put(str, result.get(str) + temp);
            } else {
                result.put(str, temp);
            }
        }
        return result;
    }

}
