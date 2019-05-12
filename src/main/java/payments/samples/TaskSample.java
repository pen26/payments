package payments.samples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import payments.models.Task;
import payments.repositories.TaskRepository;

import java.time.LocalDateTime;
import java.time.Month;

@Component
public class TaskSample implements CommandLineRunner {
    @Autowired
    TaskRepository taskRepository;

    @Override
    public void run(String... args) throws Exception {
        Task task1;
        task1 = new Task(
                "Zlecenie 1",
                "To jest opis klienta",
                "To jest opis pracownika",
                "pracownik1",
                LocalDateTime.now(),
                null);
        Task task2 = new Task(
                "Zlecenie 2",
                "To jest opis klienta",
                "To jest opis pracownika",
                "pracownik2",
                LocalDateTime.now(),
                LocalDateTime.now());

        taskRepository.save(task1);
        taskRepository.save(task2);
    }
}
