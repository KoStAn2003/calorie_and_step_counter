

public class Converter {
    int convertToKm(int sum){
        int sm = 75;
        int rezKm;
        rezKm = (sm*sum) / 100_000;
       return rezKm;
    }

    int convertStepsToKilocalories(int sum){
            int kl =50;
            int rezKl;
            rezKl = (kl*sum) / 1000;
            return rezKl;
    }

}
