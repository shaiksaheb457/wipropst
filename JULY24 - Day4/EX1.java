package com.wipro.exception;


class InvalidMonthException extends Exception {
    public InvalidMonthException(String message) {
        super(message);
    }
}

public class EX1 {
    static void checkMonth(int month) throws InvalidMonthException {
        if (month < 1 || month > 12) {
            throw new InvalidMonthException("Invalid month: " + month);
        } else {
            System.out.println("Valid month: " + month);
        }
    }

    public static void main(String[] args) {
        try {
            checkMonth(5);
            checkMonth(15);
        } catch (InvalidMonthException e) {
            System.out.println(e.getMessage());
        }
    }
}
