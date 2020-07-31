/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hellowordapp;

import java.io.BufferedReader;

import java.io.FileReader;

public class Main {


/**
 *
 * @author Louis
 */
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src\\input1.txt"));
            String line;
            double bestNote = 0;
            while ((line = reader.readLine()) != null) {
                String[] notes = line.split(" ");
                if (notes.length > 1) {
                    float average = (Float.parseFloat(notes[0]) + Float.parseFloat(notes[1]) + Float.parseFloat(notes[2])) / 3;
                    double finalAverage = Math.ceil(average);
                    if (bestNote < finalAverage) {
                        bestNote = finalAverage;
                    }
                }
            }
            System.out.println(bestNote);
        } catch (Exception e) {
            System.out.println("e");
        }
    }
}
