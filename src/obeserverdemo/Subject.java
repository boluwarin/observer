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
import java.util.*;

public class Subject //1. The "independent" abs
{

    //private Observer[] observers = new Observer[9]; //3. Coupled to base class
    private ArrayList<Observer> list = new ArrayList();

    private int totalObs = 0;
    private int state;

    public void attach(Observer o) {
        //observers[totalObs++] = o; //3. coupled
        list.add(o);
    }

    public int getState() {
        return state;
    }

    public int setState(int in) {
        state = in;
        notifyObservers();
        return in;
    }

    private void notifyObservers() /*     
     {
     for (int i = 0; i < totalObs; i++)
     {
     //observers[i].update(); //3. Coupled to base class
     }                           //5. Broadcast events to observers
     }
     */ {
        for (Observer o : list) {

            o.update();
        }
    }

}
