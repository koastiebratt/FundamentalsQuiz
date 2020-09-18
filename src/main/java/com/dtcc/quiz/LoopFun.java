package com.dtcc.quiz;

public class LoopFun {
    /**
     * Given a number, return the factorial of that number.
     * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
     * @param number
     * @return the factorial of the number
     */
    public Integer factorial(Integer number){
        int total = number;
        for(int i = (total-1); i > 0; i--){
            total = total * i;
        }
        return total;
}

    /**
     * Given a phrase, get the acronym of that phrase. Acronym is the combination of
     * the first character of each word in upper case.
     * For example, given "Ruby on Rails", this method will return "ROR"
     * @param phrase
     * @return Upper case string of the first letter of each word
     */
    public String acronym(String phrase) {
        String temp_string = (phrase.charAt(0) +"");

        for(int i = 0; i < phrase.length(); i++){
            if(phrase.charAt(i) == ' '){
            String temp_val = phrase.charAt(i+1) +"";
            temp_string += temp_val.toUpperCase();
            }
        }
       return temp_string.toUpperCase();
    }

    /**
     * To prevent anyone from reading our messages, we can encrypt it so it will only be readable by its
     * intended audience. This method encrypt the message by shifting the letter by 3 characters. If the character is
     * at the end of the alphabet, it will wraps around.
     * For example:
     *  'a' => 'd'
     *  'w' => 'z'
     *  'x' => 'a'
     *  'y' => 'b'
     * @param word
     * @return the encrypted string by shifting each character by three character
     */
    public String encrypt(String word) {

        int temp_val;
        String new_string ="";
        for(int i = 0; i < word.length(); i++){
            temp_val = (int)(word.charAt(i));

            if((temp_val >= 88 && temp_val <= 90) || (temp_val >=120 && temp_val <=122)){
                new_string += (char)(temp_val -  23);

            }else{
                new_string += (char)(temp_val + 3);
            }
        }
        return new_string;
    }
}

