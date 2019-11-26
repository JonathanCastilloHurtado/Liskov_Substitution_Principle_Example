/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principio.de.sustitucion.de.liskov;

/**
 *
 * @author JonathanC
 */
public abstract class rectangle {
    public final int width;
    public final int height;
 
    public rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
       public abstract float Area();

}
