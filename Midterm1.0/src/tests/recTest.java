package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.Collections;

import java.util.ArrayList;

public class recTest {
	
	@Test
	public void RectangleConstructorTest() {
		Rectangle rect = new Rectangle(2,2);
		assertTrue(rect instanceof Rectangle);
	}
	
	@Test
	public void GetiWidthTest() {
		Rectangle rect =new Rectangle(2,2);
		assertEquals(2,rect.getiWidth());
	}
	
	@Test
	public void GetiLengthTest{
		Rectangle rect = new Rectangle(2,2);
		assertEquals(2,rect.getiLength());
	}
	
	@Test
	public void areaTest() {
		Rectangle rectangle= new Rectangle(2,2);
		assertEquals(4,rectangle.area());
	}
	
	@Test 
	public void perimeterTest() {
		Rectangle rectangle= new Rectangle(2,2);
		assertEquals(8,rectangle.perimeter());