package br.com.classes;

public class Apartamento {
    private int id;
    private byte numeroApartamento;
    private byte qtdQuarto;
    private byte andar;
    private float valor;
    private Condominio condominio;

   

    public Apartamento(int id, byte numeroApartamento, byte qtdQuarto, byte andar, float valor, Condominio condominio) {
        this.id = id;
        this.numeroApartamento = numeroApartamento;
        this.qtdQuarto = qtdQuarto;
        this.andar = andar;
        this.valor = valor;
        this.condominio =condominio;
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

    public Condominio getCondominio() {
        return condominio;
    }

    public void setCondominio(Condominio condominio) {
        this.condominio = condominio;
    }

    
    
    public void mostrarApartamento(){
            System.out.println("----------Dados Apartamento---------");
            System.out.println("Condominio:.."+this.getCondominio());
            System.out.println("cod:.."+this.getId());
            System.out.println("numero:.."+this.getNumeroApartamento());
            System.out.println("quartos:.."+this.getQtdQuarto());
            System.out.println("andar:.."+this.getAndar());
            System.out.println("valor:.."+this.getValor());
            
    }
    
}
