package com.care.tdd.ex1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class CalcProcTest {
	
	@Test
	public void plus() {
		int result = CalcProc.plus(1,2);
		assertThat(result).isEqualTo(3);
	}
}
