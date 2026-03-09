package elyo.back.repository;

import elyo.back.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, String> {

    Optional<Student> findByStudentNumber(String studentNumber);



}