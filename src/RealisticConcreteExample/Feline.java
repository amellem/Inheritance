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
public class Feline extends Animal{
    private String name;
    private String furColor;
    private boolean hasClaws;

    public Feline(String name, boolean hasClaws, int age, boolean isHungry) {
        super(age, isHungry);
        this.name = name;
        this.hasClaws = hasClaws;
    }

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        // needs validation
        this.name = name;
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

    
    public void eatFood(){
        if(this.isIsHungry()){
            System.out.println(this.getName() + " is eating!");
        }else{
            System.out.println(this.getName() + " doesn't want to eat right now.");
        }
    }

}
