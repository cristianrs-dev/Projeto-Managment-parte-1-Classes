package br.com.classes;


public class Morador extends PessoaFisica{
    private Apartamento apartamento;
    private Veiculo veiculo;
    private Visitante visita;
    private Secretaria secretaria;

    public Morador(Apartamento apartamento, Veiculo veiculo, Visitante visita, Secretaria secretaria, String nome, char sexo, String rg, String cpf) {
        super(nome, sexo, rg, cpf);
        this.apartamento = apartamento;
        this.veiculo = veiculo;
        this.visita = visita;
        this.secretaria = secretaria;
    }

    public Apartamento getApartamento() {
        return apartamento;
    }

    public void setApartamento(Apartamento apartamento) {
        this.apartamento = apartamento;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Visitante getVisita() {
        return visita;
    }

    public void setVisita(Visitante visita) {
        this.visita = visita;
    }

    public Secretaria getSecretaria() {
        return secretaria;
    }

    public void setSecretaria(Secretaria secretaria) {
        this.secretaria = secretaria;
    }
    
    
 
    @Override
    public void mostrarDadosPessoa() {
        
            System.out.println("Morador---------------");
            System.out.println("Nome:.."+this.getNome());
            System.out.println("Sexo:.."+this.getSexo());
            System.out.println("Rg:.."+this.getRg());
            System.out.println("Cpf:.."+this.getCpf());
            apartamento.mostrarApartamento();
            veiculo.mostrarVeiculo();
            visita.mostrarDadosPessoa();
            secretaria.mostrarDadosPessoa();
       
    }
    
    
    
    
}
