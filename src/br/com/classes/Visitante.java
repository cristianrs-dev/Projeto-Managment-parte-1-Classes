package br.com.classes;

public class Visitante extends PessoaFisica{
    private int id;
    public Visitante(int idVisita,String nome, char sexo, String rg, String cpf) {
        super(nome, sexo, rg, cpf);
        this.id=idVisita;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    @Override
    public void mostrarDadosPessoa() {
        System.out.println("Visita----------------");
            System.out.println("Codigo:.."+this.getId());
            System.out.println("Nome:.."+this.getNome());
            System.out.println("Sexo:.."+this.getSexo());
            System.out.println("Rg:.."+this.getRg());
            System.out.println("Cpf:.."+this.getCpf());
    }
    
}
