/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mymementopattern;

/**
 *
 * @author arash
 */
public class Memento {
   private double num;
 //  private double result;

   public Memento(double num){
      this.num = num;
   }

   public double getNumber(){
      return num;
   }	
}
