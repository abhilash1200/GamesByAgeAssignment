package student;
import org.apache.commons.collections4.MultiValuedMap;
import org.testng.annotations.Test;
import java.util.*;
import static org.assertj.core.api.Assertions.*;

public class GamesByAgeTest {
    @Test
    public static void student() {
        //Arrange
        ArrayList<EventRegistrationInfo> students = new ArrayList<>();
        EventRegistrationInfo student1 = new EventRegistrationInfo("Abhilash",20,"TV");
        EventRegistrationInfo student2 = new EventRegistrationInfo("Karthik",23,"TV");
        EventRegistrationInfo student3 = new EventRegistrationInfo("Kumar",22,"TV");
        EventRegistrationInfo student4 = new EventRegistrationInfo("Ananya",25,"TV");
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        //Act
        AgeGroupDivider ageGroupDivider = new AgeGroupDivider(students);
        MultiValuedMap<String, EventRegistrationInfo> groupedStudents=  ageGroupDivider.groupStudentsByAge();
        //Assert
        groupedStudents.entries().stream().forEach(g->{
            if(g.getKey().equalsIgnoreCase("Group A"))
                assertThat( g.getValue().getAge()).isBetween(20,22);
            if(g.getKey().equalsIgnoreCase("Group B"))
                assertThat( g.getValue().getAge()).isBetween(23,25);
        });
        //Print Full Details of Students By Groups
        ageGroupDivider.getStudentsByGroups();
    }
}
