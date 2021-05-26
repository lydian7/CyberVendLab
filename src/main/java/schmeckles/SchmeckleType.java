package schmeckles;

import java.util.ArrayList;

public enum SchmeckleType {
    ONE(1, false),
    TWO(2, false),
    FIVE(3, false),
    TEN(10, true),
    TWENTY(20, true),
    FIDY(50, true),
    TON(100, true),
    TWOTON(200, true),
    MONKEY(500, true),
    G(1000, true);

private final int value;
private final boolean check;



    SchmeckleType(int value, boolean check) {
        this.value = value;
        this.check = check;
    }

    public ArrayList<Integer> getAll(){
        ArrayList<Integer> goodSchmeckles = new ArrayList<>();

        SchmeckleType[] schmeckles = SchmeckleType.values();

        for(SchmeckleType schmeckle : schmeckles){
            if(schmeckle.check){
                goodSchmeckles.add(schmeckle.value);
            }

        }

        return goodSchmeckles;
    }

    public int getValue() {
        return value;
    }
}
