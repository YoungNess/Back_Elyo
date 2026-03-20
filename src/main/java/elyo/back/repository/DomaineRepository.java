package elyo.back.repository;

import elyo.back.model.Domaine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DomaineRepository extends JpaRepository<Domaine, Long> {
}