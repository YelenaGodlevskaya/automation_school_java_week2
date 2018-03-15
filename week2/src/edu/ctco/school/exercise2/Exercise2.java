package edu.ctco.school.exercise2;

/**
 * Does field 'i' of Class Exercise2 be inherited to Class SubExercise2 in the below code?
 * - No, because private should not be inherited.
 *
 * What are the options in this particular case?
 * private change to public
 *
 */
class Exercise2 {
    public int i;
}

class SubExercise2 extends Exercise2 {
}