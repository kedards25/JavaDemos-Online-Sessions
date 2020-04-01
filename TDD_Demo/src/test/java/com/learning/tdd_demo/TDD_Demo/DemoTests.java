package com.learning.tdd_demo.TDD_Demo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class DemoTests {

	IDemo demo=new DemoClass();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		System.out.println("Before class");
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After class");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("setUp Method");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("tearDown Method");
	}

	@Ignore
	@Test
	public void test() {
		System.out.println("Hello");
	}
	
	@Ignore
	@Test
	public void test1() {
		System.out.println("Hello from test1");
	}
	
	@Ignore
	@Test
	public void testAdd()
	{
		assertEquals(5, demo.add(2,8));
	}

	@Test
	public void testSub()
	{
		int val=demo.sub(10,5);
		assertEquals(4,val );
	}
	
}
