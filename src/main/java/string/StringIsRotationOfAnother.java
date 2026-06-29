package main.java.string;

public class StringIsRotationOfAnother {

    public boolean rotateString(String str, String goals){

        if(str.length() != goals.length()){
            return false;
        }
        String result = str+str;
        return result.contains(goals);

    }

    public static void main(String[] args) {

        String input = "rotation";
        String goals = "tionrota";

        StringIsRotationOfAnother stringIsRotationOfAnother = new StringIsRotationOfAnother();
        System.out.println(stringIsRotationOfAnother.rotateString(input,goals));

    }
}
