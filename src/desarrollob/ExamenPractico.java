/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desarrollob;

/**
 *
 * @author alumno
 */
public class ExamenPractico extends Examen {

    public ExamenPractico(String a, Integer m) {
        super(a, m);
    this.asignatura=a;
    this.minutos=m;
    }

    @Override
    public void hacer() {
        System.out.println("Haciendo  el examen práctico de la asignatura: " + this.asignatura);
    }

    @Override
    public Integer getEnergia() {
        return 2 * this.minutos;
    }

}
