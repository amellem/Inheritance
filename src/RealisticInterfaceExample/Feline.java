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
public abstract class Feline implements Animal {
    private String name;
    private boolean hasClaws;
    private int age;
    private String furColor;
    private boolean isHungry = true;

    public Feline(String name, boolean hasClaws, int age, String furColor) {
        this.name = name;
        this.hasClaws = hasClaws;
        this.age = age;
        this.furColor = furColor;
    }

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        // needs validation
        this.name = name;
    }

    public boolean isHasClaws() {
        return hasClaws;
    }

    public void setHasClaws(boolean hasClaws) {
        this.hasClaws = hasClaws;
    }

    public final int getAge() {
        return age;
    }

    public final void setAge(int age) {
        // needs validation
        this.age = age;
    }

    public final String getFurColor() {
        return furColor;
    }

    public final void setFurColor(String furColor) {
        // needs validation
        this.furColor = furColor;
    }

    public final boolean isIsHungry() {
        return isHungry;
    }

    public final void setIsHungry(boolean isHungry) {
        // needs validation
        this.isHungry = isHungry;
    }
    
    public abstract void useScratchingPost();
    
    @Override
    public final void eatFood(){
        if(isHungry){
            System.out.println(this.getName() + " is eating!");
        }else{
            System.out.println(this.getName() + " doesn't want to eat right now.");
        }
        
    }
}
