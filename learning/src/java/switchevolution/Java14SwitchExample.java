package switchevolution;

public class Java14SwitchExample {
    public static void main(String[] args){
        String day = "Monday";
        System.out.println(getDay(day));
        System.out.println(getDayNewWay(day));
    }


    public static String getDay(String day){
        return  switch (day) {
            case "Monday"-> "Week day";
            case "Tuesday"-> "Week day";
            case "Wednesday"->"Week day";
            case "Thursday"->"Week day";
            case "Friday"->"Week day";
            case "Saturday"-> "Weekend";
            case "Sunday"-> "Weekend";
            default->"Unknown";
        };
    }
    public static String getDayNewWay(String day){
        return  switch (day) {
            case "Monday","Tuesday","Wednesday","Thursday","Friday"
                    -> "Week day";
            case "Saturday", "Sunday" -> "Weekend";
            default->"Unknown";
        };
    }
}
