package br.com.classes;

public class Veiculo {
    private int idVeiculo;
    private String tipo;
    private String modelo;
    private String placa;
    private String cor;

    public Veiculo(int idVeiculo,String tipo, String modelo, String placa, String cor) {
        this.idVeiculo=idVeiculo;
        this.tipo = tipo;
        this.modelo = modelo;
        this.placa = placa;
        this.cor = cor;
    }

    public int getIdVeiculo() {
        return idVeiculo;
    }

    public void setIdVeiculo(int idVeiculo) {
        this.idVeiculo = idVeiculo;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    
    
    public void mostrarVeiculo(){
        System.out.println("Veiculo---------------");
       
            System.out.println("Tipo:.."+this.getTipo());
            System.out.println("Modelo:.."+this.getModelo());
            System.out.println("Placa:.."+this.getPlaca());
            System.out.println("Cor:.."+this.getModelo());
        
    }
    
    
}
