/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RealisticConcreteExample;

/**
 *
 * @author Aerius
 */
public class StartUp extends Cat{

    public StartUp(String name, String furColor, boolean hasClaws, int age, boolean isHungry) {
        super(name, furColor, hasClaws, age, isHungry);
    }
    public static void main(String[] args) {
        Cat kitty = new Cat("Kitty", "Orange",false, 9, false);
        
        kitty.eatFood();
        kitty.useScratchingPost();
    }   
}
