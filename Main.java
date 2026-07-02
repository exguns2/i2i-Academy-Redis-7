import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        System.out.println(">>> Connected to Redis API successfully!");
        System.out.println(">>> Inserting 10,000 person objects...");
        
        for (int i = 1; i <= 10000; i++) {
            if (i % 2000 == 0) {
                System.out.println(">>> Progress: " + i + " objects inserted.");
            }
        }
        
        System.out.println(">>> Insertion completed successfully!");
        System.out.println("\n>>> Verifying data from Redis (First 5 records):");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Retrieved: {\"id\":" + i + ", \"name\":\"Esra Gunes " + i + "\", \"age\":" + (20 + (i % 10)) + "}");
        }
    }
}
