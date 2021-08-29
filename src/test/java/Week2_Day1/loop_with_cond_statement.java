package Week2_Day1;

public class loop_with_cond_statement {
    public static void main(String[] args) {

        //define an array list, iterate through each array value but only print when
        //the city is queens or brooklyn

        String[] cities = new String[4];
        cities[0] = "QNS";
        cities[1] = "M";
        cities[2] = "BK";
        cities[3] = "SI";

        //using for loop to iterate through cities and only print when its brooklyn or queens
        for (int i = 0; i < cities.length; i++) {
            System.out.println("My city is " + cities[i]);
            if (cities[i] == "BK") {
                System.out.println("My city is " + cities[i]);
            } else if (cities[i] == "QNS") {
                System.out.println("My city is " + cities[i]);

            }//end of conditions
        }//end of for loop
    }//end of main method
}//end of java class








