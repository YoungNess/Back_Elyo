package elyo.back.service;

import elyo.back.model.Domaine;
import elyo.back.repository.DomaineRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DomaineService {

    private final DomaineRepository domaineRepository;

    public DomaineService(DomaineRepository domaineRepository) {
        this.domaineRepository = domaineRepository;
    }

    public List<Domaine> getAll() {
        return domaineRepository.findAll();
    }

    public Optional<Domaine> getById(Long id) {
        return domaineRepository.findById(id);
    }

    public Domaine create(Domaine domaine) {
        return domaineRepository.save(domaine);
    }
}
