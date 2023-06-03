package Entities;

import java.util.Date;

public class Task {
    private String title;
    private String description;
    private Date createdAt;
    private boolean isFinished;

    public Task(String title, String description, Date createdAt) {
        this.title = title;
        this.description = description;
        this.createdAt = createdAt;
        this.isFinished = false;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public boolean isFinished() {
        return isFinished;
    }
}
