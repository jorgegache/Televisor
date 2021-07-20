/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package televisor;

import java.util.Date;

/**
 *
 * @author Yirlany
 */
public class TV {
    
    private final int CANAL_MAX=100;
    private final int CANAL_MIN=2;
    private final int MAXIMO=100;
    private final int MINIMO=0;
    
    private int canal;
    private int volumen;
    private int contraste;
    private int brillo;
    private boolean estado;
    private Date fecha;//set
    private boolean internet;
    private boolean silenciado;
    private String contraseña;//set
    private String Nombrered;//set
    private Entradas entrada;
    
    public boolean isEstado() {
        return estado;
    }

    public boolean isInternet() {
        return internet;
    }

    public boolean isSilenciado() {
        return silenciado;
    }

    public int getCanal() {
        return canal;
    }

    public int getVolumen() {
        return volumen;
    }

    public int getContraste() {
        return contraste;
    }

    public int getBrillo() {
        return brillo;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getNombrered() {
        return Nombrered;
    }

    public Entradas getEntrada() {
        return entrada;
    }
    public void cambiarEntrada(Entradas entrada){
        this.entrada=entrada;

    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setNombrered(String Nombrered) {
        this.Nombrered = Nombrered;
    }
    
    
    
    public void encender(){
        this.estado=true;
    }
    public void apagar(){
        this.estado=false;
    }
    public void cambiarCanal(int canal){
        if (canal>=CANAL_MIN&&canal<=CANAL_MAX){
            this.canal=canal;
        }
    }
    public void subirCanal(){
        if(this.canal==CANAL_MAX){
            this.canal=CANAL_MIN;
        }else{
            canal++;
        }
    }
    public void bajarCanal(){
        if(this.canal==CANAL_MIN){
            this.canal=CANAL_MAX;
        }else{
            canal--;
        }
    }
    public void subirVolumen(){
        if(this.volumen<MAXIMO){
            this.volumen++;
        }
    }   
    public void bajarVolumen(){
        if(this.volumen>MINIMO){
            this.volumen--;
        }
    } 
    public void subirBrillo(){
        if(this.brillo<MAXIMO){
            this.brillo++;
        }
    } 
    public void bajarBrillo(){
        if(this.brillo>MINIMO){
            this.brillo--;
        }
    }
    public void subirContraste(){
        if(this.contraste<MAXIMO){
            this.contraste++;
        }
    } 
    public void bajarContraste(){
        if(this.contraste>MINIMO){
            this.contraste--;
        }
    }
    public void activarSonio(){
       this.silenciado=false;
        }
    public void desactivarSonio(){
       this.silenciado=true;
        }

    public TV() {
        this.canal = CANAL_MIN;
        this.volumen = 50;
        this.contraste = 50;
        this.brillo = 50;
        this.estado = false;
        this.fecha = new Date();
        this.internet = false;
        this.silenciado = false;
        this.contraseña = "";
        this.Nombrered = "";
        this.entrada=Entradas.cable;
    }
        
}
