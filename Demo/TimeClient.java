import java.time.LocalDateTime;

/**
 * 
 * Exercise 2: Suppose that you have written a time server, which periodically notifies its clients of the 
 * current date and time. Write an interface that the server could use to enforce a particular protocol
 * on its clients.
 *
 */
public interface TimeClient {
    void setTime(int hour, int minute, int second);
    void setDate(int day, int month, int year);
    void setDateAndTime(int day, int month, int year,
                               int hour, int minute, int second);
    LocalDateTime getLocalDateTime();
}
