/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desarrollob;

/**
 *
 * @author alumno
 */
public class PartidoDeFutbol implements Accion {
    private Integer categoria;
    private Boolean prorroga;
    private Boolean penaltis;
    private Integer energiaNecesaria;

    public Boolean getProrroga() {
        return prorroga;
    }

    public void setProrroga(Boolean prorroga) {
        this.prorroga = prorroga;
    }

    public Boolean getPenaltis() {
        return penaltis;
    }

    public void setPenaltis(Boolean penaltis) {
        this.penaltis = penaltis;
    }

    public PartidoDeFutbol(Integer categoria, Boolean prorroga, Boolean penaltis) {
        if(categoria>=1&&categoria<=7){this.categoria =categoria;}else{this.categoria=1;}
        
        this.prorroga = prorroga;
        this.penaltis = penaltis;
        int energia=categoria*40;
        if (this.prorroga) {
            energia += energia * 0.15;
            if (this.penaltis) {
                energia += energia * 0.5;
            }
        }
        this.energiaNecesaria =energia;
    }
    
    public PartidoDeFutbol(Integer categoria) {
        if(categoria>=1&&categoria<=7){this.categoria =categoria;}else{this.categoria=1;}
        
        this.prorroga = false;
        this.penaltis = false;
        this.energiaNecesaria =categoria*40;
    }
    
    
    @Override
    public void hacer() {
        System.out.println(
       "Jugando partido de categoria : "+this.categoria+" Penaltis: "+getPenaltis()+"Prorroga : "+getProrroga());}

    @Override
    public Integer getEnergia() {
        
        return energiaNecesaria;
    }
    
    
}
