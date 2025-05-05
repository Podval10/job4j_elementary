package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;
         if (input.length()==1){
          return input;
}

        for (int i = 0; i <= input.length()-2; i++) {
         if (input.charAt(i)==input.charAt(i+1)){
             counter++;
         }
          else {

                    if(counter>1){
                        result+=Character.toString (input.charAt(i))+counter;
                        counter=1;
                    }else {
                        counter=1;
                        result+=input.charAt(i);
                    }

         }
        }
if (input.charAt(input.length()-1)==input.charAt(input.length()-2)){
    result+=Character.toString( input.charAt(input.length()-1))+counter;
}
     else {
         result+=input.charAt(input.length()-1);
}

        return result;
    }
}
