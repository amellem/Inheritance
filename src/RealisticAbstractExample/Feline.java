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
public abstract class Feline extends Animal{
    private int lives = 9;
    private String furColor;
    private boolean hasClaws;

    public Feline(String furColor, boolean hasClaws, int age, boolean isHungry) {
        super(age, isHungry);
        this.furColor = furColor;
        this.hasClaws = hasClaws;
    }

    public final int getLives() {
        return lives;
    }

    public final void setLives(int lives) {
        // needs validation
        this.lives = lives;
    }

    public final String getFurColor() {
        return furColor;
    }

    public final void setFurColor(String furColor) {
        // needs validation
        this.furColor = furColor;
    }

    public final boolean isHasClaws() {
        return hasClaws;
    }

    public final void setHasClaws(boolean hasClaws) {
        // needs validation
        this.hasClaws = hasClaws;
    }
    
    public abstract void useScratchingPost();
}
