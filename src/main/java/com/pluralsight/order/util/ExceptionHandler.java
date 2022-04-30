package com.pluralsight.order.util;

import java.sql.SQLException;

/**
 * Utility class to handle exceptions
 */
public class ExceptionHandler {

    /**
     * Method to extract and print information from a SQLException
     * @param sqlException Exception from which information will be extracted
     */
    public static void handleException(SQLException sqlException) {
        sqlException.printStackTrace(System.err);
        System.err.println("SQLState: " +
                            ((SQLException)sqlException).getSQLState());

        System.err.println("Error Code: " +
                            ((SQLException)sqlException).getErrorCode());

        System.err.println("Message: " + sqlException.getMessage());
        }
}
