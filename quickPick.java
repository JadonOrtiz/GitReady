import java.util.Scanner;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class quickPick
{
    public static void main(String[] args)
    {
        int amount;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("CA QuickPick");
        System.out.println();
        System.out.println("How many quick picks? ");
        amount = keyboard.nextInt();
        System.out.println();
        System.out.println("                 Mega");

        for(int i = 0; i < amount; i++)
        {
            System.out.printf("%c", 'A' + i);
            int[] QuickPick = QuickPick();
            for(int value : QuickPick)
            {
                System.out.printf(" %02d", value);
            }
            System.out.println();
        }

        
    }

    static int[] QuickPick()
    {
        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();
        for(int i = 0; i < 5; i++)
        {
            int num;
            do{
                num = random.nextInt(47) + 1;
            }while(numbers.contains(num));
            numbers.add(num);
        }
        numbers.add(random.nextInt(27) +1);
        int[] QuickPick = new int[numbers.size()];
        for(int i = 0; i < QuickPick.length; i++)
        {
            QuickPick[i] = numbers.get(i);
        }
        return QuickPick;
    }
}