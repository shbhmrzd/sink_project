import java.util.*;
import java.lang.*;

public class SimpleDotComTestDrive {

    public static void main(String[] args) {

        //SimpleDotCom dot = new SimpleDotCom();
        DotCom dot = new DotCom();
        int numOfGuesses = 0;
        Scanner scanner = new Scanner(System.in);
        String result = null;
        int start = (int) (Math.random()*5);
        ArrayList<Integer> locations = new ArrayList<Integer>();
        locations.add(start);
        locations.add(start+1);
        locations.add(start+2);
        dot.setLocationCells(locations);

        while(result == null || !result.equals("kill")){
        String userGuess = scanner.nextLine();
        numOfGuesses++;
        result = dot.checkYourself(userGuess);

        String testResult = "failed";
        if(result.equals("hit") || result.equals("kill")){
            testResult = "passed";
        }
            System.out.println(testResult);
        }

        System.out.println("User killed the dot_com after "+numOfGuesses+" tries");
        float accuracy = (3f/numOfGuesses)*100;
        System.out.println("Rating of the user is "+accuracy);
    }
}
