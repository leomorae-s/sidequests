package org.moraes.sidequests.repositorys;

import org.moraes.sidequests.DTOs.DailyTaskDTO;
import org.moraes.sidequests.domain.tasks.DailyTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
@EnableJpaRepositories
public interface DailyTaskRepository extends JpaRepository<DailyTask, Integer> {
}
