package org.moraes.sidequests.repositorys;

import org.moraes.sidequests.domain.tasks.QuinquenniallyTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuinquenniallyTaskRepository extends JpaRepository<QuinquenniallyTask, Integer> {
}
