/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen.U1.ExamenRendonPelaezRobertoCarlos.Utils;

import java.util.LinkedList;

/**
 *
 * @author Roberto
 */
public class CustomeResponse {
     private Integer httpCode;
    private Object data;
    private String message;
    
    public CustomeResponse(){
        this.httpCode = 200;
        this.data = new LinkedList();
        this.message = "Ok";
    }

    public Integer getHttpCode() {
        return httpCode;
    }

    public void setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
}
