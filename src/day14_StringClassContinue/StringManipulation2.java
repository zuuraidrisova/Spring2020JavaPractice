package day14_StringClassContinue;

public class StringManipulation2 {
    public static void main(String[] args) {

        String str =" ";
        boolean bool1 =  str.isEmpty();
        System.out.println(bool1);//false, bcs there is space

        String username = "";
        if(username.isEmpty()){
            System.out.println("PLease provide your username first");
        }

        String s1 ="Cat";//string literal==>string pool
        String s2 = new String("Cat");//string new==>heap memory

        System.out.println(s1==s2);//false, bcs two different storage

        System.out.println(s1.equals(s2));//true, to compare equality of string

        String z1 ="Tiger";//string pool, bcs literal
        String z2 = new String("Tiger");//heap memory, bcs new
        String z3 ="Tiger";//string pool, bcs literal
        String z4 ="tiger";

        //==
        System.out.println(z1==z2);//false, bcs two different location
        System.out.println(z2==z3);//false, bcs two different memory locations
        System.out.println(z1==z3);//true, because both belong to pool

        //equals():
        System.out.println(z1.equals(z2));//true, both visible text is same
        System.out.println(z2.equals(z3));//true, both visible text is same
        System.out.println(z1.equals(z3));//true, both visible text is same
        System.out.println(z1.equals(z4));//false, both visible text is not same











    }
}
