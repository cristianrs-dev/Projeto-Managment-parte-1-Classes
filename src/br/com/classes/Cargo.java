 package br.com.classes;

import java.time.LocalDate;

public class Cargo {
    private int idCargo;
    private String Funcao;
    private float salario;
    private LocalDate dataAdmissao;
    private LocalDate dataDemissao;

    public Cargo(int idCargo,String Funcao, float salario, LocalDate dataAdmissao, LocalDate dataDemissao) {
        this.idCargo=idCargo;
        this.Funcao = Funcao;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
        this.dataDemissao = dataDemissao;
    }

    public int getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(int idCargo) {
        this.idCargo = idCargo;
    }

    public String getFuncao() {
        return Funcao;
    }

    public void setFuncao(String Funcao) {
        this.Funcao = Funcao;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public LocalDate getDataDemissao() {
        return dataDemissao;
    }

    public void setDataDemissao(LocalDate dataDemissao) {
        this.dataDemissao = dataDemissao;
    }

    public void mostrarCargo(){
                System.out.println("---------Dados do Cargo-----------");
                System.out.println("Codigo:.."+this.getIdCargo());
                System.out.println("funcao:.."+this.getFuncao());
                System.out.println("salario:.."+this.getSalario());
                System.out.println("admissao:.."+this.getDataAdmissao());
                System.out.println("demissao:.."+this.getDataDemissao());
    }
    
}
