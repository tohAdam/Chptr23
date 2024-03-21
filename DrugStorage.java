public class DrugStorage {
    public static void main(String[] args) {
        double effectiveness = 100.0;
        int month = 0;

        System.out.println("month: " + month + "        effectiveness: " + effectiveness);

        while (effectiveness >= 50.0) {
            month++;
            effectiveness *= 0.96;
            System.out.println("month: " + month + "        effectiveness: " + effectiveness);
        }
        System.out.println("DISCARDED");
    }
}
