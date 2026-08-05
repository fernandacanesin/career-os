package ssot_manager.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "experiencias_profissionais")
public class ExperienciaProfissional {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String empresa;

    private String cargo;

    private String dataInicio;

    private String dataFim;

    @Column(length = 3000)
    private String descricaoCargo;

    @Column(length = 3000)
    private String atividadesDesenvolvidas;

    @Column(length = 2000)
    private String ferramentasTecnologias;

    @Column(length = 3000)
    private String resultadosConquistas;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;


    // Construtor vazio (necessário para JPA)
    public ExperienciaProfissional() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }


    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }


    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }


    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }


    public String getDescricaoCargo() {
        return descricaoCargo;
    }

    public void setDescricaoCargo(String descricaoCargo) {
        this.descricaoCargo = descricaoCargo;
    }


    public String getAtividadesDesenvolvidas() {
        return atividadesDesenvolvidas;
    }

    public void setAtividadesDesenvolvidas(String atividadesDesenvolvidas) {
        this.atividadesDesenvolvidas = atividadesDesenvolvidas;
    }


    public String getFerramentasTecnologias() {
        return ferramentasTecnologias;
    }

    public void setFerramentasTecnologias(String ferramentasTecnologias) {
        this.ferramentasTecnologias = ferramentasTecnologias;
    }


    public String getResultadosConquistas() {
        return resultadosConquistas;
    }

    public void setResultadosConquistas(String resultadosConquistas) {
        this.resultadosConquistas = resultadosConquistas;
    }


    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}