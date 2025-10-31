package amp2;

import java.util.*;

public class TaskUtil {

    Task findMostFrequent(Collection<Task> tasks) {

        Map<Long, Long> map = new HashMap<>();
        Task mostFrequentTask = new Task();

        for (Task task : tasks) {
            long counterId = 1;
            if (!map.containsKey(task) && !map.containsValue(1l)) {
                map.put(task.getId(), Long.valueOf(1));
            } else {
                counterId++;
                map.put(task.getId(),counterId);
            }
        }

        return mostFrequentTask;
    }

}
