package za.ac.cput.Util;

public class Helper {
    //checks if an ID is valid
    public static boolean isValidId(int id) {
        return id > 0;

    }

    //Provides a default status if none is given
    public static String checkStatus(String status) {
        return (status == null || status.isEmpty()) ? "Pending" : status;
    }
    //Validates score range
    public static boolean isValidScore(int score){
        return score >= 0 && score <= 100;
    }


}
