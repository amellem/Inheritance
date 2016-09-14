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
public class HouseCat extends Feline{
    private int lives = 9;

    public HouseCat(String name, boolean hasClaws, int age, String furColor) {
        super(name, hasClaws, age, furColor);
    }


    public final int getLives() {
        return lives;
    }

    public final void setLives(int lives) {
        // needs validation
        this.lives = lives;
    }
    
    
    @Override
    public void useScratchingPost(){
        if(this.isHasClaws()){
            System.out.println(this.getName() + " is using the scratching post!");
        }else{
            System.out.println(this.getName() + " can't use the scratching post due to not having claws.");
        }
    }

}
