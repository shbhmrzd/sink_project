import java.lang.*;
import java.util.ArrayList;

public class DotCom {

    private ArrayList<Integer> locationCells;
    public ArrayList<Integer> getLocationCells() {
        return locationCells;
    }

    public void setLocationCells(ArrayList<Integer> locationCells) {
        this.locationCells = locationCells;
    }

    public String checkYourself (String guessString){

        String result = "miss";
        Integer guess = Integer.parseInt(guessString);
        int index = locationCells.indexOf(guess);

        if(index>=0){
            locationCells.remove(guess);
            if(locationCells.isEmpty())
                result = "kill";
            else
                result = "hit";
        }

        return result;
    }


}
