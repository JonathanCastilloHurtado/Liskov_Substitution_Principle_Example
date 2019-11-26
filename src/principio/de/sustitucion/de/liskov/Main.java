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
public class Main {
    
   public static void main (String [] args) {
       int area=10;
       int width=2;
       int heigth=5;
        System.out.println(testArea(area,new rectangle(width,heigth) {
           @Override
           public float Area() {
            return width*height;
           }
       }));
       area=25;
       int side=5;
        System.out.println(testArea(area,new square(5)));
    }
    
      public static boolean testArea(int value,rectangle rectangle)
    {
        boolean resp;
      
        if(value==rectangle.Area()){
        resp=true;
        }
        else{
            resp=false;
        }
        return resp;
    }
      
      
}
