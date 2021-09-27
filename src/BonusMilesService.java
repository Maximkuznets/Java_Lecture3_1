public class BonusMilesService {
    public int calculate(int ticket) {
        int milesRub = 20;
        int miles = ticket / milesRub;
        return miles;
    }
}