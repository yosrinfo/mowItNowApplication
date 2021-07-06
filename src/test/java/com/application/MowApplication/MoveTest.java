package com.application.MowApplication;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class MoveTest {
	
	private Border border=new Border("5 5");
	private Position position1=new Position("1 2 N");
	private Position position2=new Position("3 3 E");

	@Test
    void contextLoads() { }
	
	@Test
	public void testMove() {
		/**
		 * @author ymohamed
		 * First Scenario
		 */
		String resultMethod=Move.navigate(border, position1, "GAGAGAGAA");
		String realResult="1 3 N";
		assertEquals(realResult,resultMethod);
		/**
		 * Second Scenario
		 * 
		 */
		assertEquals("5 1 E",Move.navigate(border, position2, "AADAADADDA"));
	}

}
