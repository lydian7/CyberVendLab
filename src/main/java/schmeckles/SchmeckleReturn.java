package schmeckles;

import java.util.ArrayList;

public class SchmeckleReturn {

    private ArrayList<Schmeckle> schmeckles;

    public SchmeckleReturn(ArrayList<Schmeckle> schmeckles) {
        this.schmeckles = schmeckles;
    }

    public int getTotal(){
        int total = 0;
        for(Schmeckle schmeckle : schmeckles){
            total += schmeckle.getSchmeckle().getValue();
        }
        return total;
    }

    public void addSchmeckle(Schmeckle schmeckle){
        this.schmeckles.add(schmeckle);
    }

    public ArrayList<Schmeckle> getSchmeckles() {
        return schmeckles;
    }
}
