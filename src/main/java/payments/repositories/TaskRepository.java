package payments.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import payments.models.Task;

public interface TaskRepository extends JpaRepository<Task, Integer> {
}
