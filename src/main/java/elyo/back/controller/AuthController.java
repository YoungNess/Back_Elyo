package elyo.back.controller;

import elyo.back.model.Student;
import elyo.back.service.StudentService;

import java.util.Optional;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final StudentService studentService;

    public AuthController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/login")
    public Optional<Student> login(@RequestParam String studentNumber){
        return studentService.login(studentNumber);
    }

    @PostMapping("/add")
    public Student addStudent(@RequestBody Student student){
        return studentService.create(student);
    }
}