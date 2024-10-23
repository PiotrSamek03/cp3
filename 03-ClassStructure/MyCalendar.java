import MonthEnum;

public class MyCalendar {
    static int year;
    static int month;
    static int day;

    static String MyDate() {
        return year + "-" + month +"-"+ day;
    }

    static Void MonthName(){
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("June");
                break;
            case 6:
                System.out.println("July");
                break;
            case 7:
                System.out.println("August");
                break;
            default:
                break;
        }
    }

}


