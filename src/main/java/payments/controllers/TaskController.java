package payments.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import payments.models.Task;
import payments.services.TaskService;

import java.util.List;

@Controller
public class TaskController {

    //wstrzykniemy instancję serwisu wpisów - zostanie utworzona przy starcie serwera i będzie przechowywana w kontekście Springa
    @Autowired
    TaskService taskService;

    //utworzenie metody allTasks zwracającej doprzeglądarki wszystki wpisy
    @RequestMapping("/tasks")
    public  String allTasks(Model model){
        //pobieramy wszystkie opublikowane w bazie danych wpisy
        List<Task> tasks = taskService.getPublishedTasks();
        //dodajemy wpisy do modelu
        model.addAttribute("tasks", tasks);
        //zwracamy lokalizację pliku html w folderze resources/templates
        return "tasks/allTasks";
    }

}
