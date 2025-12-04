package com.mariadb.todo.repositories;

import com.mariadb.todo.domain.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends CrudRepository<Task, Long> {
    // CRUD standard fourni par CrudRepository
}
