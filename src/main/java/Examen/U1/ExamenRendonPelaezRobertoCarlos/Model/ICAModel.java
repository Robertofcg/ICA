/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen.U1.ExamenRendonPelaezRobertoCarlos.Model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Roberto
 */
@Entity
@Table(name = "alumno")
public class ICAModel implements Serializable {
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)    
    private Integer numeroControl;
    private char genero ;
    private double medidaCintura;
    private double medidaAltura;
    @Transient
    private double ica;
    @Transient
    private String nivel;
    
    public ICAModel() {
    }

    public ICAModel(char genero, double medidaCintura, double medidaAltura) {
        this.genero = genero;
        this.medidaCintura = medidaCintura;
        this.medidaAltura = medidaAltura;
    }

    public Integer getNumeroControl() {
        return numeroControl;
    }

    public void setNumeroControl(Integer numeroControl) {
        this.numeroControl = numeroControl;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public double getMedidaCintura() {
        return medidaCintura;
    }

    public void setMedidaCintura(double medidaCintura) {
        this.medidaCintura = medidaCintura;
    }

    public double getMedidaAltura() {
        return medidaAltura;
    }

    public void setMedidaAltura(double medidaAltura) {
        this.medidaAltura = medidaAltura;
    }

    public double getIca() {
        return this.medidaCintura/this.medidaAltura;
    }

    public void setIca(double ica) {
        this.ica = ica;
    }

    public String getNivel() {
        String nivel = "";
      //Hombre
        if(this.genero == 'H' && getIca() < 0.34){
            nivel = "Delgadez severa";
        }
        if(this.genero == 'H' && getIca() > 0.35 && this.ica < 0.42){
            nivel = "Delgadez leve";
        }
        if(this.genero == 'H' && getIca() > 0.43 && this.ica < 0.52){
            nivel = "Peso normal";
        }
        if(this.genero == 'H' && getIca() > 0.53 && this.ica < 0.57){
            nivel = "Sobrepeso";
        }
        if(this.genero == 'H' && getIca() > 0.58 && this.ica < 0.62){
            nivel = "Sobrepeso elevado";
        }
        if(this.genero == 'H' && getIca() > 0.63){
            nivel = "Obesidad mórbida";
        }
        
      //Mujer
        if(this.genero == 'H' && getIca() < 0.34){
            nivel = "Delgadez severa";
        }
        if(this.genero == 'H' && getIca() > 0.35 && this.ica < 0.41){
            nivel = "Delgadez leve";
        }
        if(this.genero == 'H' && getIca() > 0.42 && this.ica < 0.48){
            nivel = "Peso normal";
        }
        if(this.genero == 'H' && getIca() > 0.49 && this.ica < 0.53){
            nivel = "Sobrepeso";
        }
        if(this.genero == 'H' && getIca() > 0.54 && this.ica < 0.57){
            nivel = "Sobrepeso elevado";
        }
        if(this.genero == 'H' && getIca() > 0.58){
            nivel = "Obesidad mórbida";
        }
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    
    
    
}
