/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desarrollob;


import java.util.Stack;

/**
 *
 * @author alumno
 */
public class Persona  implements Energetico{
    private String nombre;
    private Double capacidadVejiga;
    private Double estadoVejiga;
    private Integer energiaActual;
    private Stack<Accion> tareasPendientes;

    public Persona(String nombre, Double capacidadVejiga) {
        this.nombre = nombre;
        this.capacidadVejiga = capacidadVejiga;
        this.estadoVejiga=0.0;
        this.energiaActual=100;
    }
    
    public void addTarea(Accion a){
    tareasPendientes.push(a);
    }
    
    public Integer hacerTareas() {
        int contador = 0;
        while (energiaActual > 0) {
            if (energiaActual - tareasPendientes.peek().getEnergia() >= 0) {
                energiaActual -= tareasPendientes.peek().getEnergia();
                tareasPendientes.pop();
                contador++;
            }

        }
        return contador;
    }

    public void vaciarVejiga(){
    this.estadoVejiga=0.0;}
    
    public Double beber(Bebible a) {
        double vejiga;
        if (estadoVejiga + a.getLitros() <= this.capacidadVejiga) {
            estadoVejiga += a.getLitros();
        } else {
            estadoVejiga = capacidadVejiga;
        }
        return estadoVejiga += a.getLitros();
    }

    @Override
    public Integer getEnergia() {
    return this.energiaActual;}

   

   
    
    
}
