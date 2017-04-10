package net.featherriver.apps.tasktracker.repository;

import net.featherriver.apps.tasktracker.model.TaskTimeLogging;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by lawb2 on 4/10/2017.
 */
public interface TaskTimeLoggingRepository extends JpaRepository<TaskTimeLogging, Long> {
}
