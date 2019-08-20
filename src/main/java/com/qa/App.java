package com.qa;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    }

    public String returnString(String input1, String input2){
        int inputNumber = (int) (Math.random()*2) + 1;

        if(inputNumber == 1){
            return input1;
        }else{
            return input2;
        }


    }
}
