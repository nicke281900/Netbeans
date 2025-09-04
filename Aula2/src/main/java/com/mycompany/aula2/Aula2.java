/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula2;

/**
 *
 * @author aluno
 */
public class Aula2 {

    public static void main(String[] args) {
       
       Metodo3 eu = new Metodo3();
//metodo com parametro e sem retorno      
       eu.mostrarNome("Ryan");
       
//Metodo com parametro e com retorno

       int idade = eu.calcularIdade(2025, 2008);
       System.out.println("Minha idade é " +idade);
    }
}
