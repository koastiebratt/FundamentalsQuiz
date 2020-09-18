package com.dtcc.quiz;

public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
        return input;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
        return (baseValue + valueToBeAdded);
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        String temp_string = "";
        for(int i = (valueToBeReversed.length()-1); i >=0; i--){
            temp_string += valueToBeReversed.charAt(i) + "";
        }
        return temp_string;
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        int middle = (word.length() /2 ) + (1/2);
        return word.charAt(middle);
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        String temp_string = "";
        //tryptophan
        for(int i = 0; i < value.length(); i++){
           char s = value.charAt(i);
            if(value.charAt(i) != charToRemove){
                temp_string += s +"";
            }
        }
        return temp_string;
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        String temp_string = "";

        for(int i = 0; i < sentence.length(); i++){
                if(sentence.charAt(i) == ' '){
                    temp_string = "";
                }else{
                    temp_string += sentence.charAt(i) + "";
                }
            }
        return temp_string;
        }
    }

