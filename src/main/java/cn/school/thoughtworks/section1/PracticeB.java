package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        //实现练习要求，并改写该行代码。
        ArrayList<String> list1 = new ArrayList<>(collection1);
        for (List<String> list : collection2) {
            list1.retainAll(list);
        }
        return list1;
    }
}
