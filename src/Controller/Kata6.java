package Controller;

import Model.Histogram;
import Model.Mail;
import View.HistogramDisplay;
import View.MailHistogramBuilder;
import View.MailListReader;

import java.io.IOException;
import java.util.List;

public class Kata6 {
    public static void main(String[] args) throws IOException {
        String filename ="Emails.txt";
        List<Mail> mailList= MailListReader.read(filename);
        Histogram<String> histogram = MailHistogramBuilder.build(mailList);
        HistogramDisplay histoDisplay= new HistogramDisplay(histogram);
        histoDisplay.execute();
    }
}