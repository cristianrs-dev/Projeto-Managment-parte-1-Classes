package br.com.classes;

public class Secretaria extends PessoaFisica{
    private int id;
    public Secretaria(int idSecretaria ,String nome, char sexo, String rg, String cpf) {
        super(nome, sexo, rg, cpf);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
           System.out.println("Codigo:.."+this.getId());
           System.out.println("Secretaria------------");
           System.out.println("Nome:.."+this.getNome());
           System.out.println("Sexo:.."+this.getSexo());
           System.out.println("Rg:.."+this.getRg());
           System.out.println("Cpf:.."+this.getCpf()); 
    }
    
}
