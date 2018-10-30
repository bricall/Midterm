package tests;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.Collections;

import java.util.ArrayList;

public class cubTest {
	
	@Test
	public void CuboidConstructTest() {
		Cuboid cube = new Cubiod(2,2,2);
		assertTrue(cube instanceof Cuboid)
	}
	
	@Test
	public void GetiDepthTest() {
		Cuboid cube = new Cuboid(2,3,4);
		assertEquals(4,cube.getiDepth());
	}
	
	@Test
	public void CubeareaTest() {
		Cuboid cube = new Cuboid(1,2,3);
		assertEquals(22,cube.area(),0.05);
	}
	
	@Test
	public void CubeVolumeTest() {
		Cuboid cube = new Cuboid(1,2,3);
		assertEquals(6,cube.volume());

}
