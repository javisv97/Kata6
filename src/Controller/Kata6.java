package Controller;

import Model.Histogram;
import Model.Mail;
import Model.Person;
import View.Attribute;
import View.DataBaseList;
import View.HistogramDisplay;
import View.HistogramBuilder;
import View.MailListReader;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class Kata6 {
    public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {

        String filename ="Emails.txt";
        List<Mail> mailList= MailListReader.read(filename);
        HistogramBuilder<Mail> builder = new HistogramBuilder<Mail>(mailList);
        
        
      Histogram<String> domains = builder.build(new Attribute<Mail, String>() {
            @Override
            public String get(Mail item) {
                return item.getMail().split("@")[1];
            }
        });
        
        new HistogramDisplay(domains,"Dominios").execute();	
        
        
        Histogram<Character> letters = builder.build(new Attribute<Mail, Character>() {
            @Override
            public Character get(Mail item) {
                return item.getMail().charAt(0);
            }
        });
        
        new HistogramDisplay(letters,"Primer Caracter").execute();
        
        
        List <Person> people = DataBaseList.read();
        HistogramBuilder<Person> builderPerson = new HistogramBuilder<>(people);
        
        
        Histogram<Character> gender = builderPerson.build(new Attribute<Person, Character> () {
            @Override
            public Character get(Person item){
                return item.getGender();
            }
        });
        new HistogramDisplay (gender, "Gender").execute();
        
        List <Person> people2 = DataBaseList.read();
        HistogramBuilder<Person> builderPerson2 = new HistogramBuilder<>(people2);
        
        
        Histogram<Float> weight = builderPerson2.build(new Attribute<Person, Float> () {
            @Override
            public Float get(Person item){
                return item.getWeight();
            }
        });
        new HistogramDisplay (weight, "Peso").execute();
    }
}