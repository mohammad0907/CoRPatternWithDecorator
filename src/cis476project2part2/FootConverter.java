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
public class FootConverter extends ConversionHandler {
    
     @Override
    public ConversionHandler handleConversion(String value, String type) {
        if(type.equals("Foot")){
            result = Double.valueOf(value) * 3280.84;
           
            return this;
        }else {
           return  successor.handleConversion(value, type);
        }
    }

    @Override
    public String getResult() {
        return String.valueOf(result);
    }

    @Override
    public String getUnit() {
        return "Foot";
    }

   
}
