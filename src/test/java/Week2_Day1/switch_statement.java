package Week2_Day1;

public class switch_statement {

    public static void main(String[] args) {

        //define an array list, iterate through each array value but only print when
        //the city is queens or brooklyn or manhattan
        String[] cities = new String[4];
        cities[0] = "QNS";
        cities[1] = "M";
        cities[2] = "BK";
        cities[3] = "SI";

        //using for loop to iterate through cities and only print when its brooklyn or queens or manhattan
        for (int i = 0; i < cities.length; i++) {
            switch (cities[i]){
                case "QNS":
                    System.out.println("My city is QNS");
                    break;
                case "BK":
                    System.out.println("My city is BK");
                    break;
                case "M":
                    System.out.println("My city is M");
                    break;

            }//end of switch
        }//end of for loop
    }//end of main method
}//end of java class
