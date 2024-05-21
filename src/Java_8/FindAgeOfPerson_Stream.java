package Java_8;

import java.time.LocalDate;
import java.time.Period;

public class FindAgeOfPerson_Stream {

    //Write a java program to find age of person in years 
    public static void main(String[] args) {

        LocalDate birthDate = LocalDate.parse("1995-11-14");
        LocalDate currentDate = LocalDate.now();

        Period period = Period.between(birthDate, currentDate);

        System.out.println(period.getYears());

    }
}
