/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package yuyakambayashi.ui;

import jakarta.inject.Named;
import jakarta.faces.view.ViewScoped;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author yuya-kambayashi
 */
@Named(value = "testBean")
@ViewScoped
public class testBean implements Serializable{
    
    @Getter
    @Setter
    private String password = "12345";

    /**
     * Creates a new instance of testBean
     */
    public testBean() {
    }
    
    public String getHoge(){
        return "Hoge";
    }
    
}
