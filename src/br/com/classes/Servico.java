package br.com.classes;

public class Servico extends PessoaJuridica{
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
        return descricao;
    }

    public void setDescricao(String[] descricao) {
        this.descricao = descricao;
    }

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
        System.out.println("Nome:.."+this.getNome());
        System.out.println("Cnpj:.."+this.getCnpj());
        for(int i=0; i<20; i++){
        System.out.println("Servico:.."+this.getDescricao()[i]);
        }
    }
    
}
