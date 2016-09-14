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
public class Leprechaun extends Fairy {
    private boolean hasPotOfGold;
    private int numberOfCharms;
    private String favoriteCharm;

    public Leprechaun(boolean hasPotOfGold, int numberOfCharms, String favoriteCharm, String name, int age, boolean hasWings) {
        super(name, age, hasWings);
        this.hasPotOfGold = hasPotOfGold;
        this.numberOfCharms = numberOfCharms;
        this.favoriteCharm = favoriteCharm;
    }

    public final boolean isHasPotOfGold() {
        return hasPotOfGold;
    }

    public final void setHasPotOfGold(boolean hasPotOfGold) {
        //requires validation
        this.hasPotOfGold = hasPotOfGold;
    }

    public final int getNumberOfCharms() {
        return numberOfCharms;
    }

    public final void setNumberOfCharms(int numberOfCharms) {
        //requires validation
        this.numberOfCharms = numberOfCharms;
    }

    public final String getFavoriteCharm() {
        return favoriteCharm;
    }

    public final void setFavoriteCharm(String favoriteCharm) {
        //requires validation
        this.favoriteCharm = favoriteCharm;
    }
    
    @Override
    public void bragAboutCharms(){
        System.out.println("I have " + this.getNumberOfCharms() + " charms!");
    }
}
