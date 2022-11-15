package br.com.classes;

public class Funcionario extends PessoaFisica{
    private Cargo cargo;

    public Funcionario(Cargo cargo, String nome, char sexo, String rg, String cpf) {
        super(nome, sexo, rg, cpf);
        this.cargo = cargo;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
    
    /*
    public void mostrarDadosFuncionario() {
        System.out.println("Nome:.."+this.getNome());
        System.out.println("Sexo:.."+this.getSexo());
        System.out.println("Rg:.."+this.getRg());
        System.out.println("Cpf:.."+this.getCpf());
        System.out.println("Cargo:.."+this.getCargo());
    }
*/
    @Override
    public void mostrarDadosPessoa() {
  
            System.out.println("Nome:.."+this.getNome());
            System.out.println("Sexo:.."+this.getSexo());
            System.out.println("Rg:.."+this.getRg());
            System.out.println("Cpf:.."+this.getCpf());
           
        
       
    }

    
    
    
}
