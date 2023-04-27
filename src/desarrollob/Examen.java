/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desarrollob;

/**
 *
 * @author alumno
 */
public abstract class Examen implements Accion{
    protected String asignatura;
    protected Integer minutos;
    protected Integer energiaNecesaria;

    public String getAsignatura() {
        return asignatura;
    }

    public Integer getMinutos() {
        return minutos;
    }

    public Integer getEnergia() {
        return energiaNecesaria;
    }
    
    
    public abstract void hacer();
    
    public Examen (String a ,Integer m){
    this.asignatura=a;
    this.minutos=m;
        
    }
    
}
