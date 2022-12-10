package br.com.classes;

public class Funcionario extends PessoaFisica{
    
    private Cargo cargo;
    private Condominio condominio;

    public Funcionario(Cargo cargo, Condominio condominio, String nome, char sexo, String rg, String cpf) {
        super(nome, sexo, rg, cpf);
        this.cargo = cargo;
        this.condominio = condominio;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Condominio getCondominio() {
        return condominio;
    }

    public void setCondominio(Condominio condominio) {
        this.condominio = condominio;
    }
    
    
    @Override
    public void mostrarDadosPessoa() {
            System.out.println("---------Dados Funcionario----------");
            System.out.println("Condominio:.."+this.getCondominio());
            System.out.println("Cargo:.."+this.getCargo());
            System.out.println("Nome:.."+this.getNome());
            System.out.println("Sexo:.."+this.getSexo());
            System.out.println("Rg:.."+this.getRg());
            System.out.println("Cpf:.."+this.getCpf());
           
        
       
    }

    
    
    
}
