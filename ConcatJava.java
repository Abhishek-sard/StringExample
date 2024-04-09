public class ConcatJava {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "world";
        String s3 = s1+s2;
        System.out.println(s3);//using operator
        System.out.println(s1.concat(s2));//using concat method
    }
}
