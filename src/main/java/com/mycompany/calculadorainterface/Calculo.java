/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadorainterface;

/**
 *
 * @author samuel
 */
public class Calculo implements InterfaceCalculadora{
    
    @Override
    public double somar(double v1, double v2) {
        return v1+v2; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double subtrair(double v1, double v2) {
        return v1-v2;
    }

    @Override
    public double multiplicar(double v1, double v2) {
        return v1*v2;
    }

    @Override
    public double dividir(double v1, double v2) {
        return v1/v2;
    }
    
}
