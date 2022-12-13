package br.com.classes;

public class Servico extends PessoaJuridica{
<<<<<<< HEAD
    private int idServico;
    private String[] descricao;
    private int idCondominio;

    public Servico(int idServico, String[] descricao, int idCondominio, String nome, String cnpj) {
        super(nome, cnpj);
        this.idServico = idServico;
        this.descricao = descricao;
        this.idCondominio = idCondominio;
    }

    

    public int getIdServico() {
        return idServico;
    }

    public void setIdServico(int idServico) {
        this.idServico = idServico;
    }

    

    public String[] getDescricao() {
=======
    private int id;
    private String descricao;
    private Condominio condominio;

    public Servico(int idServico, String descricao,Condominio condominio, int idCondominio, String nome, String cnpj) {
        super(nome, cnpj);
        this.id = idServico;
        this.descricao = descricao;
        this.condominio = condominio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
>>>>>>> 150ea5b9a570a617989f22014f5a50e71530434a
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

<<<<<<< HEAD
    public int getIdCondominio() {
        return idCondominio;
    }

    public void setIdCondominio(int idCondominio) {
        this.idCondominio = idCondominio;
    }
    

    @Override
    public void mostrarDadosEmpresa() {
        System.out.println("codigo:.."+this.getIdServico());
        System.out.println("codigo condominio:.."+this.getIdCondominio());
=======
    public Condominio getCondominio() {
        return condominio;
    }

    public void setCondominio(Condominio condominio) {
        this.condominio = condominio;
    }
    
    
    @Override
    public void mostrarDadosEmpresa() {
        System.out.println("codigo:.."+this.getId());
        System.out.println("codigo condominio:.."+this.getCondominio());
>>>>>>> 150ea5b9a570a617989f22014f5a50e71530434a
        System.out.println("Nome:.."+this.getNome());
        System.out.println("Cnpj:.."+this.getCnpj());
        System.out.println("Descricao:.."+this.getDescricao());
    }
    
}
