/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciopratico;

import java.util.Scanner;

/**
 *
 * @author MARIA
 */
public class ExercicioPratico {
    
    public void ePrimo (int n1){
    if(n1%2 == 0){
        System.out.println("Este número é Primo");
    }else {
        System.out.println("Este número não é Primo");
    }
    }

    
    public void verPar(int n1){
    if (n1 % 2 == 0){
        System.out.println("È Par");
    }else{
        System.out.println("Não é Par");
    }
    }
    
    public void maiorD(int n1){
        int n2 = 10;
        String s = "";
        if (n1 > n2){
            System.out.println("é maior que 10");
        }else{
            System.out.println("é menor que 10");
        }
       
        
    }
    
    public int oDobro(int n1){
    int n2 = n1 + n1;
        return n2;
    }/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um valor inteiro");
        int valor = leitor.nextInt();
        ExercicioPratico a = new ExercicioPratico();
        a.ePrimo(valor);
        a.maiorD(valor);
        a.verPar(valor);
       // a.oDobro(valor);
        System.out.println("O Dobro de "+valor+" é "+a.oDobro(valor));
        // TODO code application logic here
    }
    
}
