package com.TestVargant.Test;

import org.testng.annotations.Test;

public class TestWicketKeeperPlayer extends TestBase {
	//this testCase validates that there is at least one wicketkeeper
	@Test
	public void WicketKeeper() throws Exception {

		int WicketKeepercount = 0,requiredCount = 1;

		for (int i = 0; i <= 10; i++) {
			String expRole = readJson.readJSONDataPlayerrolename(i);
			String actRole = "Wicket-keeper";

			if (actRole.equals(expRole)) {
				WicketKeepercount++;//count of Wicketkeeperrole
                 break;
			}
		}
		sa.assertEquals(requiredCount,WicketKeepercount);
        sa.assertAll();

	}

}
