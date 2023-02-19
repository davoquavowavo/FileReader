import java.io.File;
import java.util.Scanner;

public class FileReader3000 {
    public static void main(String[] args) {

        File file = new File("/Brugere/catharinasaltorp-jorgensen/Overførsler/captmidn.txt");
        Scanner scan = new Scanner(file);

        while(scan.hasNextLine()) {

            System.out.println(scan.nextLine());

        }
    }
}