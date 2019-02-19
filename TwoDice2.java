//Filename: TwoDice.java 
//Author: Damian Lester
//Date: 1.29.19
//Application that generates two die objects and displays their value at the command prompt         

public class TwoDice2{
    public static void main(String[] args) {
        //Create Two die object 
        Die2 die1 = new Die2();
        Die2 die2 = new Die2();

        //Save the Die values in variables        
        int value1 = die1.getValue();
        int value2 = die2.getValue();

        //output the values throught println           
        System.out.println("Die 1 value:" + die1.getValue());
        System.out.println("Die 2 value:" + die2.getValue());
        
        //Decide what the outcome of the two dice should be         
        if(value1 == value2)
        {
            System.out.println("The dice are a match!!");
        }
        else 
        {
            if(value1 > value2)
            {
                System.out.println("Die 1 is the Winner!!");
            }
            else
            {
                System.out.println("Die 2 is the winner!!");
            }
        }
    }
}