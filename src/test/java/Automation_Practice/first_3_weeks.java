package Automation_Practice;

public class first_3_weeks {
    public static void main(String[] args) {

        //print statement
        System.out.println(" Dogecoin will reach $1,000,000 in 2025 ");
        System.out.println(" Ethereum will reach number one crypto market! ");

//data types
        String value = " Dogecoin to the moon ";
        String value1 = " Earth, Mars, Jupiter";
        Integer number = 33;

        System.out.println(value + value1 + " " + number);

//set up for dynamic array
        String[] color = new String[11];
        color[0] = "white";
        color[1] = "black";
        color[2] = "yellow";
        color[3] = "orange";
        color[4] = "red";
        color[5] = "blue";
        color[6] = "gray";
        color[7] = "pink";
        color[8] = "green";
        color[9] = "purple";
        color[10] = "brown";

        //set up linear array with integer
        int[] power_of_10s = new int[]{0, 10, 100, 1000, 10000, 100000, 1000000, 10000000,};
        System.out.println(color[1] + " " + "is my favorite color" + " it makes someone look" + " " + power_of_10s[5] + " " + " times better.");

//using for loop to iterate the values
        for (int i = 0; i < color.length; i++) {
            System.out.println("The common colors are " + color[i]);
        }//end of loop

        //create arrays for switch statement
        String[] car = new String[5];
        car[0] = "Honda";
        car[1] = "Toyota";
        car[2] = "Jeep";
        car[3] = "Nissan";
        car[4] = "Audi";

        //for loop to iterate these cars
        for (int i = 0; i < car.length; i++) {
            switch (car[i]) {
                case "Honda":
                    System.out.println("People drive Honda");
                    break;
                case "Toyota":
                    System.out.println("People drive Toyota");
                    break;
                case "Jeep":
                    System.out.println("People drive Jeep");
                    break;
                case "Nissan":
                    System.out.println("People drive Nissan");
                    break;
                case "Audi":
                    System.out.println("People drive Audi");
                    break;
            }//end of switch statement
        }//end of loop

        System.out.println(" ");

        //multiple conditional statement
        int a = 175;
        int b = 225;
        int c = 500;

if (a+b <c) {
    System.out.println(" a & b is less than c ");
} else if (a+b >c) {
    System.out.println("a & b is greater than c ");
}else{
    System.out.println(" a & b is equal to c ");
}// end of multiple condition

    }//end of main method
}//end of Java Class
