package org.moraes.sidequests.domain.tasks;

import jakarta.persistence.*;
import org.jspecify.annotations.NonNull;

import java.util.Objects;

@Entity(name = "yearly")
public class YearlyTask {

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

    public YearlyTask(@NonNull String name, String description) {
        this.name = name;
        this.description = description;
    }

//    public long getId() {
//        return id;
//    }

    public @NonNull String getName() {
        return name;
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
        YearlyTask that = (YearlyTask) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(description, that.description) && Objects.equals(completed, that.completed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, completed);
    }

    @Override
    public String toString() {
        return "YearlyTask{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", completed=" + completed +
                '}';
    }
}
