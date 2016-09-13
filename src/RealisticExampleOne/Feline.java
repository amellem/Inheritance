/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RealisticExampleOne;

/**
 *
 * @author Aerius
 */
public abstract class Feline implements Animal {
    private String name;
    private int age;
    private String furColor;
    private boolean isHungry = true;

    public Feline(String name, int age, String furColor, boolean isHungry) {
        this.name = name;
        this.age = age;
        this.furColor = furColor;
        this.isHungry = isHungry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // needs validation
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        // needs validation
        this.age = age;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        // needs validation
        this.furColor = furColor;
    }

    public boolean isIsHungry() {
        return isHungry;
    }

    public void setIsHungry(boolean isHungry) {
        // needs validation
        this.isHungry = isHungry;
    }
    
    @Override
    public void eatFood(){
        if(isHungry){
            System.out.println(this.getName() + " is hungry!");
        }else{
            System.out.println(this.getName() + " doesn't want to eat right now.");
        }
        
    }
}
