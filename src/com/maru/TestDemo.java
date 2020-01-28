/**
 * 
 */
package com.maru;

import service.Shape;

/**
 * @author Admin
 *
 */
public class TestDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to Eclipse");
		Shape shape = new Triangle();
		shape.draw();
		shape.getShape();

	}

}
