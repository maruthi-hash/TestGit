/**
 * 
 */
package com.maru;

import service.Shape;

/**
 * @author Admin
 *
 */
public class Triangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Drawing  Triangle");
	}

	@Override
	public void getShape() {
		System.out.println("shape is Triangle");
	}

}
