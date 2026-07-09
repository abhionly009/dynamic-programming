package main.java.string;

public class IsomorphicString {

    public boolean isIsomorphic(String s, String t){

        int [] indexS = new int[200];
        int [] indexT = new int[200];

        int len = s.length();

        if (len != t.length()){
            return false;
        }

        for (int i =0;i<len;i++){

            if (indexS[s.charAt(i)]!= indexT[t.charAt(i)]){
                return false;
            }

            indexS[s.charAt(i)] = i+1;
            indexT[t.charAt(i)] = i+1;

        }

        return true;

    }

    public static void main(String[] args) {

        String input1 = "paper";
        String input2 = "title";

        IsomorphicString isomorphicString = new IsomorphicString();

        boolean result = isomorphicString.isIsomorphic(input1,input2);

        System.out.println(result);

    }
}
