public class ProblemSolution
{
    public static void main(String[] args)
    {
        String s = "Meet^patel/in\\ajsjsj^sj@\\jjj/ddj$";
        // s = s.replaceAll("[^a-zA-Z0-9]","");
        s = s.replaceAll("[/@^$\\\\]","");
        System.out.println(s);

    }
}
