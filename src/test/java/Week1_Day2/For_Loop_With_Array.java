package Week1_Day2;

public class For_Loop_With_Array {
    public static void main(String[] args) {

        String[] countries = new String[5];
        countries[0] = "USA";
        countries[1] = "China";
        countries[2] = "UK";
        countries[3] = "India";
        countries[4] = "Russia";

        String[] placement = new String[5];
        placement[0] = "first";
        placement[1] = "second";
        placement[2] = "third";
        placement[3] = "fourth";
        placement[4] = "fifth";

        //using for loop to iterate through these values
        for (int i = 0; i < countries.length; i++) {
    //print statement
            System.out.println("My country is " + countries[i] + " and placement is " + placement[i]);

        }//end of for loop
    }//end of main method
}//end of java class
