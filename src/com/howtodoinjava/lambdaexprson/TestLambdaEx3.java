package com.howtodoinjava.lambdaexprson;

import javax.swing.JButton;

/**
 * Using lambda expression for adding an event listener to a GUI component
 */
public class TestLambdaEx3 {
	public static void main(String[] args) {
		JButton buton = new JButton("Submit");
		buton.addActionListener((e) -> {
			System.out.println("Click event triggerd !");
		});
	}
}
