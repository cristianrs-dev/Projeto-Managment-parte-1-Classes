package br.com.classes;

public class Servico extends PessoaJuridica{
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
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

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
        System.out.println("Nome:.."+this.getNome());
        System.out.println("Cnpj:.."+this.getCnpj());
        System.out.println("Descricao:.."+this.getDescricao());
    }
    
}
