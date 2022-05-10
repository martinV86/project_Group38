package util;

import com.belhard.lesson10.Group;

import java.util.Comparator;

public class GroupComparator implements Comparator<Group> {
    @Override
    public int compare(Group o1, Group o2) {
        return o1.getGroup_name()-o2.getGroup_name();
    }
}
