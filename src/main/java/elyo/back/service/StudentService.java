package elyo.back.service;

import elyo.back.model.Student;
import elyo.back.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Optional<Student> login(String studentNumber){
        return studentRepository.findByStudentNumber(studentNumber);
    }

    public Student create(Student student){
        return studentRepository.save(student);
    }

}