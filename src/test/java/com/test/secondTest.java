package com.test;

import static org.testng.Assert.assertFalse;

import java.io.IOException;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class secondTest {

	@Test
	public void fail1() {
		throw new NullPointerException("Will fail");
	}

	@Test
	public void fail2() throws IOException {
		throw new IOException("Will fail");
	}

	@Test
	public void test1() {
		throw new RuntimeException();
	}

	@Test
	
	public void test2() throws InterruptedException {

		wait(2000);
		Thread.sleep(5000);
		
		Assert.assertTrue(true, "test is passed");
	}

	
	@Test
	public void test5() {
		assertFalse(true, "test is failed");
	}
	
	@Test
	public void testskipped() {
		throw new SkipException("skipped");
	}
}
