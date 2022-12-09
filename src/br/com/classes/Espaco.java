package br.com.classes;

import java.time.LocalDate;

public class Espaco {
    private int id;
    private String descricao;
    private LocalDate horaInicio;
    private LocalDate horaTermino;
    private int idCondominio;

    public Espaco(int idEspaco, String descricao, LocalDate horaInicio, LocalDate horaTermino, int idCondominio) {
        this.id = idEspaco;
        this.descricao = descricao;
        this.horaInicio = horaInicio;
        this.horaTermino = horaTermino;
        this.idCondominio = idCondominio;
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

    public int getIdCondominio() {
        return idCondominio;
    }

    public void setIdCondominio(int idCondominio) {
        this.idCondominio = idCondominio;
    }
    
    
    public void mostrarEspaco(){
        System.out.println("----------Espaco Interno------------");
        System.out.println("Condominio:.."+this.getIdCondominio());
        System.out.println("codigo:.."+this.getId());
        System.out.println("descricao:.."+this.getDescricao());
        System.out.println("inicio:.."+this.getHoraInicio());
        System.out.println("termino:.."+this.getHoraTermino());
    }
    
    
}
