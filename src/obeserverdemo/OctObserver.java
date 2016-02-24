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
class OctObserver extends Observer {

    public OctObserver(Subject s) {
        subj = s;

        subj.attach(this); //4. Observers register themselves
    }

    public void update() {
        System.out.print(" " + Integer.toOctalString(subj.getState())); //Observers "pull"  information
    }
}
