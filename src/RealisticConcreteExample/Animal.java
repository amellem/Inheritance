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

    public final int getAge() {
        return age;
    }

    public final void setAge(int age) {
        //needs validation
        this.age = age;
    }

    public final boolean isIsHungry() {
        return isHungry;
    }

    public final void setIsHungry(boolean isHungry) {
        //needs validation
        this.isHungry = isHungry;
    }
    
    
}
