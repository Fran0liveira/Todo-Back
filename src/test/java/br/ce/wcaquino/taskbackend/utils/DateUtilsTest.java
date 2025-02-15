package br.ce.wcaquino.taskbackend.utils;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;

import org.junit.Test;

public class DateUtilsTest {
	
	@Test
	public void givenPastDateWhenIsEqualOrFutureDateThenReturnFalse() 
	{
		
		LocalDate dateTime = LocalDate.of(2025, 02, 14);
		assertFalse(DateUtils.isEqualOrFutureDate(dateTime));
	}
	
	@Test
	public void givenNowDateWhenIsEqualOrFutureDateThenReturnFalse() 
	{
		
		LocalDate dateTime = LocalDate.now();
		assertTrue(DateUtils.isEqualOrFutureDate(dateTime));
	}
	
	@Test
	public void givenFutureDateWhenIsEqualOrFutureDateThenReturnFalse() 
	{
		
		LocalDate dateTime = LocalDate.now().plusDays(1);
		assertTrue(DateUtils.isEqualOrFutureDate(dateTime));
	}

}
