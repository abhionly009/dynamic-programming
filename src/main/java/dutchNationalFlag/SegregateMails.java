package main.java.dutchNationalFlag;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SegregateMails {

    public String[] segregate(String [] mails){

        int low = 0;
        int mid = 0;
        int high = mails.length-1;

        while (mid<=high){
            if (mails[mid].equalsIgnoreCase("IMPORTANT")){

                String temp = mails[low];
                mails[low++] = mails[mid];
                mails[mid++] = temp;

            }else if (mails[mid].equalsIgnoreCase("NORMAL")){
                mid++;

            }else {
                String temp = mails[mid];
                mails[mid] = mails[high];
                mails[high--] = temp;

            }

        }
        return mails;

    }


    public static void main(String[] args) {
        MailList mailList = new MailList();
        List<Mail> mails = mailList.getMailList();

        SegregateMails segregateMails = new SegregateMails();

        String[] mailTypes = mails.stream()
                .map(mail -> mail.getMailType().name())
                .toArray(String[]::new);


        String [] result =  segregateMails.segregate(mailTypes);

       for(String mail:result){
           System.out.println(mail);
       }


    }
}
