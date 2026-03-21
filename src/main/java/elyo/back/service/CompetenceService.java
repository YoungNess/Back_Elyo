package elyo.back.service;

import elyo.back.model.Competence;
import elyo.back.repository.CompetenceRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompetenceService {

    private final CompetenceRepository competenceRepository;

    public CompetenceService(CompetenceRepository competenceRepository) {
        this.competenceRepository = competenceRepository;
    }

    public List<Competence> getAll() {
        return competenceRepository.findAll();
    }

    public Optional<Competence> getById(Long id) {
        return competenceRepository.findById(id);
    }

    public Competence create(Competence competence) {
        return competenceRepository.save(competence);
    }
}
