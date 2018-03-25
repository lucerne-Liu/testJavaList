package cn.school.thoughtworks.section1;

import java.util.*;

public class PracticeC {
    List<String> collectSameElements(List<String> collection1, Map<String,List<String>> collection2) {
        //实现练习要求，并改写该行代码。
        ArrayList<String> list1 = new ArrayList<>(collection1);
        ArrayList<String> list2 = new ArrayList<>(collection2.get("value"));
        list1.retainAll(list2);
        return list1;
    }
}
