package tmethoddemo;
public class TMethodDemo {
    public static void main(String[] args) {
        int score[] = {95,96,55,64,23,102,115};
        Arrmethod(score);
    }
    public static void Arrmethod(int score[]) {
        int i, max;
        max = score[0];
        for (i = 0; i < score.length; i++) {
            if(max < score[i])
                max = score[i];
        }
        System.out.println("max = " + max);
    }
}
