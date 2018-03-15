package edu.ctco.school.exercise5;

/**
 * Why we are able to see protected variable i from class X ?
 * protected is available within whole package
 *
 * What will be printed out, then fixed ?
 * will be printed:
 * 1221
 * 1221
 * private modification is changed to public in X class for methodOfX()
 */
public class MainClass
{
    public static void main(String[] args)
    {
        X x = new X();

        System.out.println(x.i);

        x.methodOfX();
    }
}