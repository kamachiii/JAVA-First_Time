/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package portofoliokamil;

import java.util.Scanner;

public class PortofolioKamil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //membuat string
        String nama = "Kamil", rombel = "PPLG XI-1", rayon="Cibedug 2";
        System.out.println("Halo nama saya " + nama + " dari " + rombel + " rayon " + rayon);
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter username");

    String userName = myObj.nextLine();  // Read user input
    System.out.println("Username is: " + userName);  // Output user input
    }
    
}
