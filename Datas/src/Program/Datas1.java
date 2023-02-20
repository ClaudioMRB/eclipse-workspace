package Program;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Datas1 {

	public static void main(String[] args) {
		        //Convertendo data-hora global para local, obtendo dados

		        LocalDate d04 = LocalDate.parse("2022-07-20");
		        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

		        //Calculos com data-hora
		        LocalDate pastWeekLocalDate = d04.minusDays(7);
		        LocalDate nextWeekLocalDate = d04.plusDays(7);
		        LocalDate nextyears = d04.plusYears(4);
		       
		        System.out.println("pastweekLocalDate: " + pastWeekLocalDate);
		        System.out.println("nextWeekLocalDate: " + nextWeekLocalDate);
		        System.out.println("nextyears: " + nextyears);
		        
		        LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
		        LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
		        LocalDateTime nextWeekLocalDateTimee = d05.minusHours(2);
		        
		        
		        System.out.println("pastweekLocalDateTime: " + pastWeekLocalDateTime);
		        System.out.println("nextWeekLocalDateTime: " + nextWeekLocalDateTime);
		        System.out.println("nextWeekLocalDateTimee: " + nextWeekLocalDateTimee);
		        
		        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		        Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
		        
		        System.out.println("pastWeekInstant: " + pastWeekInstant);
		        System.out.println("nextWeekInstant: " + nextWeekInstant);

		        //Calcular duração entre duas data-horas
		        
		        //Duration t1 = Duration.between(pastWeekLocalDateTime, d05);
		       // Duration t1 = Duration.between(pastWeekLocalDate.atTime(0, 0), d04.atTime(0, 0));
		        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
		        Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
		        Duration t3 = Duration.between(pastWeekInstant, d06);
		        Duration t4 = Duration.between(d06, pastWeekInstant);
		        
		        System.out.println("t1 dias = " + t1.toDays());
		        System.out.println("t2 dias = " + t2.toDays());
		        System.out.println("t3 dias = " + t3.toDays());
		        System.out.println("t4 dias = " + t4.toDays());
		        
		    }
		}
