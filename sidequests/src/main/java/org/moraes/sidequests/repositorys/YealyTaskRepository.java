package org.moraes.sidequests.repositorys;

import org.moraes.sidequests.domain.tasks.YearlyTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface YealyTaskRepository extends JpaRepository<YearlyTask, Integer> {
}
