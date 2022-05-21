package com.belhard.lesson10.service;

import com.belhard.lesson10.model.Group;
import com.belhard.lesson10.model.staff.Teacher;
import com.belhard.lesson10.repository.GroupRepository;
import com.belhard.lesson10.util.GroupComparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class GroupService {
    //работает через репозиторий с базой данных
    private GroupRepository groupRepository;

    public GroupService(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    public void addGroups(List<Group> newGroups,Group group) {
        System.out.println("add group:");
        newGroups.add(group);
        newGroups.forEach(gr -> System.out.println(gr.displayInfo()));
        groupRepository.addGroups(newGroups);
    }

    public void removeGroups(List<Group> removeGroups, Group removeGroup) {
        System.out.println("remove group:");
        removeGroups.remove(removeGroup);
        removeGroups.forEach(gr -> System.out.println(gr.displayInfo()));
        groupRepository.removeGroups(removeGroups);
    }

    public void changeGroup(List<Group> changeGroups, int number) {
        Scanner scanner = new Scanner(System.in);
        int index = 0;
        Group groupChange = null;
        for (Group n : changeGroups) {
            if (number == n.getGroup_name()) {
                index = changeGroups.indexOf(n);
                System.out.println("Ведите новые данные по группе: ");
                System.out.println("номер группы: ");
                int group_name = scanner.nextInt();
                System.out.println("Курс: ");
                int course = scanner.nextInt();
                System.out.println("год образования группы: ");
                int year_of_admission = scanner.nextInt();
                System.out.println("год окончания: ");
                int year_of_issue = scanner.nextInt();
                groupChange = new Group(group_name, course, n.getStudents(), n.getTeacher(), year_of_admission, year_of_issue);
            }
        }
        changeGroups.set(index, groupChange);
        changeGroups.forEach(group -> System.out.println(group.displayInfo()));
        groupRepository.setGroups(changeGroups);
    }

    public void sortRelease(List<Group> groups) {
        Comparator groupComparator = new GroupComparator();
        groups.stream()
                .filter(s -> s.getYear_of_issue() <= 2024)
                .sorted(groupComparator)
                .forEach(s -> System.out.println(((Group) s).displayInfo()));

    }
    public void String(List<Group>groups){
        groups.stream()
                .forEach(group -> System.out.println(((Group)group).displayInfo()));
    }
}
