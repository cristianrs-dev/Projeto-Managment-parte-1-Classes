package br.com.classes;

import java.time.LocalDate;

public class Documento {
    private int id;
    private String[] tipo;
    private LocalDate[] dataEntrada;
    private LocalDate[] dataEmissao;

    public Documento(int idDocumento, String[] tipo, LocalDate[] dataEntrada, LocalDate[] dataEmissao) {
        this.id = idDocumento;
        this.tipo = tipo;
        this.dataEntrada = dataEntrada;
        this.dataEmissao = dataEmissao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String[] getTipo() {
        return tipo;
    }

    public void setTipo(String[] tipo) {
        this.tipo = tipo;
    }

    public LocalDate[] getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDate[] dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public LocalDate[] getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(LocalDate[] dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

   
    
    public void mostrarDocumento(){
        for(int i=0; i<20; i++)
        {
            if(!this.tipo[i].equals("null"))
            {
                System.out.println("codigo:.."+this.getId());
                System.out.println("tipo:.."+this.getTipo()[i]);
                System.out.println("entrada:.."+this.getDataEntrada()[i]);
                System.out.println("emissão:.."+this.getDataEmissao()[i]);
                break;
            }
        }
        
    }
}
