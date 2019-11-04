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
public abstract class Decorator extends ConversionHandler{
    
    @Override
    public abstract ConversionHandler handleConversion(String value, String type); 
    @Override
    public abstract String getResult();
    @Override
    public abstract String getUnit();
}
