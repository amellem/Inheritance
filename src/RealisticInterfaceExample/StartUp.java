/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RealisticInterfaceExample;

/**
 *
 * @author Aerius
 */
public class StartUp{
    public static void main(String[] args) {
  
    Animal[] animal = {
        new HouseCat("Kitty", false, 9, "Orange")
    };
    
    for(Animal a: animal){
        a.eatFood();
    }
    
    
    }
 
    }

