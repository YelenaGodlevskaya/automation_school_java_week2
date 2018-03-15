package edu.ctco.school.exercise6.pack2;
import edu.ctco.school.exercise6.pack1.A;
/**
 * Why we can't instantiate class A, even it has public constructor ?
 *
 * How to fix it ?
 * To add public modification for class A within package pack1.
 * To import package pack1 with class A
 */
class B
{
    A a = new A();       //Compile Time Error
}
