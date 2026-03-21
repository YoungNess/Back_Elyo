package elyo.back.repository;

import elyo.back.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ImageRepository extends JpaRepository<Image, Long> {

    List<Image> findBySaeId(Long saeId);
}