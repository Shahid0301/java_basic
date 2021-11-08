public class Wrapper {
    public static void main(String[] args) {
        int a=10;
            Integer obj=new Integer(a);  //boxing by constructor
            Integer obj1=Integer.valueOf(a); //boxing by valueof() method
            Integer obj2=a;                     //autoboxing
        System.out.println(obj+obj1+obj2);
        int s=obj2.byteValue();             //unboxing by <type>value() method
        short s1=obj1.byteValue();
        long s2=obj1;                          //autounboxing
        System.out.println(s+s1+s2);
        String obj3= String.valueOf(a);
        Float obj4=Float.valueOf(a);
    }
}
