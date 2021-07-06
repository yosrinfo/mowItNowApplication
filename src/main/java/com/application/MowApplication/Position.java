package com.application.MowApplication;

/**
 * 
 * @author ymohamed
 * Define the position (x,y) and direction (N,E,W,S).
 */

public class Position {
	private int x;
	private int y;
	private char dir;
	
	
	public Position(String params) {
		try {
			this.x=Integer.valueOf(params.substring(0,params.indexOf(" ")));
			this.y=Integer.valueOf(params.substring(params.indexOf(" ")+1,params.lastIndexOf(" ")));
		}catch(Exception e) {
			e.printStackTrace();
		}
		this.dir=params.charAt(params.length()-1);
		
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	public char getDir() {
		return dir;
	}
	public void setDir(char dir) {
		this.dir = dir;
	}
	@Override
	public String toString() {
		return "Position [x=" + x + ", y=" + y + ", dir=" + dir + "]";
	}
	
	
	
}
