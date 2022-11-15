package br.com.classes;

public class Apartamento {
    private int idAp;
    private byte numeroApartamento;
    private byte qtdQuarto;
    private byte andar;
    private float valor;

    public Apartamento(int idAp, byte numeroApartamento, byte qtdQuarto, byte andar, float valor) {
        this.idAp = idAp;
        this.numeroApartamento = numeroApartamento;
        this.qtdQuarto = qtdQuarto;
        this.andar = andar;
        this.valor = valor;
    }

    public int getIdAp() {
        return idAp;
    }

    public void setIdAp(int idAp) {
        this.idAp = idAp;
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

  

    public void mostrarApartamento(){
            System.out.println("cod:.."+this.getIdAp());
            System.out.println("numero:.."+this.getNumeroApartamento());
            System.out.println("quartos:.."+this.getQtdQuarto());
            System.out.println("andar:.."+this.getAndar());
            System.out.println("valor:.."+this.getValor());
           
        
        
    }
    
}
