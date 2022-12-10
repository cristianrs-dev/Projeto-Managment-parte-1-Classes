package br.com.classes;


public class Morador extends PessoaFisica{
    private int id;
    private String tipo;
    private Apartamento apartamento;
    private Veiculo veiculo;
    private Visitante visita;
    private Secretaria secretaria;
    private Espaco espaco;
    private Servico servico;
    private Condominio condominio;

    public Morador(int id, String tipo, Apartamento apartamento, Veiculo veiculo, Visitante visita, Secretaria secretaria, Espaco espaco, Servico servico,Condominio condominio, String nome, char sexo, String rg, String cpf) {
        super(nome, sexo, rg, cpf);
        this.id = id;
        this.tipo = tipo;
        this.apartamento = apartamento;
        this.veiculo = veiculo;
        this.visita = visita;
        this.secretaria = secretaria;
        this.espaco = espaco;
        this.servico = servico;
        this.condominio = condominio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    public Espaco getEspaco() {
        return espaco;
    }

    public void setEspaco(Espaco espaco) {
        this.espaco = espaco;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public Condominio getCondominio() {
        return condominio;
    }

    public void setCondominio(Condominio condominio) {
        this.condominio = condominio;
    }
    
    @Override
    public void mostrarDadosPessoa() {
        
            System.out.println("Morador---------------");
            System.out.println("Nome:.."+this.getNome());
            System.out.println("Sexo:.."+this.getSexo());
            System.out.println("Rg:.."+this.getRg());
            System.out.println("Cpf:.."+this.getCpf());
            System.out.println("Condominio:.."+this.getCondominio().getNome());
            apartamento.mostrarApartamento();
            veiculo.mostrarVeiculo();
            visita.mostrarDadosPessoa();
            secretaria.mostrarDadosPessoa();
       
    }
    
    
    
    
}
