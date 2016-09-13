/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RealisticAbstractExample;

/**
 *
 * @author Aerius
 */
public abstract class StartUp{
    public static void main(String[] args) {
        
        Animal kitty = new Cat("Kitty", "orange", true, 6, true);
        
        
        kitty.eatFood();
        kitty.useScratchingPost();
    }

}
