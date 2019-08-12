
//not done

import java.text.ParseException;
    import java.text.SimpleDateFormat;
    import java.text.ParseException;
    import java.util.Date;
    import java.util.Scanner;
    public class program6 {
      public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        System.out.println(calculateBornDay(s1));
      }
      public static String calculateBornDay(String s1) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("DD-MM-yy");
        SimpleDateFormat sdf1 = new SimpleDateFormat("MMMM");
        Date d = sdf.parse(s1);
        String s = sdf1.format(d);
        return s.toUpperCase();
      }
    }