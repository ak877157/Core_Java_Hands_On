package com.org.gen.day3.question6;

import java.time.*;
public interface TimeServer {
	void setTime(int hour, int minute, int second);
	void setDate(int day, int month, int year);
	void setDateandTime(int day,int  month, int year, int hour, int minute, int second);
	
	LocalDateTime geLocalDateTime();
}
