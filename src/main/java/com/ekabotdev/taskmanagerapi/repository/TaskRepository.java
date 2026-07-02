package com.ekabotdev.taskmanagerapi.repository;


import com.ekabotdev.taskmanagerapi.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository  extends JpaRepository<Task, Long> {

}
