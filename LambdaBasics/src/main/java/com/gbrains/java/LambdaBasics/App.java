package com.gbrains.java.LambdaBasics;

import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        List<String> strList = Arrays.asList("Ravi", "Gaurav", "Pooja", "Harjot");
        
        strList.forEach(value -> System.out.println(value));
    }
}
