package org.runner.sample;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.test.junit.AdactinConfirm;
import com.test.junit.AdactinLogin;
import com.test.junit.AdactinSearchHotel;

@RunWith(Suite.class)
@SuiteClasses({AdactinLogin.class, AdactinSearchHotel.class, AdactinConfirm.class})
public class RunnerExample {
	

}
