package schmeckles;

import java.util.ArrayList;

public enum SchmeckleType {
    TEN(10),
    TWENTY(20),
    FIDY(50),
    TON(100),
    TWOTON(200),
    MONKEY(500),
    G(1000);

private final int value;



    SchmeckleType(int value) {
        this.value = value;
    }

    public ArrayList<Integer> getAll(){
        ArrayList<Integer> goodSchmeckles = new ArrayList<>();

        SchmeckleType[] schmeckles = SchmeckleType.values();

        for(SchmeckleType schmeckle : schmeckles){
            goodSchmeckles.add(schmeckle.value);
        }

        return goodSchmeckles;
    }

    public int getValue() {
        return value;
    }
}
