import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MeetProblem
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        String c;
        if((c=scan.nextLine())!=null)
            {
                Pattern pt = Pattern.compile("[^a-zA-z0-9]");
                Matcher match = pt.matcher(c);

                while (match.find())
                {
                    c=c.replace(Character.toString(c.charAt(match.start())),"");
                }
                System.out.println(c);

        /* String[] strContent = {
                "Meet^patel/in\\ajsjsj^sj@\\jjj/ddj$"
        };
        String pattern = "[^a-zA-z0-9]";

        for (String str : strContent) {
            System.out.println(str.replaceAll(pattern, " "));

         */
        }
    }
}