interface Parser {
    String parse(String str);
}

class StringParse {
    public static String convert(String s) {
        if(s.length() <= 3)
            s = s.toUpperCase();
        else
            s = s.toLowerCase();
        return s;
    }
}


class myPrinter {
    public void print(String str) {
        System.out.println(str);
    }

    public void print(String str, Parser p) {
        System.out.println(str);
    }
}

public class methodReference1 {
    public static void main(String[] args) {
        String str = "my string";
        myPrinter mp1 = new myPrinter();
        mp1.print(str);

        // Parser p = new Parser();
        String str2 = "method reference";
        myPrinter mp2 = new myPrinter();
        mp2.print(str2,(StringParse::convert));
    }
}
