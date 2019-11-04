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
public class AddUnitName extends Decorator{
    
    private ConversionHandler handler;
 
    
    public AddUnitName(ConversionHandler handler){
        this.handler = handler;
    }

    @Override
    public ConversionHandler handleConversion(String value, String type) {
       
        return handler.handleConversion(value, type);
    }

    @Override
    public String getResult() {
        return handler.getResult() + " " + handler.getUnit();
    }

    @Override
    public String getUnit() {
        return handler.getUnit();
    }
    
}
