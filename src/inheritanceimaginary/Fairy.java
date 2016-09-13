/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceimaginary;

/**
 *
 * @author Aerius
 */
public abstract class Fairy implements MythicalCreature{
    private String name;
    private int age;
    private boolean hasWings;

    public Fairy(String name, int age, boolean hasWings) {
        this.name = name;
        this.age = age;
        this.hasWings = hasWings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        //requires validation
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        //requires validation
        this.age = age;
    }

    public boolean isHasWings() {
        return hasWings;
    }

    public void setHasWings(boolean hasWings) {
        //requires validation
        this.hasWings = hasWings;
    }
    
    @Override
    public void greeting(){
        System.out.println("Hello my name is " + this.getName() + " and I am " + this.getAge() + " years old.");
    }
}
