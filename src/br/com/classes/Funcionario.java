package br.com.classes;

public class Funcionario extends PessoaFisica{
    
    private Cargo cargo;
<<<<<<< HEAD
    private int idCargo;
=======
    private Condominio condominio;
>>>>>>> 150ea5b9a570a617989f22014f5a50e71530434a

    public Funcionario(Cargo cargo, Condominio condominio, String nome, char sexo, String rg, String cpf) {
        super(nome, sexo, rg, cpf);
        this.cargo = cargo;
<<<<<<< HEAD
        this.idCargo = idCargo;
    }

    public int getIdCondominio() {
        return idCondominio;
    }

    public void setIdCondominio(int idCondominio) {
        this.idCondominio = idCondominio;
=======
        this.condominio = condominio;
>>>>>>> 150ea5b9a570a617989f22014f5a50e71530434a
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

<<<<<<< HEAD
    public int getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(int idCargo) {
        this.idCargo = idCargo;
=======
    public Condominio getCondominio() {
        return condominio;
    }

    public void setCondominio(Condominio condominio) {
        this.condominio = condominio;
>>>>>>> 150ea5b9a570a617989f22014f5a50e71530434a
    }
    
    
    @Override
    public void mostrarDadosPessoa() {
            System.out.println("---------Dados Funcionario----------");
<<<<<<< HEAD
            System.out.println("Condominio:.."+this.getIdCondominio());
            System.out.println("Codigo:.."+this.getIdCargo());
=======
            System.out.println("Condominio:.."+this.getCondominio());
            System.out.println("Cargo:.."+this.getCargo());
>>>>>>> 150ea5b9a570a617989f22014f5a50e71530434a
            System.out.println("Nome:.."+this.getNome());
            System.out.println("Sexo:.."+this.getSexo());
            System.out.println("Rg:.."+this.getRg());
            System.out.println("Cpf:.."+this.getCpf());
           
        
       
    }

    
    
    
}
