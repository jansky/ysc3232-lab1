/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.janskyd.lab1;

/**
 *
 * @author jansky
 */
public class Main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        if(args.length < 1) {
            System.out.println("Error: You must specify at least one number.");
            return;                    
        }
        
        try {
            
            /* We start with the first argument as our "initial guess" for the
               min and max.
            */
            double min = Double.parseDouble(args[0]);
            double max = Double.parseDouble(args[1]);
            
            /* We initialize the sum used for computing the mean */
            double sum = 0.0;
            
            for(int i = 0; i < args.length; i++) {
                
                double argAsDouble = Double.parseDouble(args[i]);
                
                /* Max and min are computed by comparing each argument with
                   the current max and min
                */
                if(argAsDouble < min) { min = argAsDouble; }
                if(argAsDouble > max) { max = argAsDouble; }
                
                sum += argAsDouble;        
                
            }
            
            /* The mean is the sum of the arguments divided by the number of
               arguments.
            */
            double mean = sum / (double)args.length;
            
            System.out.printf("Min: %f, Max: %f, Mean: %f\n", min, max, mean);
            
        } catch(NumberFormatException ex) {
            
            System.out.println("Error: You must specify numbers as arguments.");
            
        }
        
    }
    
}
