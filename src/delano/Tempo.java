/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delano;

/**
 *
 * @author 743537
 */
public class Tempo {
    private int hora;
    private int minuto;

    public Tempo(int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }
    
    public int difMinuto(Tempo t)
    {
        return t.getMinuto()-this.getMinuto();
    }
    public int difHora(Tempo t)
    {
        return t.getHora()-this.getHora();
    }
    public void difTempo(Tempo t)
    {
        this.hora-=t.getHora();
        this.minuto-=t.getMinuto();
        this.hora= Math.abs(this.getHora());
        this.minuto= Math.abs(this.getMinuto());
    }
    @Override
     public String toString()
     {
         return this.getHora()+" hora(s) e "+this.getMinuto()+" minuto(s)";
     }
}
