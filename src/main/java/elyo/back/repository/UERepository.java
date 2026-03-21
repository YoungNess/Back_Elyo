package elyo.back.repository;

import elyo.back.model.UE;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UERepository extends JpaRepository<UE, Long> {

    List<UE> findBySemestre(int semestre);
}
