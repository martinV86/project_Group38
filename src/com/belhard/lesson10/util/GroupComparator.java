package com.belhard.lesson10.util;

import com.belhard.lesson10.model.Group;

import java.util.Comparator;

public class GroupComparator implements Comparator<Group> {
    @Override
    public int compare(Group o1, Group o2) {
        return o1.getGroup_name()-o2.getGroup_name();
    }
}
