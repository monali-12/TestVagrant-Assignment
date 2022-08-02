package com.TestVargant.Test;

import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import com.TestVargant.util.ReadJsonData;

public class TestBase {

	SoftAssert sa;

	public TestBase() {
		sa = new SoftAssert();
	}

	ReadJsonData readJson;

	@BeforeMethod
	public void init() {
		readJson = new ReadJsonData();
	}
}
