package br.com.classes;

import java.time.LocalDate;

public class Espaco {
    private int idEspaco;
    private String[] descricao;
    private LocalDate horaInicio;
    private LocalDate horaTermino;


    public Espaco(int idEspaco, String[] descricao, LocalDate horaInicio, LocalDate horaTermino) {
        this.idEspaco = idEspaco;
        this.descricao = descricao;
        this.horaInicio = horaInicio;
        this.horaTermino = horaTermino;
    }

    public String[] getDescricao() {
        return descricao;
    }

    public void setDescricao(String[] descricao) {
        this.descricao = descricao;
    }

    public LocalDate getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalDate horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalDate getHoraTermino() {
        return horaTermino;
    }

    public void setHoraTermino(LocalDate horaTermino) {
        this.horaTermino = horaTermino;
    }
    
    public void mostrarEspaco(){
        System.out.println("descricao:.."+this.getDescricao());
        System.out.println("inicio:.."+this.getHoraInicio());
        System.out.println("termino:.."+this.getHoraTermino());
    }
    
    
}
