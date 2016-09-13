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
public class Cat extends Feline{
    private boolean hasClaws;
    private int lives = 9;

    public Cat(boolean hasClaws, String name, int age, String furColor, boolean isHungry) {
        super(name, age, furColor, isHungry);
        this.hasClaws = hasClaws;
    }

    public boolean isHasClaws() {
        return hasClaws;
    }

    public void setHasClaws(boolean hasClaws) {
        // needs validation
        this.hasClaws = hasClaws;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        // needs validation
        this.lives = lives;
    }
    
    @Override
    public void useScratchingPost(){
        if(hasClaws){
            System.out.println(this.getName() + " is using the scratching post!");
        }else{
            System.out.println(this.getName() + " can't use the scratching post due to not having claws.");
        }
    }
    
}
