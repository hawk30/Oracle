package hackerarnk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by oracle on 30/10/16.
 */
public class Tries_lahori {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<String> contacts = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            switch (in.next()) {

                case "add":
                    String contact = in.next();
                    int pos = Collections.binarySearch(contacts, contact);
                    if (pos < 0) pos = Math.abs(pos) - 1;
                    contacts.add(pos, contact);
                    break;

                case "find":
                    String pattern = in.next();
                    int count = 0;
                    int j = 0;
                    while ((j < contacts.size()) &&
                            (contacts.get(j).compareTo(pattern) < 0))
                        j++;
                    while ((j < contacts.size()) &&
                            (contacts.get(j).startsWith(pattern))) {
                        count++;
                        j++;
                    }
                    System.out.println(count);
                    break;

                default:
                    System.out.println("Fatal error.");
                    System.exit(-1);

            }
        }
        in.close();

    }
}
