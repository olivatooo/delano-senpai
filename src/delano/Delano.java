/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delano;

/**
 *
 * @author Olivato
 */
public class Delano {
    public static void main(String[] args) {
        //Conta c = new Conta(1000.0);
        //Conta c1 = new Conta(2000.0);
        //System.out.println("Saldo 1:"+c.getSaldo());
        //System.out.println("Saldo 2:"+c1.getSaldo());
       
        /*-------- 31/08 ------------//
        Tempo t1 = new Tempo(7,8);
        Tempo t2 = new Tempo(9,10);
        t1.difTempo(t2);
        System.out.println(t1.toString());
       
        
      
        */
        
        /*------ 4/09 -------- */
         //Funcionario f = new Funcionario(1000,"Joao",20,20);
         //f.toString();
         //Menu a = new Menu();
         //a.setVisible(true);
         
         /*------ 12/09 --------*/
         
        GameServer server = new GameServer();
        server.setVisible(true);
        ClientTest a = new ClientTest();
        a.setVisible(true);
    }
    
}
