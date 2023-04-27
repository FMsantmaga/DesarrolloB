/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desarrollob;

/**
 *
 * @author alumno
 */
public class ExamenTest extends Examen{
    private Integer numPreguntas;
    private Boolean resta;

    public Integer getNumPreguntas() {
        return numPreguntas;
    }

    public Boolean getResta() {
        return resta;
    }


    public ExamenTest(String a, Integer m, Integer n, Boolean r) {
        super(a, m);
         this.asignatura=a;
        this.minutos=m;
        this.numPreguntas=n;
        this.resta=r;
        this.minutos=(int)0.5*n;
        
    }

    @Override
    public void hacer() {
        int contador=1;
        while(contador<=numPreguntas){
        System.out.println("Haciendo pregunta"+contador+" del examen de la asignatura"+this.asignatura);
        contador++;
        }
    }

    @Override
    public Integer getEnergia() {
    Integer energia=(resta=true)?this.numPreguntas/2:this.numPreguntas/4;
    return energia;}
    
}
