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
public class Originator {
   private double result;

   public void setResult(double num){
      this.result = num;
   }

 //  public double getState(){
 //    return state;
 //  }

   public Memento saveState(){
      return new Memento(result);
   }

   public void getResult(Memento mem){
      result = mem.getNumber();
   }
}
