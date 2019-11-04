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
public class YardConverter extends ConversionHandler {
   
     @Override
    public ConversionHandler handleConversion(String value, String type) {
        if(type.equals("Yard")){
            result = Double.valueOf(value) *  1093.613298;
            
            return  this;
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
        return "Yard";
    }

    
}
