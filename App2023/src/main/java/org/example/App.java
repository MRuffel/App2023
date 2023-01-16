package org.example;

import models.Employer;

/**
 * Hello world!
 *
 */




public class App 
{

    static Employer emp1 = new Employer("John");
    public static void main( String[] args )
    {
        System.out.println( "Java 2023!" );
        System.out.println( emp1.toString() );
    }


}
