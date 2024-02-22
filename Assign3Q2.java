public class Assign3Q2 {
    public static void main(String[] args) {
        String currentMonth = "January";
        System.out.println("The current month is: " + currentMonth);
        
        int daysInMonth = 0;
        switch (currentMonth) {
            case "January":
            case "March":
            case "May":
            case "July":
            case "August":
            case "October":
            case "December":
                daysInMonth = 31;
                break;
            case "April":
            case "June":
            case "September":
            case "November":
                daysInMonth = 30;
                break;
            case "February":
                daysInMonth = 28; // Assuming non-leap year for simplicity
                break;
            default:
                System.out.println("Invalid month");
                return;
        }
        
        System.out.println(currentMonth + " has: " + daysInMonth + " days");
    }
}
