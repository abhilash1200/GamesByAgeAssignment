package student;

import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.HashSetValuedHashMap;
import java.util.*;

public class AgeGroupDivider {
    ArrayList<EventRegistrationInfo> student;
    MultiValuedMap<String, EventRegistrationInfo> groupMapper = new HashSetValuedHashMap<>();
    public AgeGroupDivider(ArrayList<EventRegistrationInfo> student) {
        this.student = student;
    }
    public MultiValuedMap<String, EventRegistrationInfo> groupStudentsByAge() {
        student.stream().forEach(s -> {
            if (s.getAge() >= 20 && s.getAge() <= 22) {
                groupMapper.put("Group A", s);
            }
            if (s.getAge() >= 23 && s.getAge() <= 25)
                groupMapper.put("Group B", s);
        });
        return groupMapper;
    }
    public void getStudentsByGroups() {
        System.out.println("Students Under Group A:");
        groupMapper.get("Group A").stream().forEach(g -> System.out.println(g.getStudentName()));
        System.out.println("Students Under Group B:");
        groupMapper.get("Group B").stream().forEach(g -> System.out.println(g.getStudentName()));
    }

}