/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Examen.U1.ExamenRendonPelaezRobertoCarlos.Repository;

import Examen.U1.ExamenRendonPelaezRobertoCarlos.Model.ICAModel;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Roberto
 */
@Repository
public interface ICARepository extends JpaRepository<ICAModel,Integer> {
    
    @Query(
    value = "SELECT numeroControl,ica,nivel FROM alumno",
            nativeQuery = true)
    public List getAtributosFiltrados();
}
