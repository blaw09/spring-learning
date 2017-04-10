package net.featherriver.apps.tasktracker.controller;

import net.featherriver.apps.tasktracker.model.Task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lawb2 on 4/7/2017.
 */
public class TaskStub {
    private static Map<Long, Task> tasks = new HashMap<Long, Task>();
    private static Long idIndex = 3L;

    //populate initial wrecks
    static {
        Task a = new Task(1L, "description test one", "test status one","test client one", "dev work one", 123d, 123d);
        tasks.put(1L, a);
        Task b = new Task(2L, "description test two", "test status two","test client two", "dev work two", 124d, 124d);
        tasks.put(2L, b);
        Task c = new Task(3L, "description test one", "test status one","test client one", "dev work one", 1235, 1235);
        tasks.put(3L, c);
    }

    public static List<Task> list() {
        return new ArrayList<Task>(tasks.values());
    }

    public static Task create(Task task) {
        idIndex += idIndex;
        task.setId(idIndex);
        tasks.put(idIndex, task);
        return task;
    }

    public static Task get(Long id) {
        return tasks.get(id);
    }

    public static Task update(Long id, Task task) {
        tasks.put(id, task);
        return task;
    }

    public static Task delete(Long id) {
        return tasks.remove(id);
    }
}
