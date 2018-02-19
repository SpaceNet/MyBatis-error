package com.everglowtrading.wms;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import com.example.stock.WmsApplication;

@SpringBootTest
@ContextConfiguration(classes = WmsApplication.class)
public class WmsApplicationTests {

	@Test
	public void contextLoads() {
		assertTrue(true);	
	}

	@Test
	public void test() {
		assertTrue(true);	
	}
}
