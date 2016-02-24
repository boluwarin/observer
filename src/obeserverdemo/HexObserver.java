/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obeserverdemo;

/**
 *
 * @author 1404123
 */
class HexObserver extends Observer //2. Concrete class of the "dependent"
{

    public HexObserver(Subject s) {
        // hierarchy
        subj = s;
        subj.attach(this); // 4.Observer registers themselves
    }

    public void update() {
        System.out.print(" " + Integer.toHexString(subj.getState())); //6. Observers "pull" information
    }
}
