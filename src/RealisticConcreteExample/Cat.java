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
public class Cat extends Feline{
    private int lives = 9;

    public Cat(String name, boolean hasClaws, int age, boolean isHungry) {
        super(name, hasClaws, age, isHungry);
    } 

    public final int getLives() {
        return lives;
    }

    public final void setLives(int lives) {
        // needs validation
        this.lives = lives;
    }
    
    public void useScratchingPost(){
        if(this.isHasClaws()){
            System.out.println(this.getName() + " is using the scratching post!");
        }else{
            System.out.println(this.getName() + " can't use the scratching post due to not having claws");
        }
    }
    
    @Override
    public void eatFood(){
        if(this.isIsHungry()){
            System.out.println(this.getName() + " is eating Meow Mix!");
        }else{
            System.out.println(this.getName() + " doesn't want to eat right now.");
        }
    }
  
}
