import java.lang.*;

public class SimpleDotCom {

    int[] locations = new int[3];
    int numOfHits = 0;

    public String checkYourself(String stringGuess){
        String result = "miss";
        int guess = Integer.parseInt(stringGuess);

//        for(int cells : locations){
//            if(guess == cells){
//                numOfHits++;
//                result = "hit";
//                break;
//            }
//        }

        for(int i=0;i<3;i++){
            if(locations[i]==guess){
                numOfHits++;
                locations[i]=0;   //setting the dot_com cordinate to 0 once that particular index has been hit
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
