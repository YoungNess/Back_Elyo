package elyo.back.service;

import elyo.back.model.Image;
import elyo.back.repository.ImageRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImageService {

    private final ImageRepository imageRepository;

    public ImageService(ImageRepository imageRepository) {
        this.imageRepository = imageRepository;
    }

    public List<Image> getBySaeId(Long saeId) {
        return imageRepository.findBySaeId(saeId);
    }

    public Image create(Image image) {
        return imageRepository.save(image);
    }
}
