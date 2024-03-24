/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Examen.U1.ExamenRendonPelaezRobertoCarlos.Service;

import Examen.U1.ExamenRendonPelaezRobertoCarlos.Model.ICAModel;
import java.util.List;

/**
 *
 * @author Roberto
 */
public interface ICAService {
    
    public void createAlumno(ICAModel alumno);
    public List getAlumno();
     public void updateAlumno(ICAModel icaModel, Integer numeroControl);
    public void deleteAlumno(Integer numeroControl);
    public List getAtributosFiltrados();
    
}
