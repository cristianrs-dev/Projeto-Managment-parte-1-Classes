package br.com.classes;

public class Secretaria extends PessoaFisica{

    public Secretaria(String nome, char sexo, String rg, String cpf) {
        super(nome, sexo, rg, cpf);
    }

    

   /*
    public void mostrarDadosSecretaria() {
        System.out.println("Secretaria------------");
        System.out.println("Nome:.."+this.getNome());
        System.out.println("Sexo:.."+this.getSexo());
        System.out.println("Rg:.."+this.getRg());
        System.out.println("Cpf:.."+this.getCpf());
    }
*/
    @Override
    public void mostrarDadosPessoa() {
       
           System.out.println("Secretaria------------");
           System.out.println("Nome:.."+this.getNome());
           System.out.println("Sexo:.."+this.getSexo());
           System.out.println("Rg:.."+this.getRg());
           System.out.println("Cpf:.."+this.getCpf()); 
        
        
    }
    
}
