package com.application.MowApplication;

/**
 * 
 * @author ymohamed
 * Define the border of grid
 * The attributes is readonly.
 * 
 *
 */

public class Border {
	
	//
	private int width;
	private int height;
	public Border(String borderStream) {
		try {
			this.width=Integer.valueOf(borderStream.substring(0,borderStream.indexOf(" ")));
			this.height=Integer.valueOf(borderStream.substring(borderStream.indexOf(" ")+1));
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	@Override
	public String toString() {
		return "Border [width=" + width + ", height=" + height + "]";
	}
	
	
	
	
	
	
}
