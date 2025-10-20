package amp2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class TaskUtil {

    Task findMostFrequent(Collection<Task> tasks) {
        long counter = 1;
        Task mostFrequentTask = new Task();
        Map<Task, Long> map = new HashMap<>();

        for (Task task : tasks) {
            if (!map.containsKey(task) && ) {
                map.put(task,Long.valueOf(1));
            } else {
                counter = map.get(task);
                long resultCounter = counter++;
                map.put(task, resultCounter);
            }
        }

        for (Map.Entry<Task, Long> result : map.entrySet()) {
            long frequentValue = 0;
            long count = 0;
            if (result.getValue() == frequentValue) {

            }
            mostFrequentTask = result.getValue();
        }



        return ;
    }

}
