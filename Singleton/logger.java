import java.io.*;
import java.util.*;

class Logger {
    private Logger(){} // Private constructor 
    private static Logger theinstance = new Logger();
    private static int verbosity = 2; // ranges from 0, silent, to 1 normal, to 2 significant amount
    private static PrintWriter file = null;
    private static String filename = "Logger.txt";
    private static int counter = 0;

    public static Logger getInstance() {
        return theinstance;
    }

    public static void incr(){
        ++counter;
    }

    static {
        try {
            file = new PrintWriter( new BufferedWriter (new FileWriter(filename, true))); // The true flag sets it to append and not write over
            log("Logger created");
            log("TextFile: " + filename);
        }
        catch(IOException ioe){
           log("IOException: " + ioe.getMessage());
        }
    }

    public static void log(String toLog){
        String toAppend = "";
        if(verbosity > 0){
            // Here we add more data for higher verbosity
            toAppend += counter + " ";
            incr();
        }
        if(verbosity > 1){
            toAppend += new Date() + " ";
        }
        toAppend += toLog;
        file.println(toAppend);
        file.flush();
    }
}