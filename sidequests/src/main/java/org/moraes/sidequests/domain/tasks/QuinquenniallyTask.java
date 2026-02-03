package org.moraes.sidequests.domain.tasks;

import jakarta.persistence.*;
import org.jspecify.annotations.NonNull;

import java.util.Objects;

@Entity(name = "quinquennially")
public class QuinquenniallyTask {

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

    public QuinquenniallyTask(@NonNull String name, String description) {
        this.name = name;
        this.description = description;
    }

//    public Integer getId() {
//        return id;
//    }

    public @NonNull String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

//    public Integer getUserId() {
//        return userId;
//    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        QuinquenniallyTask that = (QuinquenniallyTask) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description);
    }

    @Override
    public String toString() {
        return "QuinquenniallyTask{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
