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
public class Animal {
    private int age;
    private boolean isHungry;

    public Animal(int age, boolean isHungry) {
        this.age = age;
        this.isHungry = isHungry;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        //needs validation
        this.age = age;
    }

    public boolean isIsHungry() {
        return isHungry;
    }

    public void setIsHungry(boolean isHungry) {
        //needs validation
        this.isHungry = isHungry;
    }
    
    
}
