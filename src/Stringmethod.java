import java.lang.ProcessBuilder.Redirect.Type;

public class Stringmethod {
    public static void main(String[] args) {
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        String s3 = "abcikhh";
        String s4 = "abcI";
        // System.out.println(s1==s2);
        // System.out.println(s3==s4);
        // System.out.println(s1.equals(s2));
        // System.out.println(s3.equals(s4));

        // String s5 = "Hiiiee";
        // // charAt
        // System.out.println(s5.charAt(2));
        // // Concat
        // s5 = s5.concat(s5);
        // System.out.println(s5);
        // // equals

        // // 
        // System.out.println(s3.equalsIgnoreCase(s4));
        // // compare
        // System.out.println(s3.compareToIgnoreCase(s4));
        // // IsEmpty
        // String s=  "";
        // System.out.println(s.isEmpty()); 
        // // length
        // System.out.println(("Hello".length()));
        // // Replace
        // System.out.println("Hello".replace('H', 'Z'));
        // // indexOf
        // System.out.println("Hello".indexOf('o'));
        // // Start and end width 
        // System.out.println(s3.startsWith("gbc"));
        // System.out.println("     Hello ".trim());
        // String g = "Hello Coumpter Engineer Of Lj University . How are you doing?";
        // String[] h = g.split("");
        // System.out.print("[");
        // // System.out.println(h.length);
        // for(int i = 0; i < h.length; i++){
        //     if(i == (h.length - 1)){
        //         System.out.print(h[i]);
        //     } else {
        //         System.out.print(h[i]+", ");
        //     }
        // }
        // System.out.print("]");


        // String Buffer
        
        StringBuffer sb = new StringBuffer("Hola Lj");
        System.out.println(sb);
        // set char at 
        // sb.setCharAt(1, 'V');
        // System.out.println(sb);

        // System.out.println(sb.append(sb));
        System.out.println(sb.insert(2, "Vraj", 0, 4));
        System.out.println(sb.delete(0, 2));
        System.out.println(sb.reverse());
        System.out.println(sb);
        System.out.println(sb.replace(0, 2, "ABCDEFG"));
        
        StringBuffer sb1 = new StringBuffer("Hello");
        String s = sb1.toString();
        1
    }
}