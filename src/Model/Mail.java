package Model;

public class Mail {
    
    private String mail;
    private int Id;

    public Mail(String mail, int Id) {
        this.mail = mail;
        this.Id = Id;
    }

    public String getMail() {
        return mail;
    }

    public int getId() {
        return Id;
    }
    

    
}