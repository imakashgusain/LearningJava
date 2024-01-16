package switchevolution;

public class Java17SwitchExample {
    public static void main(String[] args){
        Object day = "Monday";
        System.out.println(getDay(day));

    }

    public static String getDay(Object day){
        return switch (day) {
            case Integer i -> "It is an integer";
            case String s -> "It is a string";
            case Float f -> "It is a float";
            default -> "It is none of the known data types";
        };
    }
}
