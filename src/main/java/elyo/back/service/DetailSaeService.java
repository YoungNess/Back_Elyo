package elyo.back.service;

import elyo.back.model.DetailSae;
import elyo.back.repository.DetailSaeRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DetailSaeService {

    private final DetailSaeRepository detailSaeRepository;

    public DetailSaeService(DetailSaeRepository detailSaeRepository) {
        this.detailSaeRepository = detailSaeRepository;
    }

    public Optional<DetailSae> getById(Long id) {
        return detailSaeRepository.findById(id);
    }

    public DetailSae create(DetailSae detailSae) {
        return detailSaeRepository.save(detailSae);
    }
}