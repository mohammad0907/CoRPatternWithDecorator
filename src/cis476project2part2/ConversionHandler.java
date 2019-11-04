/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis476project2part2;

/**
 *
 * @author rashe
 */
public abstract class ConversionHandler {
    
    protected ConversionHandler successor;
    protected double result;
   
    
    public void setSuccessor(ConversionHandler successor) {
        this.successor =  successor;
    }
    public abstract String getResult();
    public abstract String getUnit();
    public abstract ConversionHandler handleConversion(String value, String type);
}