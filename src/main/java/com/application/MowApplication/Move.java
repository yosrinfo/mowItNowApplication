package com.application.MowApplication;

public class Move {

	/**
	 * @author ymohamed
	 * 
	 */
	
	private static  String direction="ESWN";
	
	/**
	 * 
	 * @param border: border for the grid
	 * @param position: initial position
	 * @param sequence: sequence of directions (G,D or A).
	 */
	
	public static String  navigate(Border border,Position position,String sequence) {
		int d=direction.indexOf(position.getDir());
		String direction="ESWN";
		for(int i=0;i<sequence.length();i++) {
			if(sequence.charAt(i)=='G') {
				d--;
				if(d==-1) {
					d=direction.length()-1;
				}
			}else if(sequence.charAt(i)=='D') {
				d++;
				if(d==direction.length()) {
					d=0;
				}
			}else if(sequence.charAt(i)=='A') {
				if(direction.charAt(d)=='N') {
					position.setY(position.getY()+1);
				}
				if(direction.charAt(d)=='E') {
					position.setX(position.getX()+1);
				}
				if(direction.charAt(d)=='S') {
					position.setY(position.getY()-1);
				}
				if(direction.charAt(d)=='W') {
					position.setX(position.getX()-1);
				}
			}
		}
		return String.valueOf(position.getX())+" "+String.valueOf(position.getY())+" "+direction.charAt(d);
	}
}
