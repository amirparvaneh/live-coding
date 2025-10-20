package ampada;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Ampada {

    public static void main(String[] args) {

        ProjectUtil test = new ProjectUtil();
        Project instance1 = new Project();
        Project instance2 = new Project();
        instance1.setName("p1");
        Date date1 = Date.from(Instant.now());
        instance1.setStartDate(date1);
        instance2.setName("p2");
        Project instance3 = new Project();
        instance3.setName("P3");
        Date date3 = new Date(2026, 12, 1);

        List<Project> projects2 = List.of(
                new Project("A", new Date(2024, 1, 1)),
                new Project("B", new Date(2025, 5, 10)),
                new Project("C", new Date(2023, 7, 20))
        );

        instance3.setStartDate(date3);
        Date date2 = Date.from(Instant.now().minusSeconds(2000));
        instance2.setStartDate(date2);
        List<Project> projectList = new ArrayList<>();
        projectList.add(instance1);
        projectList.add(instance2);
        projectList.add(instance3);
        Project projectWithMaxDate = test.findProjectWithMaxDate(projectList);
        System.out.println(projectWithMaxDate.getStartDate());
        System.out.println(projectWithMaxDate.getName());
        System.out.println(test.findProjectWithMaxDate(projects2).getName());
    }

}
