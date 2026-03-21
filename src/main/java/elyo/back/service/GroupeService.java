package elyo.back.service;

import elyo.back.model.Groupe;
import elyo.back.repository.GroupeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GroupeService {

    private final GroupeRepository groupeRepository;

    public GroupeService(GroupeRepository groupeRepository) {
        this.groupeRepository = groupeRepository;
    }

    public List<Groupe> getAll() {
        return groupeRepository.findAll();
    }

    public Optional<Groupe> getById(Long id) {
        return groupeRepository.findById(id);
    }

    public Groupe create(Groupe groupe) {
        return groupeRepository.save(groupe);
    }
}
