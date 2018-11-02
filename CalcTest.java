package junit_lecture;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalcTest {
	Calc m;
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("BEFORE CLASS");
	}
	@Before
	public void setUp() {
		m = new Calc();
		System.out.println("Before test");
	}
	
	@Test
	public void testAdd() {
		assertEquals(5, m.add(2,3));
		assertEquals(6, m.max(6, 5));
		assertEquals(10, m.max(10, -7));
		assertEquals(23, m.max(23, 23)); //this one not eassy to trace which error, buat macam di bawah
	}
	
	
	@Test
	public void test1() {
		assertEquals(5, m.add(2,3));
	}
	
	@Test
	public void test2() {
		assertEquals(6, m.max(6, 5));
	}
	
	@Test
	public void test3() {
		assertEquals(10, m.max(10, -7));
	}
	
	@Test
	public void test4() {
		assertEquals(23, m.max(23, 23));
	}
//	
//	@Test
//	public void testSortedArrays() {
//		int[] numbers = {1,2,3,1};
//		int[] expectedVal = {1,1,2,3};
//		Arrays.sort(numbers);
//		assertEquals(expectedVal,numbers);	//fail sebab assertEqual and not assertArrayEquals	
//	}
	
	@Test
	public void testSortedArrays() {
		int[] numbers = {1,2,3,1};
		int[] expectedVal = {1,1,2,3};
		Arrays.sort(numbers);
		assertArrayEquals(expectedVal,numbers);	//fail sebab assertEqual and not assertArrayEquals	
	}
	
	@Test (expected=NullPointerException.class)
	public void testSortedArrays_Null() {
		int[]numbers = null;
		Arrays.sort(numbers);
	}
	
	@Test(timeout=10)
	public void testSort_Performance() {
		int array[]= {12,23,4};
		for(int i=1; i<=100000; i++) {
			array[0]=i;
			Arrays.sort(array);
		}
	}
	
	@Test
	public void testChar() {
		assertFalse("AHDV",m.areFirstandSecondLastCharTheSame("ABCD"));
		
	}
	
	@Test
	public void testChar2() {
		assertTrue("Dummy String",m.areFirstandSecondLastCharTheSame("ABAB"));
	}
	
	@After
	public void teardown() {
		System.out.println("SYSTEM ENDS");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("AFTER CLASS");
		
	}

}
