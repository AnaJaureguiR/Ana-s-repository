/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3;
import java.util.Scanner;

/**
 *
 * @author Ana
 */
public class Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner fecha = new Scanner (System.in);

    int dia_nacimiento = 0;
    int mes_nacimiento =0;

    //System.out.println("Escribe tu día de nacimiento: ");
    dia_nacimiento= fecha.nextInt();
    
    //System.out.println("Escribe tu mes de nacimiento: ");
    mes_nacimiento = fecha.nextInt();
    
    if((mes_nacimiento == 3 && dia_nacimiento >=21) || (mes_nacimiento == 4 && dia_nacimiento <=20)){
        System.out.println("Eres Aries");
    }else if ((mes_nacimiento == 4 && dia_nacimiento >=21) || (mes_nacimiento == 5 && dia_nacimiento <=21)){
        System.out.println("Eres Tauro");
    }else if ((mes_nacimiento == 5 && dia_nacimiento >=22) || (mes_nacimiento == 6 && dia_nacimiento <=21)){
        System.out.println("Eres Géminis");
    }else if ((mes_nacimiento == 6 && dia_nacimiento >=21) || (mes_nacimiento == 7 && dia_nacimiento <=23)){
        System.out.println("Eres Cáncer");
    }else if ((mes_nacimiento == 7 && dia_nacimiento >=24) || (mes_nacimiento == 8 && dia_nacimiento <=23)){
        System.out.println("Eres Leo");
    }else if ((mes_nacimiento == 8 && dia_nacimiento >=24) || (mes_nacimiento == 9 && dia_nacimiento <=23)){
        System.out.println("Eres Virgo");
    }else if ((mes_nacimiento == 9 && dia_nacimiento >=24) || (mes_nacimiento == 10 && dia_nacimiento <=23)){
        System.out.println("Eres Libra");
    }else if ((mes_nacimiento == 10 && dia_nacimiento >=24) || (mes_nacimiento == 11 && dia_nacimiento <=22)){
        System.out.println("Eres Escorpio");
    }else if ((mes_nacimiento == 11 && dia_nacimiento >=23) || (mes_nacimiento == 12 && dia_nacimiento <=21)){
        System.out.println("Eres Sagitario");
    }else if ((mes_nacimiento == 12 && dia_nacimiento >=22) || (mes_nacimiento == 1 && dia_nacimiento <=20)){
        System.out.println("Eres Capricornio");
    }else if ((mes_nacimiento == 1 && dia_nacimiento >=21) || (mes_nacimiento == 2 && dia_nacimiento <=19)){
        System.out.println("Eres Acuario");
    }else if ((mes_nacimiento == 2 && dia_nacimiento >=20) || (mes_nacimiento == 3 && dia_nacimiento <=20)){
        System.out.println("Eres Piscis");
    }
    
    }       
}
