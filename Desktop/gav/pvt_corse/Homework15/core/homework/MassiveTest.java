package homework;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import junit.framework.Assert;

public class MassiveTest {

	@BeforeClass
	public static void a() throws Exception {
	}

	@Ignore
	@Before
	public void b() throws Exception {
	}

	@Test(expected = UnsupportedOperationException.class)
	public void test() throws Exception {
		Massive m = new Massive();

		assertEquals(0, m.remove(new int[6], 2));
	}

	@After
	public void c() throws Exception {
	}

	@Before
	public void b1() throws Exception {
	}

	@Test
	public void test1() throws Exception {
		Massive m = new Massive();

		assertEquals(false, m.contains(new int[6], "a"));
	}

	@After
	public void c1() throws Exception {
	}

	@Before
	public void b2() throws Exception {
	}

	@Test
	public void test2() throws Exception {
		Massive m = new Massive();

		assertEquals(false, m.isEmpty(new int[6], 2));
	}

	@After
	public void c2() throws Exception {
	}

	@Before
	public void b3() throws Exception {
	}

	@Test
	public void test3() throws Exception {
		Massive m = new Massive();

		assertEquals(false, m.equals(new int[6], new int[6]));
	}

	@After
	public void c3() throws Exception {
	}

	@Before
	public void b4() throws Exception {
	}

	@Test
	public void test4() throws Exception {
		Massive m = new Massive();
		assertEquals(0, m.Div(new int[6], 2));
	}

	@After
	public void c4() throws Exception {
	}

	@Before
	public void b5() throws Exception {
	}

	@Ignore
	@Test
	public void test5() throws Exception {

		Massive m = new Massive();
		int a = m.remove(new int[6], 2) + m.Div(new int[6], 1);
		assertEquals(a, m.Div(new int[6], 2));
	}

	@After
	public void c5() throws Exception {
	}

	@Before
	public void b6() throws Exception {
	}

	@Test
	public void test6() throws Exception {

		Massive m = new Massive();
		int[] a = { 1, 2, 3 };
		boolean с = m.isEmpty(a, 0);
		boolean d = m.equals(a, a);
		boolean c = d;
		assertEquals(true, c);

	}

	@After
	public void c6() throws Exception {
	}

	@Before
	public void b7() throws Exception {
	}

	@Ignore
	@Test(expected = UnsupportedOperationException.class)
	public void test7() throws Exception {

		Massive m = new Massive();
		int[] a = { 7, 10, 8 };
		int[] b = { 10, 0, 7 };

		try {
			final int actual = m.remove(b, 0);
			final int expected = m.Div(a, m.Div(b, 1)) * 2;

			assertEquals(expected, actual);
		} catch (ArithmeticException | UnsupportedOperationException e) {
			System.err.println("ошибка");
		} finally {
			int actual = m.Div(a, 1) * m.remove(b, 2);
			int expected = m.Div(new int[6], 1);
			assertEquals(expected, actual);

		}

	}

	@After
	public void c7() throws Exception {
	}

	@Before
	public void b8() throws Exception {
	}

	@Test
	public void test8() throws Exception {

		Massive m = new Massive();
		int[] b = { 10, 0, 7 };
		int[] a = b;
		assertTrue("ok", m.equals(a, b));
	}

	@After
	public void c8() throws Exception {
	}

	@Before
	public void b9() throws Exception {
	}

	@Test
	public void test9() throws Exception {

		Massive m = new Massive();
		int[] b = { 10, 0, 7 };


		assertThat(m.isEmpty(b, 1) is(not(False)));

	}

	@After
	public void c9() throws Exception {
	}

	@AfterClass
	public static void d() throws Exception {
		System.out.println("That's all folks!");
	}
}
