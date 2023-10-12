package CJT;

import CJT.testpackage.AccessabilityTest;


/* Adding final to a class means you cannot extend just like variables and methods */
public class AccessModifiers extends AccessabilityTest {
    /* public, private, protected, default
     * Default - access method anywhere within the package it resides in.
     * Public - variable/method can be acccessed across all packages
     * Private - variable/method you cannot access outside of class
     * Protected - variable/method you can access in sub-classes of parent or
     * in other package by extending (key word extends) of the class you want to access
    */
    public static void main(String[] args) {
        AccessModifiers at = new AccessModifiers();
        at.abc();
        final int i = 4; //constant  can't change

    }
}
