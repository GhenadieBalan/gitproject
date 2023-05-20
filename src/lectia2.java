import javax.swing.*;
import java.net.SocketTimeoutException;
import java.sql.SQLOutput;
import java.util.Random;

public class lectia2 {
    int varsta = 18;

    public static void main(String[] args) {
        System.out.println(Math.max(5, 0));
        System.out.println(Math.min(7, 3));
        System.out.println(Math.random());
        System.out.println(Math.sqrt(1980));
        System.out.println(Math.abs(-9.5));
        System.out.println(Math.pow(4, 4));
        int varsta = 16;
        if (varsta >= 18) {
            System.out.println("sunteti adulti");
        } else {
            System.out.println("sunteti minori");
        }

        String pozitia = ("HR");

        if (pozitia.equals("QA Automation")) {
            System.out.println("avem nevoie de tine");

        } else if (pozitia.equals("java developer")) {
            System.out.println("QA Automation");
        } else if (pozitia.equals("HR")) {

            System.out.println("noi cautam QA Automation");
        } else {
            System.out.println("noi nu cunoastem asa pozitie");
        }
        {
            String company = "EST Computer";
            switch (company) {
                case "maib":
                    System.out.println("best bank");
                    break;
                case "allied testing":
                    System.out.println("main focus of QA");
                    break;
                case "EST Computer":
                    System.out.println("Main focus of Frontend");
                    break;
                default:
                    System.out.println("this company not existed");
            }
            {
                String zile = "joi";
                switch (zile) {
                    case "luni":
                        System.out.println("prima zi lucratoare");
                        break;
                    case "marti":
                        System.out.println("a doua zi lucratoare");
                        break;
                    case "miercuri":
                        System.out.println("a treia zi lucratoare");
                        break;
                    case "joi":
                        System.out.println("Curs QA Automation");
                        break;
                    case "vineri":
                        System.out.println("a cincea zi lucratoare");
                        break;
                    case "simbata":
                        System.out.println("Curs QA Automation");
                        break;
                    case "duminica":
                        System.out.println("zi libera");
                        break;
                    default:
                        System.out.println("nu exista asa zi");
                }

            }
        }


    }
}
