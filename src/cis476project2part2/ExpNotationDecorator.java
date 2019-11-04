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
public class ExpNotationDecorator extends Decorator {
    private ConversionHandler handler;
    public ExpNotationDecorator(ConversionHandler handler){
        this.handler = handler;
    }
    @Override
    public ConversionHandler handleConversion(String value, String type) {
        return handler.handleConversion(value, type); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getResult() {
        return String.format("%6.4e\n", Double.valueOf(handler.getResult()));
    }

    @Override
    public String getUnit() {
        return handler.getUnit();
    }
    
}
