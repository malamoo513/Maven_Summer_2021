package Week2_Day1;

public class execution_class {
    public static void main(String[] args) {

        Reusable_Methods.addTwoNumbers(10, 20);

        Reusable_Methods.subtractTwoNumber(50, 30);

        int result = Reusable_Methods.addTwoNumbersForReturn(10,20);
int newResult = result + 5;
        System.out.println("New result is " + newResult);


    }//end of main method
}// end of class
