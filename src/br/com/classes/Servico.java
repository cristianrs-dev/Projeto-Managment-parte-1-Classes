package br.com.classes;

public class Servico extends PessoaJuridica{
    private String[] descricao;

    public Servico(String[] descricao, String nome, String cnpj) {
        super(nome, cnpj);
        this.descricao = descricao;
    }

    public String[] getDescricao() {
        return descricao;
    }

    public void setDescricao(String[] descricao) {
        this.descricao = descricao;
    }

    @Override
    public void mostrarDadosEmpresa() {
        System.out.println("Nome:.."+this.getNome());
        System.out.println("Cnpj:.."+this.getCnpj());
        for(int i=0; i<20; i++){
        System.out.println("Servico:.."+this.getDescricao()[i]);
        }
    }
    
}
