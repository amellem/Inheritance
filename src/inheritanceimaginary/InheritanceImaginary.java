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
public abstract class InheritanceImaginary implements MythicalCreature{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       MythicalCreature goldBuckle = new Leprechaun(true, 12, "gold coin", "Gold Buckle", 102, false);
    
        goldBuckle.greeting();
        goldBuckle.bragAboutCharms();
        
    } 
}
