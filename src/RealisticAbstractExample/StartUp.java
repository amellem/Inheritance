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
public class StartUp{
    public static void main(String[] args) {
        
        HouseCat kitty = new HouseCat("Kitty", "orange", true, 6, true);
        Animal[] a1={
          new HouseCat("Kitty", "orange", true, 6, true)  
        };
        
        for(Animal a: a1){
            a.eatFood();
        }
            kitty.useScratchingPost();
        
    }

}
