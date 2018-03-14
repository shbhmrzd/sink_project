import java.lang.*;

public class SimpleDotCom {

    int[] locations = new int[3];
    int numOfHits = 0;

    public String checkYourself(String stringGuess){
        String result = "miss";
        int guess = Integer.parseInt(stringGuess);

        for(int cells : locations){
            if(guess == cells){
                numOfHits++;
                result = "hit";
                break;
            }
        }

        if(numOfHits == locations.length)
            result = "kill";

        System.out.println(result);
        return result;

    }

    public void setLocationCells (int[] locations){
        this.locations = locations;
    }
}
