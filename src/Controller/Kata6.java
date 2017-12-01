package Controller;

import Model.Histogram;
import Model.Mail;
import View.Attribute;
import View.HistogramDisplay;
import View.HistogramBuilder;
import View.MailListReader;

import java.io.IOException;
import java.util.List;

public class Kata6 {
    public static void main(String[] args) throws IOException {
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
    }
}