package examples.menu;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.menu.CustomMenuInputScanner;

import java.util.HashMap;
import java.util.Map;

public class CustomMenuInputScannerTest {
    public static void main(String[] args) {
        Prompt prompt = new Prompt(System.in,System.out);

        Map<Integer,String> options = new HashMap<>();
        options.put(5,"Bahia");
        options.put(30,"João");
        options.put(2,"Tiago");

        CustomMenuInputScanner scanner = new CustomMenuInputScanner(options);
        scanner.setMessage("Choose someone:");

        System.out.println(prompt.getUserInput(scanner));
    }
}
