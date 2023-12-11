package com.vogella.com.vogella.junit.first;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void testRun() {
		fail(" 2 +7 ");
	System.out.println();
	}

	@Test
	void testRunTestResult() {
		fail("0 * 2");
	}

	@Test
	void testAssert() {
		fail("3 / 4");
	}

	@Test
	void testAssertTrueStringBoolean() {
		fail("4 +5 /6");
	}

	@Test
	void testAssertTrueBoolean() {
		fail("6 -8");
	}

	@Test
	void testAssertFalseStringBoolean() {
		fail("4 * 8");
	}

	@Test
	void testAssertFalseBoolean() {
		fail("2 -3 /7");
	}

	@Test
	void testFailString() {
		fail("0 / 6 + 5");
	}

	@Test
	void testFail() {
		fail("7 - 2 ");
	}

	@Test
	void testAssertEqualsStringObjectObject() {
		fail("0 *0 +6");
	}

	@Test
	void testAssertEqualsObjectObject() {
		fail("3/3/5");
	}

	@Test
	void testAssertEqualsStringStringString() {
		fail("2-9+7+5-8");
	}

	@Test
	void testAssertEqualsStringString() {
		fail("6*1*9");
	}

	@Test
	void testAssertEqualsStringDoubleDoubleDouble() {
		fail("1-4-8-6+8");
	}

	@Test
	void testAssertEqualsDoubleDoubleDouble() {
		fail("9*6/4*3");
	}

	@Test
	void testAssertEqualsStringFloatFloatFloat() {
		fail("12*65-74");
	}

	@Test
	void testAssertEqualsFloatFloatFloat() {
		fail("9*10/4+8");
	}

	@Test
	void testAssertEqualsStringLongLong() {
		fail("78* 7-34");
	}

	@Test
	void testAssertEqualsLongLong() {
		fail("50-7*5");
	}

	@Test
	void testAssertEqualsStringBooleanBoolean() {
		fail("9+(6*4)");
	}

	@Test
	void testAssertEqualsBooleanBoolean() {
		fail("56-(6+3)");
	}

	@Test
	void testAssertEqualsStringByteByte() {
		fail("8(5/6)");
	}

	@Test
	void testAssertEqualsByteByte() {
		fail("77-120");
	}

	@Test
	void testAssertEqualsStringCharChar() {
		fail("1124+567");
	}

	@Test
	void testAssertEqualsCharChar() {
		fail("345-6543");
	}

	@Test
	void testAssertEqualsStringShortShort() {
		fail("1234/54");
	}

	@Test
	void testAssertEqualsShortShort() {
		fail("17*78");
	}

	@Test
	void testAssertEqualsStringIntInt() {
		fail("65/20+6111");
	}

	@Test
	void testAssertEqualsIntInt() {
		fail("76-45");
	}

	@Test
	void testAssertNotNullObject() {
		fail("0/5");
	}

	@Test
	void testAssertNotNullStringObject() {
		fail("98*65-2345");
	}

	@Test
	void testAssertNullObject() {
		fail("742579-752");
	}

	@Test
	void testAssertNullStringObject() {
		fail("4578+7544+841");
	}

	@Test
	void testAssertSameStringObjectObject() {
		fail("256789/7654");
	}

	@Test
	void testAssertSameObjectObject() {
		fail("00*543");
	}

	@Test
	void testAssertNotSameStringObjectObject() {
		fail("952/24*64");
	}

	@Test
	void testAssertNotSameObjectObject() {
		fail("98-5443");
	}

	@Test
	void testFormat() {
		fail("99-22*4");
	}

	@Test
	void testEquals() {
		fail("1+8");
	}

}
