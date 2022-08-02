package com.TestVargant.Test;

import org.testng.annotations.Test;

public class TestForeignPlayerTest extends TestBase {
	// this testCase is validates that the team has only 4 foreign players
	@Test
	public void ForeignPlayer() throws Exception {

		int IndiaCountrycount = 0, foreignCountrycount = 0, requiredCount = 7;

		for (int i = 0; i <= 10; i++) {
			String expCountry = readJson.readJSONDataPlayercountrytname(i);
			String actCountry = "India";

			if (actCountry.equals(expCountry)) {
				IndiaCountrycount++;//count of india country
			} else {
				foreignCountrycount++;
			}

		}
		sa.assertEquals(requiredCount, IndiaCountrycount);
		sa.assertAll();
	}

}
