package Automation_AI;

public class Action_Item01 {
    public static void main(String[] args) {

        //iterate through different zipCodes value and print them out in for loop
        String[] zipCode = new String[4];
        zipCode[0] = "11204";
        zipCode[1] = "11209";
        zipCode[2] = "11214";
        zipCode[3] = "11228";

        //integer streetNumber
        int[] streetNumber = new int[]{65, 66, 67, 68};

        for (int i = 0; i < zipCode.length; i++) {

            //print statement
            System.out.println("My zip code is " + zipCode[i] + " and my street number is " + streetNumber[i]);

        }//end of for loop
    }//end of main method
}//end of Java class
