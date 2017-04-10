package net.featherriver.apps.tasktracker.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by lawb2 on 4/7/2017.
 */
@Entity
public class TaskTimeLogging {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    //Links to task that this time log is for
    Long taskId;
    //a date time format to have when started and ended this log
    Date logStartDate;
    Date logEndDate;
    //a time for duration taken on this time log
    double logTimeDuration;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public Date getLogStartDate() {
        return logStartDate;
    }

    public void setLogStartDate(Date logStartDate) {
        this.logStartDate = logStartDate;
    }

    public Date getLogEndDate() {
        return logEndDate;
    }

    public void setLogEndDate(Date logEndDate) {
        this.logEndDate = logEndDate;
    }

    public double getLogTimeDuration() {
        return logTimeDuration;
    }

    public void setLogTimeDuration(double logTimeDuration) {
        this.logTimeDuration = logTimeDuration;
    }
}
