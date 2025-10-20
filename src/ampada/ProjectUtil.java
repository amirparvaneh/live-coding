package ampada;

import java.util.Collection;
import java.util.Date;

public class ProjectUtil {

    Project findProjectWithMaxDate(Collection<Project> projects) {
        Date maxDate = null;
        Project result = new Project();
        for (Project project : projects) {
            Date currentDate = project.getStartDate();
            maxDate = project.getStartDate();
            if (currentDate.after(maxDate)) {
                maxDate = currentDate;
            }
            result.setName(project.getName());
            result.setStartDate(maxDate);
        }
        return result;
    }
}
