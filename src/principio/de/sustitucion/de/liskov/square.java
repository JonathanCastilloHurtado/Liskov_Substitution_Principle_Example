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
public class square extends rectangle{
    
    public square(int side) {
        super(side, side);
    }
    
    @Override
    public float Area() {
return width*height;
        }
}
