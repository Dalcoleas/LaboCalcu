/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculabo.Aritmetica;

import calculabo.AbstractFactory;
import calculabo.Convertidor.Convertidor;

/**
 *
 * @author Daniel Alcoleas <your.name at your.org>
 */
public class FactoryAritmetica implements AbstractFactory{
    
   @Override
    public Convertidor getConvertor(String tipo) {
        return null;
    }
    
    @Override
    public Aritmetica getAritmetica(String tipo) {
        switch (tipo) {
            case "suma":
                return new Suma();
            case "resta":
                return new Resta();
            case "multiplicacion":
                return new Multiplicacion();
            case "division":
                return new Division();
        }
        return null;
    }
    
}
