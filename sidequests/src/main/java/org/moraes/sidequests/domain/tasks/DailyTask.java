package org.moraes.sidequests.domain.tasks;

import jakarta.persistence.*;
import org.jspecify.annotations.NonNull;
import java.util.Objects;

@Entity(name = "daily_tasks")
public class DailyTask {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name")
    @NonNull
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "completed")
    private Boolean completed = false;
//    @Column(name = "user_id")
//    private Integer userId;

    public DailyTask(@NonNull String name, String description) {
        this.name = name;
        this.description = description;
    }

    public @NonNull String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public Boolean getCompleted() {
        return completed;
    }

//    public Integer getUserId() {
//        return userId;
//    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        DailyTask dailyTask = (DailyTask) o;
        return Objects.equals(id, dailyTask.id) && Objects.equals(name, dailyTask.name) && Objects.equals(description, dailyTask.description) && Objects.equals(completed, dailyTask.completed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, completed);
    }


}
