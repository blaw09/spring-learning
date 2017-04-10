package net.featherriver.apps.tasktracker.repository;

import net.featherriver.apps.tasktracker.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by lawb2 on 4/7/2017.
 */
public interface TaskRepository extends JpaRepository<Task, Long> {
}
