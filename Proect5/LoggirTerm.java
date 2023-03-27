package Proect5;

import java.time.LocalDateTime;

public class LoggirTerm implements Loggirable {

    @Override
    public void logg(String msg) {
       System.out.println(LocalDateTime.now() + msg);
    }
    
}
