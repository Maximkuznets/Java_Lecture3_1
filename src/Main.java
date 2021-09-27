public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int miles1 = service.calculate(10_000);
        System.out.println(miles1);

        int miles2 = service.calculate(12_000);
        System.out.println(miles2);

        int miles3 = service.calculate(15_000);
        System.out.println(miles3);
    }
}
