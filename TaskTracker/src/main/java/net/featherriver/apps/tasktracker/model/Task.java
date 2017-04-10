package net.featherriver.apps.tasktracker.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by lawb2 on 4/7/2017.
 */
@Entity
public class Task {
    /*
    public enum TaskStatus {
        DEFINED,
        INPROGRESS,
        COMPLETED
    }
    */

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String description;
    String status;
    //Link to project. A project would be a separate class
    //Long projectId;
    String clientName;
    //Link to client. A client would be a separate class
    //Long clientId
    //Link to User Story
    //String userStoryId;
    //task type could be something like ETL, Discover, Dev, QA
    String taskType;
    //time logging? You would have multiple of this of times logged
    //start time and end time and description of what was done during that time
    double estimatedTimeTaken;
    double totalTimeTaken;

    public Task() {}

    public Task(Long id, String description, String status, String clientName, String taskType, double estimatedTimeTaken, double totalTimeTaken) {
        this.id = id;
        this.description = description;
        this.status = status;
        this.clientName = clientName;
        this.taskType = taskType;
        this.estimatedTimeTaken = estimatedTimeTaken;
        this.totalTimeTaken = totalTimeTaken;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public double getEstimatedTimeTaken() {
        return estimatedTimeTaken;
    }

    public void setEstimatedTimeTaken (Double estimatedTimeTaken) {
        this.estimatedTimeTaken = estimatedTimeTaken;
    }

    public double getTotalTimeTaken() {
        return totalTimeTaken;
    }

    public void setTotalTimeTaken(Double totalTimeTaken) {
        this.totalTimeTaken = totalTimeTaken;
    }

}
