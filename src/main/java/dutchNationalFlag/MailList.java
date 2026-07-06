package main.java.dutchNationalFlag;

import java.util.ArrayList;
import java.util.List;

public class MailList {


    public List<Mail> getMailList(){

       return List.of(
                new Mail("Project status update", "manager@company.com", MailType.IMPORTANT),
                new Mail("Flat 70% discount on shoes", "offers@shopping.com", MailType.SPAM),
                new Mail("Weekend cricket plans?", "friend@gmail.com", MailType.NORMAL),
                new Mail("Production issue needs immediate attention", "lead@company.com", MailType.IMPORTANT),
                new Mail("Congratulations! You won an iPhone", "lottery@fake.com", MailType.SPAM),
                new Mail("Lunch at 1 PM?", "colleague@company.com", MailType.NORMAL),
                new Mail("Password reset request", "security@company.com", MailType.IMPORTANT),
                new Mail("Earn ₹50,000 working from home", "jobs@spam.com", MailType.SPAM),
                new Mail("Monthly bank statement", "bank@bank.com", MailType.NORMAL),
                new Mail("Interview scheduled for tomorrow", "hr@nexttrial.ai", MailType.IMPORTANT),
                new Mail("Exclusive crypto investment opportunity", "crypto@spam.com", MailType.SPAM),
                new Mail("Happy Birthday!", "family@gmail.com", MailType.NORMAL),
                new Mail("Team meeting at 10 AM", "scrummaster@company.com", MailType.IMPORTANT),
                new Mail("Claim your free vacation now!", "travel@spam.com", MailType.SPAM),
                new Mail("Movie night this Saturday", "bestfriend@gmail.com", MailType.NORMAL)
        );

    }

}
