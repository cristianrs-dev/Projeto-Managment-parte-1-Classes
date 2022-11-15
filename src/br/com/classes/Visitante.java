package br.com.classes;

public class Visitante extends PessoaFisica{
    private int idVisita;
    public Visitante(int idVisita,String nome, char sexo, String rg, String cpf) {
        super(nome, sexo, rg, cpf);
        this.idVisita=idVisita;
    }

    public int getIdVisita() {
        return idVisita;
    }

    public void setIdVisita(int idVisita) {
        this.idVisita = idVisita;
    }
    
    
/*
    public void mostrarDadosVisitante() {
        System.out.println("Visita----------------");
        for(int i=0; i<20; i++){
            System.out.println("Nome:.."+this.getNome()[i]);
            System.out.println("Sexo:.."+this.getSexo()[i]);
            System.out.println("Rg:.."+this.getRg()[i]);
            System.out.println("Cpf:.."+this.getCpf()[i]);
        }    }
*/
    @Override
    public void mostrarDadosPessoa() {
        System.out.println("Visita----------------");
            System.out.println("Codigo:.."+this.getIdVisita());
            System.out.println("Nome:.."+this.getNome());
            System.out.println("Sexo:.."+this.getSexo());
            System.out.println("Rg:.."+this.getRg());
            System.out.println("Cpf:.."+this.getCpf());
    }
    
}
