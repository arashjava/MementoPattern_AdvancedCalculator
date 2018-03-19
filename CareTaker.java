/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mymementopattern;

import java.util.ArrayList;

/**
 *
 * @author arash
 */
public class CareTaker {
   protected ArrayList<Memento> list = new ArrayList<Memento>();

   public void add(Memento mem){
      list.add(mem);
   }

   public Memento get(int index){
      return list.get(index);
   }

}
