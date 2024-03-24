/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen.U1.ExamenRendonPelaezRobertoCarlos.Controller;

import Examen.U1.ExamenRendonPelaezRobertoCarlos.Model.ICAModel;
import Examen.U1.ExamenRendonPelaezRobertoCarlos.Service.ICAService;
import Examen.U1.ExamenRendonPelaezRobertoCarlos.Utils.CustomeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Roberto
 */
@RestController
@RequestMapping("/api/v1/ICA")
public class ICAController {
    
    @Autowired
    private ICAService icaService;
    
    @PostMapping("/")
    public CustomeResponse createAlumno(@RequestBody ICAModel alumno) {
        CustomeResponse customeResponse = new CustomeResponse();        
        icaService.createAlumno(alumno);        
        return customeResponse;
    }
    
    @GetMapping("/")
    public CustomeResponse getAlumno(){
        CustomeResponse customeResponse = new CustomeResponse();
        customeResponse.setData(icaService.getAlumno());
        return customeResponse;
    }
    
    @PutMapping("/{numeroControl}")
    public CustomeResponse updateAlumno(@RequestBody ICAModel alumno, @PathVariable Integer numeroControl){
        CustomeResponse customeResponse = new CustomeResponse();
        icaService.updateAlumno(alumno, numeroControl);
        return customeResponse;       
    }
    
    @DeleteMapping("/{numeroControl}")
    public CustomeResponse deleteAlumno(@PathVariable Integer numeroControl){
        CustomeResponse customeResponse = new CustomeResponse();
        icaService.deleteAlumno(numeroControl);
        return customeResponse;    
    }
    
    @GetMapping("/{numeroControl}")
    public CustomeResponse getPrueba(@PathVariable Integer numeroControl){
        CustomeResponse customeResponse = new CustomeResponse();
        customeResponse.setData(icaService.getAtributosFiltrados());
        return customeResponse;
    }
}
