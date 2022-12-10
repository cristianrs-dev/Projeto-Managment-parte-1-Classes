package br.com.classes;

import java.time.LocalDate;

public class Espaco {
    private int id;
    private String descricao;
    private LocalDate horaInicio;
    private LocalDate horaTermino;
    private Condominio condominio;

    public Espaco(int idEspaco, String descricao, LocalDate horaInicio, LocalDate horaTermino, Condominio condominio) {
        this.id = idEspaco;
        this.descricao = descricao;
        this.horaInicio = horaInicio;
        this.horaTermino = horaTermino;
        this.condominio = condominio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
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

    public Condominio getCondominio() {
        return condominio;
    }

    public void setCondominio(Condominio condominio) {
        this.condominio = condominio;
    }
    
    public void mostrarEspaco(){
        System.out.println("----------Espaco Interno------------");
        System.out.println("Condominio:.."+this.getCondominio());
        System.out.println("codigo:.."+this.getId());
        System.out.println("descricao:.."+this.getDescricao());
        System.out.println("inicio:.."+this.getHoraInicio());
        System.out.println("termino:.."+this.getHoraTermino());
    }
    
    
}
