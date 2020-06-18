package dev.koodeu;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        String input = "Krystian Limiera  600-625-420 80-422 Sopot";
        String pattern = "([a-z,A-Z]+)\\s+([a-z,A-Z]+)\\s+([0-9,\\-,]{9,12})\\s([0-9,\\-]{6})\\s([a-z,A-Z]{2,})";
//        String pattern = "([a-z,A-Z]+[b-z]+[a])\\s+([a-z,A-Z]+)\\s+([0-9,\\-,]{9,12})\\s([0-9,\\-]{6})\\s([a-z,A-Z]{2,})";

        Pattern patternPerson = Pattern.compile(pattern);
        Matcher matcher = patternPerson.matcher(input);

        if (matcher.find()) {
            String name = matcher.group(1);
            String surname = matcher.group(2);
            String telefon = matcher.group(3);
            String kodPocztowy = matcher.group(4);
            String miasto = matcher.group(5);
            System.out.printf(" Imie: %s\n Nazwisko: %s\n Kod pocztowy: %s\n Miasto: %s\n Numer telefonu: %s\n", name,
                    surname, kodPocztowy, miasto, telefon);
        } else {
            System.out.println("Wejściowy tekst nie pasuje do wzorca.");
        }
    }
    }

