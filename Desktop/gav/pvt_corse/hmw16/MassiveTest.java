package homework16Test;

import static org.testng.AssertJUnit.assertArrayEquals;
import org.testng.annotations.Test;

import homework16.Massive;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class MassiveTest {
	@Ignore // Alternative of @Test(enable=false)
	@Test(dataProvider = "test1", enabled = false)
	public void test1(Integer n, Integer s) {
		Massive m = new Massive();
		int[] a = { n, s };
		int[] b = m.Revers(a);
		assertArrayEquals("*smthng*", b, a);
	}

	@Test(dataProvider = "test1", expectedExceptions = AssertionError.class)
	public void test2(Integer n, Integer s) {
		Massive m = new Massive();
		int[] a = { n, s };
		int[] b = m.Writ(a, s);
		assertArrayEquals("not equal", b, a);
	}

	@Test(dataProvider = "test2")
	public void test3(int[] n, int[] s, String k) {
		Massive m = new Massive();

		int[] b = m.Div(n);
		assertArrayEquals(k, b, s);
	}

	@Test(expectedExceptions = UnsupportedOperationException.class)
	public void test4() {
		Massive m = new Massive();

		assertEquals(0, m.remove(new int[6], 2));

	}

	@Test
	public void test5() throws Exception {
		Massive m = new Massive();
		assertEquals(false, m.contains(new int[6], "a"));
	}

	@Test
	public void test6() throws Exception {
		Massive m = new Massive();
		assertEquals(false, m.equals(new int[6], new int[6]));
	}

	@Test
	public void test7() throws Exception {
		Massive m = new Massive();
		assertEquals(0, m.Div(new int[6], 2));
	}

	@Test
	public void test8() throws Exception {
		Massive m = new Massive();
		int a = m.remove(new int[6], 2) + m.Div(new int[6], 1);
		assertEquals(a, m.Div(new int[6], 2));
	}

	@Test
	public void test9() throws Exception {
		Massive m = new Massive();
		int[] a = { 1, 2, 3 };
		boolean с = m.contains(a, "a");
		boolean d = m.equals(a, a);
		assertEquals(с, d);
	}

	@Test(expectedExceptions = UnsupportedOperationException.class)
	public void test10() throws Exception {
		Massive m = new Massive();
		int[] a = { 7, 10, 8 };
		int[] b = { 10, 0, 7 };

		try {
			final int actual = m.remove(b, 0);
			final int expected = m.Div(a, m.Div(b, 1)) * 2;

			assertEquals(expected, actual);
		} catch (ArithmeticException | UnsupportedOperationException e) {
			System.err.println("error");
		} finally {
			int actual = m.Div(a, 1) * m.remove(b, 2);
			int expected = m.Div(new int[6], 1);
			assertEquals(expected, actual);

		}
	}

	@Test
	public void test11() throws Exception {
		Massive m = new Massive();
		int[] b = { 10, 0, 7 };
		int[] a = b;
		assertEquals(true, m.equals(a, b));
	}

	@Test
	public void test12() throws Exception {
		Massive m = new Massive();
		int[] anyMas = { 7, 8 };

		int actual_result = m.Sum(anyMas);
		int expected_result = 15;

		assertEquals(actual_result, expected_result, "not ok");
	}

	@Test
	public void test13() throws Exception {
		Massive m = new Massive();
		int[] a = { 7, 8 };
		int actual_result = m.Min(a);
		int expected_result = 7;

		assertEquals(actual_result, expected_result, "not ok");
	}

	@Test
	public void test14() throws Exception {
		Massive m = new Massive();
		int[] a = { 5, 5 };
		int actual_result = m.Multi(a);
		int expected_result = 25;
		assertEquals(actual_result, (expected_result));
	}

	@Test
	public void test15() throws Exception {
		Massive m = new Massive();
		int[] a = { 5, 3, };

		int actual_result = m.Min(a);
		int expected_result = 3;

		assertEquals(actual_result, expected_result, "*some result*");
	}

	@Test(expectedExceptions = ArithmeticException.class)
	public void test16() throws Exception {
		Massive m = new Massive();
		int[] a = { 1, 0 };
		m.Div(a);
	}

	@Test
	public void test17() throws Exception {
		Massive m = new Massive();
		assertNotNull(m, "not 0");

	}

	@Test(expectedExceptions = ArithmeticException.class)
	public void test18() throws Exception {
		Massive m = new Massive();
		int[] a = { 7, 9 };
		int[] b = m.Div(a);
		assertTrue(b[1] == 3, "not");

	}

	@Test(expectedExceptions = ArrayIndexOutOfBoundsException.class)
	public void test19() throws Exception {
		Massive m = new Massive();
		int[] a = { 9, 1 };
		int[] b = m.Writ(a, 0);
		assertFalse(b[0] == 4, "ok");

	}

	@Test(dataProvider = "test3", enabled = false)
	public void test20(Integer x) throws Exception {
		Massive m = new Massive();
		int[] a = { 9, 1 };

		int c = m.remove(a, x);
		assertEquals(5, c);

	}

	@Test
	public void test21() throws Exception {
		Massive m = new Massive();
		int[] a = { 9, 1 };

		int[] c = m.Revers(a);
		assertNotNull(c, "not 0");

	}

	@Test
	public void test22() throws Exception {
		Massive m = new Massive();
		int[] a = { 9, 1 };

		int[] c = m.Revers(a);
		assertNotNull(m.Div(c), "not 0");

	}

	@Test
	public void test23() throws Exception {
		Massive m = new Massive();
		int[] a = { 9, 1 };

		int[] c = m.Revers(a);
		int[] d = m.Div(c);
		int k = m.remove(d, 0);
		assertNotNull(k, "not 0");

	}

	@Test
	public void test24() throws Exception {
		Massive m = new Massive();
		int[] a = { 9, 1 };

		int[] c = m.Revers(a);
		int[] d = m.Div(c);
		int k = m.remove(d, 0);
		int s = m.remove(d, k);
		boolean j = m.contains(d, s);
		assertNotNull(j, "not 0");

	}

	@Test
	public void test25() throws Exception {
		Massive m = new Massive();
		int[] a = { 9, 1 };

		int[] c = m.Revers(a);
		int[] d = m.Div(c);
		int k = m.remove(d, 0);
		int s = m.remove(d, k);
		boolean j = m.contains(d, s);
		boolean r = m.equals(c, d);
		assertEquals(j, r);

	}

	@BeforeMethod
	public void beforeMethod() {
	}

	@AfterMethod
	public void afterMethod() {
	}
	

	@DataProvider
	public Object[][] test3() {

		return new Object[][] {

				new Object[] { 5 }, new Object[] { 6 }, new Object[] { 7 }, };
	}

	@DataProvider
	public Object[][] test2() {

		int[] a = { 2, 2 };
		int[] b = { 2, 1 };

		return new Object[][] {

				new Object[] { a, b, "a" }, };
	}

	@DataProvider
	public Object[][] test1() {

		return new Object[][] {

				new Object[] { 1, 1 }, new Object[] { 4, 2 }, };
	}

	@BeforeClass
	public void beforeClass() {
	}

	@AfterClass
	public void afterClass() {
	}

	@BeforeTest
	public void beforeTest() {
	}

	@AfterTest
	public void afterTest() {
	}

	@BeforeSuite
	public void beforeSuite() {
	}

	@AfterSuite
	public void afterSuite() {
	}

}
