/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obeserverdemo;

import java.util.Random;

/**
 *
 * @author 1404123
 */
public class ObeserverDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Subject sub = new Subject();
        //7. Client configures the number and type of observers
        new HexObserver(sub);
        new OctObserver(sub);
        new BinObserver(sub);
        /*
         while (true)
         {
         System.out.print( "\nEnter a number: ");
         sub.setState( Read.anInt() );
         }*/
        Random r = new Random();

    // random integers in [0, 100]
        for (int i = 1; i <= 100; i++) {
            //System.out.println(r.nextInt(1000));
            System.out.println(sub.setState(r.nextInt(1000)));

        }
    }
    
// Enter a number: 15
//   f  17  1111
// Enter a number: 17
//   11  21  10001
// Enter a number: 31
//   1f  37  11111

// Purpose.  Observer design pattern, class inheritance vs type inheritance
// SensorSystem is the "subject".  Lighting, Gates, and Surveillance are the
// "views".  The subject is only coupled to the "abstraction" of AlarmListener.
// An object's class defines how the object is implemented.  In contrast, an
// object's type only refers to its interface.  Class inheritance defines an
// object's implementation in terms of another object's implementation.  Type
// inheritance describes when an object can be used in place of another.
// [GOF, pp13-17]
}
