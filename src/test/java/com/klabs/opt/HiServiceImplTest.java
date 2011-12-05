package com.klabs.opt;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HiServiceImplTest {

	@Test
	public void testHi() {

		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("tzolkin-config.xml");
		HiService hiService = (HiService) appContext.getBean("HiService");
		String prefix = "¡Hola ";
		String suffix = "!, ¿como va todo? atte. Karim";
		String name = "Karim";
		assertEquals(prefix+name+suffix , hiService.hi(name));
		
		
	}

}
