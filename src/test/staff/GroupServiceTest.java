package test.staff;

import com.belhard.lesson10.model.Group;
import com.belhard.lesson10.model.Student;
import com.belhard.lesson10.model.staff.Teacher;
import com.belhard.lesson10.repository.GroupRepository;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class GroupServiceTest {
List<Group>groups;
List<Group>groupList;
Group group1;
Group group2;
Group group3;
GroupRepository groupRepository=new GroupRepository();
ArrayList<Student>students1;
    ArrayList<Student>students2;
    ArrayList<Student>students3;
    Teacher teacher2;
    Teacher teacher3;
    Teacher teacher4;

    @Before
    public void setUp() throws Exception {

        group1 = new Group(1, 1, students1, teacher2, 2020, 2025);
        group2 = new Group(2, 1, students2, teacher3, 2019, 2024);
         group3 = new Group(3, 1, students3, teacher4, 2018, 2023);
         groups=new ArrayList<>(){{
             add(group1);
             add(group2);
         }};
         groupList=groups;
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("тест закончен");

    }

    @Test
    public void addGroups() {
        int size=3;
        groupList.add(group3);
        groupRepository.addGroups(groupList);
        assertTrue(size==groupList.size());
    }

    @Test
    public void removeGroups() {
        int size=2;
        groupList.remove(group1);
        groupRepository.removeGroups(groupList);
        assertTrue(size==groupList.size());

    }

    @Test
    public void changeGroup() {
        int index = 1;
        Group groupChange = new Group(4, 2, students2, teacher3, 2020, 2025);
                int group_name=2;
        groups.set(index,groupChange);
        for (Group n : groupList) {
            if (group_name == n.getGroup_name()) {
                index = groupList.indexOf(n);
            }
        }
        groupList.set(index, groupChange);
        groupRepository.setGroups(groupList);
        assertEquals(groups,groupList);
    }
}