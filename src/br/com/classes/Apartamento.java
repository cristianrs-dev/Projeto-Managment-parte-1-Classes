package br.com.classes;

public class Apartamento {
    private int id;
    private byte numeroApartamento;
    private byte qtdQuarto;
    private byte andar;
    private float valor;
    private int idCondominio;

   

    public Apartamento(int idApartamento, byte numeroApartamento, byte qtdQuarto, byte andar, float valor, int idCondominio) {
        this.id = idApartamento;
        this.numeroApartamento = numeroApartamento;
        this.qtdQuarto = qtdQuarto;
        this.andar = andar;
        this.valor = valor;
        this.idCondominio = idCondominio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public byte getNumeroApartamento() {
        return numeroApartamento;
    }

    public void setNumeroApartamento(byte numeroApartamento) {
        this.numeroApartamento = numeroApartamento;
    }

    public byte getQtdQuarto() {
        return qtdQuarto;
    }

    public void setQtdQuarto(byte qtdQuarto) {
        this.qtdQuarto = qtdQuarto;
    }

    public byte getAndar() {
        return andar;
    }

    public void setAndar(byte andar) {
        this.andar = andar;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getIdCondominio() {
        return idCondominio;
    }

    public void setIdCondominio(int idCondominio) {
        this.idCondominio = idCondominio;
    }
    
    public void mostrarApartamento(){
            System.out.println("----------Dados Apartamento---------");
            System.out.println("Condominio:.."+this.getIdCondominio());
            System.out.println("cod:.."+this.getId());
            System.out.println("numero:.."+this.getNumeroApartamento());
            System.out.println("quartos:.."+this.getQtdQuarto());
            System.out.println("andar:.."+this.getAndar());
            System.out.println("valor:.."+this.getValor());
            
    }
    
}
