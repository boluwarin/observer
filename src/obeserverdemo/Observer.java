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
abstract class Observer //2. Rot of the "dependent" hierarchy
{

    protected Subject subj;

    public abstract void update();
}
