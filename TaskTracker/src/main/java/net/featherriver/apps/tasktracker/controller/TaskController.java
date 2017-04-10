package net.featherriver.apps.tasktracker.controller;

import net.featherriver.apps.tasktracker.model.Task;
import net.featherriver.apps.tasktracker.repository.TaskRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by lawb2 on 4/7/2017.
 */
@RestController
@RequestMapping("api/v1/")
public class TaskController {

    @Autowired
    private TaskRepository taskRepository;

    @RequestMapping(value = "tasks", method = RequestMethod.GET)
    public List<Task> list() {
        return taskRepository.findAll();
    }

    @RequestMapping(value = "tasks", method = RequestMethod.POST)
    public Task create(@RequestBody Task task) {
        return taskRepository.saveAndFlush(task);
    }

    @RequestMapping(value = "tasks/{id}", method = RequestMethod.GET)
    public Task get(@PathVariable Long id){
        return taskRepository.findOne(id);
    }

    @RequestMapping(value = "tasks/{id}", method = RequestMethod.PUT)
    public Task update(@PathVariable Long id, @RequestBody Task task) {
        Task existingTask = taskRepository.findOne(id);
        BeanUtils.copyProperties(task, existingTask);
        return taskRepository.saveAndFlush(existingTask);
    }

    @RequestMapping(value = "tasks/{id}", method = RequestMethod.DELETE)
    public Task delete(@PathVariable Long id) {
        Task existingTask = taskRepository.findOne(id);
        taskRepository.delete(existingTask);
        return existingTask;
    }
}
