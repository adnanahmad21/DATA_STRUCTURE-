public class newswtich {
    public enum day {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
    };

    public static void main(String[] args) {

        day d = day.Monday;
        int x = switch (d) {
            case Monday, Tuesday -> 12;
            case Wednesday, Thursday -> 5;
            default -> 0;

        };
        System.out.println(x);
    }

}
