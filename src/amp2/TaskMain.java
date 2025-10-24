package amp2;

import java.util.Date;
import java.util.List;

public class TaskMain {

    public static void main(String[] args) {

        Date date1 = new Date(2024,3,12);
        Date date2 = new Date(2025,3,12);
        Date date3 = new Date(2023,3,12);
        Date date4 = new Date(2024,3,12);
        Date date5 = new Date(2024,3,12);

        Task task1 = new Task(1, date1);
        Task task2 = new Task(1, date2);
        Task task3 = new Task(1, date3);
        Task task4 = new Task(2, date4);
        Task task5 = new Task(2, date4);
        Task task6 = new Task(3, date5);

        List<Task> tasks = List.of(task1,task2,task3,task4,task5,task6);
        TaskUtil taskUtil = new TaskUtil();
        Task mostFrequent = taskUtil.findMostFrequent(tasks);
        System.out.println(mostFrequent.getId());
     }
}
