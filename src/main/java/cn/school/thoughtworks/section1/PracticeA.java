package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;

public class PracticeA {
    List<String> collectSameElements(List<String> collection1, List<String> collection2) {
        //实现练习要求，并改写该行代码。
        ArrayList<String> list1 = new ArrayList<String>(collection1);
        ArrayList<String> list2 = new ArrayList<String>(collection2);
        list1.retainAll(list2);
        return list1;
    }
}
