package main.java.dutchNationalFlag;

public class Mail {

    private String message;
    private String from;
    private MailType mailType;

    public Mail(String message, String from, MailType mailType) {
        this.message = message;
        this.from = from;
        this.mailType = mailType;
    }

    public Mail() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public MailType getMailType() {
        return mailType;
    }

    public void setMailType(MailType mailType) {
        this.mailType = mailType;
    }
}
