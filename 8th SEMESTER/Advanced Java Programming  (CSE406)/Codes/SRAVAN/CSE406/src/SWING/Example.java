/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SWING;

import javax.swing.*;
public class Example {
    public static void main(String[] args){
        JFrame f = new JFrame();
        f.add(new JButton("A"));
        f.add(new JButton("B"));
        f.add(new JButton("C"));
        f.setSize(500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    }
}
