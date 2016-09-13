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
    private String name;

    public Cat(String name, String furColor, boolean hasClaws, int age, boolean isHungry) {
        super(furColor, hasClaws, age, isHungry);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void useScratchingPost(){
        if(this.isIsHungry()){
            System.out.println(this.getName() + " is using the scratching post!");
        }else{
            System.out.println(this.getName() + " can't use the scratching post due to not having claws");
        }
    }
    
    public void eatFood(){
        if(this.isIsHungry()){
            System.out.println(this.getName() + " is hungry!");
        }else{
            System.out.println(this.getName() + " doesn't want to eat right now.");
        }
    }
}
