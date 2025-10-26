package amp2;

import java.util.*;

public class TaskUtil {

    Task findMostFrequent(Collection<Task> tasks) {

        Task mostFrequentTask = new Task();
        Map<Task, Long> map = new HashMap<>();
        long counterId = 0;

        for (Task task : tasks) {
            if (!map.containsKey(task) && !map.containsValue(1l)) {
                map.put(task, Long.valueOf(1));
            } else {
                counterId++;
                map.put(task,counterId);
            }

        }

        return mostFrequentTask;
    }

}
