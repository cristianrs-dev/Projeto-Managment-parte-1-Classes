package br.com.classes;

public class Funcionario extends PessoaFisica{
    private int idCondominio;
    private Cargo cargo;
    private int idFuncionario;

    public Funcionario(int idCondominio, Cargo cargo, int idCargo, String nome, char sexo, String rg, String cpf) {
        super(nome, sexo, rg, cpf);
        this.idCondominio = idCondominio;
        this.cargo = cargo;
        this.idFuncionario = idCargo;
    }

    public int getIdCondominio() {
        return idCondominio;
    }

    public void setIdCondominio(int idCondominio) {
        this.idCondominio = idCondominio;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
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
            System.out.println("---------Dados Funcionario----------");
            System.out.println("Condominio:.."+this.getIdCondominio());
            System.out.println("Codigo:.."+this.getIdFuncionario());
            System.out.println("Nome:.."+this.getNome());
            System.out.println("Sexo:.."+this.getSexo());
            System.out.println("Rg:.."+this.getRg());
            System.out.println("Cpf:.."+this.getCpf());
           
        
       
    }

    
    
    
}
