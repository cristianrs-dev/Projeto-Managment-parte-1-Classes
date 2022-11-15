package br.com.classes;

public class Secretaria extends PessoaFisica{
    private int idSecretaria;
    public Secretaria(int idSecretaria ,String nome, char sexo, String rg, String cpf) {
        super(nome, sexo, rg, cpf);
    }

    public int getIdSecretaria() {
        return idSecretaria;
    }

    public void setIdSecretaria(int idSecretaria) {
        this.idSecretaria = idSecretaria;
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
           System.out.println("---------Dados Secretaria-------");
           System.out.println("Codigo:.."+this.getIdSecretaria());
           System.out.println("Secretaria------------");
           System.out.println("Nome:.."+this.getNome());
           System.out.println("Sexo:.."+this.getSexo());
           System.out.println("Rg:.."+this.getRg());
           System.out.println("Cpf:.."+this.getCpf()); 
    }
    
}
