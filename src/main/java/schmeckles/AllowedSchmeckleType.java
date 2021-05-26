package schmeckles;

import java.util.ArrayList;

public enum AllowedSchmeckleType {

    TEN(10),
    TWENTY(20),
    FIDY(50),
    TON(100),
    TWOTON(200),
    MONKEY(500),
    G(1000);

    private final int value;



    AllowedSchmeckleType(int value) {
        this.value = value;
    }

    public ArrayList<Integer> getAll(){
        ArrayList<Integer> goodSchmeckles = new ArrayList<>();

        AllowedSchmeckleType[] schmeckles = AllowedSchmeckleType.values();

        for(AllowedSchmeckleType schmeckle : schmeckles){
            goodSchmeckles.add(schmeckle.value);
        }

        return goodSchmeckles;
    }

    public int getValue() {
        return value;
    }
}
