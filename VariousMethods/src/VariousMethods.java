public class VariousMethods {
    public static void main(String[] args) {

    }

    public static String monthAsString(int numberOfMonth) {

        String month;

        switch (numberOfMonth) {
            case 1:
                month = "January";
            break;
            case 2:
                month =  "February";
            break;
            case 3:
                month =  "March";
            break;
            case 4:
                month =  "April";
            break;
            case 5:
                month =  "May";
            break;
            case 6:
                month =  "June";
            break;
            case 7:
                month =  "July";
            break;
            case 8:
                month =  "August";
            break;
            case 9:
                month =  "September";
            break;
            case 10:
                month =  "October";
            break;
            case 11:
                month =  "November";
            break;
            case 12:
                month =  "December";
            break;
            default:
                month =  "";
        }

        return  month;

    }

    public static boolean isLeapYear(int year) {

        if((year % 100 != 0 && year % 4 == 0) || (year % 100 == 0 && year % 400 == 0)) {
            return true;
        }

        return  false;
    }

    public static double fahrenheitToCelsius(int fahrenheit) {
        return  5 * ((double)fahrenheit - 32) / 9;
    }

    public static double celsiusToFahreinheit(int celsius) {
        return (double)celsius * 9 / 5 +32;
    }


}