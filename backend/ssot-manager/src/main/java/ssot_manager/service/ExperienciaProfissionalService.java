package ssot_manager.service;

import org.springframework.stereotype.Service;
import ssot_manager.entity.ExperienciaProfissional;
import ssot_manager.repository.ExperienciaProfissionalRepository;

import java.util.List;

@Service
public class ExperienciaProfissionalService {

    private final ExperienciaProfissionalRepository repository;

    public ExperienciaProfissionalService(
            ExperienciaProfissionalRepository repository) {
        this.repository = repository;
    }

    public ExperienciaProfissional salvar(
            ExperienciaProfissional experiencia) {
        return repository.save(experiencia);
    }

    public List<ExperienciaProfissional> listar() {
        return repository.findAll();
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }

