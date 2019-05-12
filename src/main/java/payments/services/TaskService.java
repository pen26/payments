package payments.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import payments.models.Task;
import payments.repositories.TaskRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//dołączenie klasy do kontekstu Springa
@Service
public class TaskService {

    //wstrzyknięcie repozytorium wykonanych zadań plus metodę publikującą wpisy
    @Autowired
    TaskRepository taskRepository;

    public List<Task> getPublishedTasks(){
        List<Task> tasks = taskRepository.findAll();
        LocalDateTime now = LocalDateTime.now();
        //predykat, kolekcje?
        Predicate<Task> predicate = task -> {
            return now.isAfter(task.getBegdateTime());
        };
        return tasks.stream().filter(predicate).collect(Collectors.toList());
    }
}
