package ssot_manager.controller;

import org.springframework.web.bind.annotation.*;
import ssot_manager.dto.FormacaoAcademicaDTO;
import ssot_manager.entity.FormacaoAcademica;
import ssot_manager.service.FormacaoAcademicaService;

import java.util.List;

@RestController
@RequestMapping("/formacoes")
public class FormacaoAcademicaController {

    private final FormacaoAcademicaService service;

    public FormacaoAcademicaController(FormacaoAcademicaService service) {
        this.service = service;
    }

    @PostMapping
    public FormacaoAcademica criar(@RequestBody FormacaoAcademicaDTO dto) {
        return service.salvar(dto);
    }

    @GetMapping
    public List<FormacaoAcademica> listar() {
        return service.listar();
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}