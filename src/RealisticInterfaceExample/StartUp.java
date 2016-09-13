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
public abstract class StartUp implements Animal{
    public static void main(String[] args) {
  
    Animal kitty = new Cat(true, "Kitty", 3, "Black", false);
    
    kitty.useScratchingPost();
    kitty.eatFood();
    
    }
}
