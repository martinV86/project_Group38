package com.belhard.lesson10.service;

import com.belhard.lesson10.model.Group;
import com.belhard.lesson10.repository.GroupRepository;

import java.util.Arrays;
import java.util.List;

public class GroupService {
    //работает через репозиторий с базой данных
    private GroupRepository groupRepository;

    public GroupService(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }
    public void addGroups(List<Group>newGroups){
        newGroups.forEach(gr-> System.out.println(gr));
        groupRepository.addGroups(newGroups);
    }
    public void removeGroups(List<Group>removeGroups){
        removeGroups.forEach(gr-> System.out.println(gr));
        groupRepository.removeGroups(removeGroups);
    }
    //добавить метод изменения имени группы
}
