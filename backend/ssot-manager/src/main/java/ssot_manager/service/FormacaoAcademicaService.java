package ssot_manager.service;

import org.springframework.stereotype.Service;
import ssot_manager.dto.FormacaoAcademicaDTO;
import ssot_manager.entity.FormacaoAcademica;
import ssot_manager.entity.Usuario;
import ssot_manager.repository.FormacaoAcademicaRepository;
import ssot_manager.repository.UsuarioRepository;

import java.util.List;

@Service
public class FormacaoAcademicaService {

    private final FormacaoAcademicaRepository repository;
    private final UsuarioRepository usuarioRepository;

    public FormacaoAcademicaService(
            FormacaoAcademicaRepository repository,
            UsuarioRepository usuarioRepository) {

        this.repository = repository;
        this.usuarioRepository = usuarioRepository;
    }

    public FormacaoAcademica salvar(FormacaoAcademicaDTO dto) {

        Usuario usuario = usuarioRepository.findById(dto.getUsuarioId())
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

        FormacaoAcademica formacao = new FormacaoAcademica();

        formacao.setCurso(dto.getCurso());
        formacao.setInstituicao(dto.getInstituicao());
        formacao.setNivel(dto.getNivel());
        formacao.setDataInicio(dto.getDataInicio());
        formacao.setDataFim(dto.getDataFim());
        formacao.setUsuario(usuario);

        return repository.save(formacao);
    }

    public List<FormacaoAcademica> listar() {
        return repository.findAll();
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}