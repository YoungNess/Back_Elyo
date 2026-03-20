package elyo.back.repository;

import elyo.back.model.Sae;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface SaeRepository extends JpaRepository<Sae, Long> {

    List<Sae> findBySemestre(int semestre);

    List<Sae> findByDomaineId(Long domaineId);
}