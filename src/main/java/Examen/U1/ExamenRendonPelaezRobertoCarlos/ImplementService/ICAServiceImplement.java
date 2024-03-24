/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen.U1.ExamenRendonPelaezRobertoCarlos.ImplementService;

import Examen.U1.ExamenRendonPelaezRobertoCarlos.Model.ICAModel;
import Examen.U1.ExamenRendonPelaezRobertoCarlos.Repository.ICARepository;
import Examen.U1.ExamenRendonPelaezRobertoCarlos.Service.ICAService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Roberto
 */
@Service
public class ICAServiceImplement implements ICAService {
    
    @Autowired
    private ICARepository icaRepository;

    @Override
    public void createAlumno(ICAModel alumno) {
        icaRepository.save(alumno);
    }

    @Override
    public List getAlumno() {
        return icaRepository.findAll();

    }

    @Override
    public void updateAlumno(ICAModel icaModel, Integer numeroControl) {
         icaModel.setNumeroControl(numeroControl);
        icaRepository.save(icaModel);
    }

    @Override
    public void deleteAlumno(Integer numeroControl) {
        icaRepository.deleteById(numeroControl); 
    }

    public ICARepository getIcaRepository() {
        return icaRepository;
    }

    public void setIcaRepository(ICARepository icaRepository) {
        this.icaRepository = icaRepository;
    }

    @Override
    public List getAtributosFiltrados() {
        return icaRepository.getAtributosFiltrados();
    }
    
    
}
