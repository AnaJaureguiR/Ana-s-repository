package tema2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author Ana
 */
public class Tema2 {
    public static void main(String[] args) {
    
     int cantCafe = 0;
     int cantZumo = 0;
     int cantTostadas = 0;
        
     double cafe = 1.10;
     double tostada = 1.5;
     double zumo = 2;
    
    Scanner in = new Scanner (System.in);
    
    System.out.println ("¿Cuántos cafés vais a tomar?");
    cantCafe = in.nextInt();
    
    System.out.println ("¿Cuántos zumos vais a tomar?");
    cantZumo = in.nextInt();
    
    System.out.println ("¿Cuántas tostadas vais a tomar?");
    cantTostadas = in.nextInt();
    
    double cuenta = cantCafe * cafe + cantZumo * zumo + cantTostadas * tostada;
    System.out.println("La cuenta total es de "+cuenta+"€");
    }
}