// Ibrahim Mohamed

package computinganisbn.pkg10checksumIbrahimMohamed;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class ComputingAnISBN10ChecksumIbrahimMohamed
{

    public static void main(String[] args)
    {

        int first, second, third, fourth, fifth, sixth, seventh, eighth, nineth
                , option = 0, checkSum;

        Scanner input = new Scanner(System.in);

        while (option == 0)
        {
            System.out.println("Enter one number at a time please:");

            first = input.nextInt();
            second = input.nextInt();
            third = input.nextInt();
            fourth = input.nextInt();
            fifth = input.nextInt();
            sixth = input.nextInt();
            seventh = input.nextInt();
            eighth = input.nextInt();
            nineth = input.nextInt();

            checkSum = ((1 * first) + (2 * second) + (3 * third) + (4 * fourth)
                    + (5 * fifth) + (6 * sixth) + (7 * seventh) + (8 * eighth)
                    + (9 * nineth)) % 11;
            
            if (checkSum == 10)
            {
                System.out.printf("Your ISBN-10 is: %d%d%d%d%d%d%d%d%dX\n",
                        first, second, third, fourth, fifth, sixth, seventh,
                        eighth, nineth);
            } else
            {
                System.out.printf("Your ISBN-10 is: %d%d%d%d%d%d%d%d%d%d\n",
                        first, second, third, fourth, fifth, sixth, seventh,
                        eighth, nineth, checkSum);
            }

            option = JOptionPane.showConfirmDialog(null, "Would you like do "
                    + "another ISBN-10?");
        }
    }
}
