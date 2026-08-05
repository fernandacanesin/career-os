package ssot_manager.controller;

import org.springframework.web.bind.annotation.*;
import ssot_manager.entity.ExperienciaProfissional;
import ssot_manager.service.ExperienciaProfissionalService;

import java.util.List;

@RestController
@RequestMapping("/experiencias")
public class ExperienciaProfissionalController {

    private final ExperienciaProfissionalService service;

    public ExperienciaProfissionalController(
            ExperienciaProfissionalService service) {
        this.service = service;
    }

    @PostMapping
    public ExperienciaProfissional criar(
            @RequestBody ExperienciaProfissional experiencia) {
        return service.salvar(experiencia);
    }

    @GetMapping
    public List<ExperienciaProfissional> listar() {
        return service.listar();
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        service.excluir(id);
    }
    }