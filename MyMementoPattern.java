/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mymementopattern;

import java.util.Scanner;

/**
 *
 * @author arash
 */
public class MyMementoPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Originator orig = new Originator();
        CareTaker care= new CareTaker();
        
        double num1, num2, result ;
        int opt;
        String memory="";
        Scanner sc= null;
        int j;
        for(int i=0; i< 10; i++){
            System.out.println("Try# "+ i+", Please enter numbers to be added : ");
            sc= new Scanner(System.in);
            System.out.print("Number1: ");
            num1 = sc.nextDouble();
            System.out.println("");
            System.out.print("Number2: ");
            num2 = sc.nextDouble();  
            System.out.println("");
            result= num1+num2;
            System.out.println("Result is "+result);
            if (i>0) {
                if (care.list.size()>0){
                    memory= "Add to the previous state(s)? If yes, please choose one of the following state numbers: ";
                    System.out.print(memory);
                    j=0;
                    System.out.println("");
                    for (Memento s: care.list){
                        System.out.println("\tState: "+j+" --> "+s.getNumber());
                        j++;
                    }
                    opt= sc.nextInt();
                    if (opt <= j && opt>=0 ){
                        result += care.get(opt).getNumber();
                        System.out.println("Result is "+result);
                    }
                }
            }
            
            System.out.println("Add result to the amount saved in memory 1=Yes   2=No  0=Quit");
            opt = sc.nextInt();  

            if (opt==0) {break;}
            if (opt==1){
                orig.setResult(result);
                care.add(orig.saveState());
                System.out.println("State "+i +" is saved..");
            }
        }
    }
    
}
