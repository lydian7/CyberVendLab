import java.util.ArrayList;

public enum Schmeckles {
    TEN(10),
    TWENTY(20),
    FIDY(50),
    TON(100),
    TWOTON(200),
    MONKEY(500),
    G(1000);

private final int value;



    Schmeckles(int value) {
        this.value = value;
    }

    public ArrayList<Integer> getAll(){
        ArrayList<Integer> goodSchmeckles = new ArrayList<>();

        Schmeckles[] schmeckles = Schmeckles.values();

        for(Schmeckles schmeckle : schmeckles){
            goodSchmeckles.add(schmeckle.value);
        }

        return goodSchmeckles;
    }
}
