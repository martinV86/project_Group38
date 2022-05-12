package com.belhard.lesson10.repository;

import com.belhard.lesson10.model.Group;

import java.util.ArrayList;
import java.util.List;

public class GroupRepository {
    //храниться список
    private List<Group> groups=new ArrayList<>();
    public void removeGroups(List<Group>removeGroups){
        groups.remove(removeGroups);
    }
    public void addGroups(List<Group>newGroups){
        groups.addAll(newGroups);
    }

    public List<Group> getGroups() {
        return groups;
    }
}
