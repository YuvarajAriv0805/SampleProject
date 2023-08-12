package com.parameters.dataprovider;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.utils.BaseClass;

public class SampleParameters extends BaseClass{
	
	@BeforeClass
	public void beforeClass(String brow) {
		browserOpen(brow);
	}

	@Parameters("url")
	@Test
	public void bobcatMethod(String url) {
		loadUrl(url);
	}
}
