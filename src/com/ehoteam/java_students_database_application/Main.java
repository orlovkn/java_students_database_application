package com.ehoteam.java_students_database_application;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // ask how many students we want to add
        System.out.print ("Enter numbers of new students to enroll: ");
        Scanner in = new Scanner (System.in);
        int numOfStudents = in.nextInt ();
        Student[] students = new Student[numOfStudents];

        // create a number of new students
        for (int n = 0; n < numOfStudents; n++) {
            students[n] = new Student ();
            students[n].enroll ();
            students[n].payTuition ();

            System.out.println (students[n].toString ());
        }
    }
}
