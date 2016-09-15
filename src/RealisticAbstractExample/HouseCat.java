
package RealisticAbstractExample;

/**
 *
 * @author Aerius
 */
public class HouseCat extends Feline{
    private String name;

    public HouseCat(String name, String furColor, boolean hasClaws, int age, boolean isHungry) {
        super(furColor, hasClaws, age, isHungry);
        this.name = name;
    }
    
    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        // needs validation
        this.name = name;
    }
    
    @Override
    public final void useScratchingPost(){
        if(this.isIsHungry()){
            System.out.println(this.getName() + " is using the scratching post!");
        }else{
            System.out.println(this.getName() + " can't use the scratching post due to not having claws.");
        }
    }
    
    @Override
    public final void eatFood(){
        if(this.isIsHungry()){
            System.out.println(this.getName() + " is hungry!");
        }else{
            System.out.println(this.getName() + " doesn't want to eat right now.");
        }
    }
}
