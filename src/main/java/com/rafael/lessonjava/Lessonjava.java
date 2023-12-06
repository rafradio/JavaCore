package com.rafael.lessonjava;

import com.rafael.lessonjava.component.MathClass;

/**
 * javac -sourcepath ./java -d out java/com/rafael/lessonjava/Lessonjava.java
 * java -classpath ./out com.rafael.lessonjava.Lessonjava
 * docker build -f resources/Dockerfile2 . -t lesson1_3:v1
 * docker run lesson1_3:v1
*/
public class Lessonjava {

    public static void main(String[] args) {
        int x = MathClass.sum(3, 27);
        System.out.println("Main Prog Maven! Result - " + x);
    }
}
