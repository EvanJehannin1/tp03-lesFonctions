/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp03.lesfonctions;
import java.util.Scanner;
/**
 *
 * @author evanj
 */
public class Tp03LesFonctions {
    public static int carre(int n) {
        return n * n;
    }
    
    public static int cube(int n) {
        return n * n * n;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choix = 0;
        int nombre = 0;
        int resultat = 0;
        System.out.print("Saisissez un nombre : ");
        nombre = sc.nextInt();
        
        System.out.println("Souhaitez vous calculer le carre ou le cube ?");
        System.out.println("Choix 1 : Le carre");
        System.out.println("Choix 2 : Le cube");
        System.out.println("Saisissez votre choix");
        choix = sc.nextInt();
        
        if (choix == 1){
            resultat = carre(nombre);
            System.out.println("Le carre de " +nombre +" est : " +resultat);
        }
        else if (choix == 2){
            resultat = cube(nombre);
            System.out.println("Le cube de " +nombre +" est : " +resultat);
        }
        else{
            System.out.println("Choix Invalide, réessayez");
        }

        
        
        
    }
    
}
