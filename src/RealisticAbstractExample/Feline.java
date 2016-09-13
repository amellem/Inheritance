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

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        // needs validation
        this.lives = lives;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        // needs validation
        this.furColor = furColor;
    }

    public boolean isHasClaws() {
        return hasClaws;
    }

    public void setHasClaws(boolean hasClaws) {
        // needs validation
        this.hasClaws = hasClaws;
    }     
}
