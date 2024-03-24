/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen.U1.ExamenRendonPelaezRobertoCarlos.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Roberto
 */
@RestController
public class IndexController {
    @GetMapping("/")
    public String index(){
    return "<h1>Bienvenido a mi servidor, Examen primera unidad<h1><h3>Rendón Peláez Roberto Carlos<h3>"; 
    }
    
}
