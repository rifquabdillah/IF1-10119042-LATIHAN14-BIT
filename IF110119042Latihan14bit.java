/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanpbo;

/**
 *
 * @author Stks
 */
public class IF110119042Latihan14bit {

public static void main(String[] args){
    int a = 60; /*60= 0011 1100*/
    int b = 13; /*13= 0000 1101*/
    int c = 0;
    c = a & b;
    /* 12 = 0000 1100 */
    System.out.println("a & b = " + c);
    c = a | b;
    /*61 = 0011 1101*/
    System.out.println("a | b =" + c);
    c = a ^ b;
    /* 49 = 0011 0001 */
    System.out.println("a ^ b =" + c);
    c = ~a;
}    
}
