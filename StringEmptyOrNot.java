public class StringEmptyOrNOt
{
    public static void main(String[] args) {
        Predicate<String> EmptyObj=(str)->str.isEmpty();
        String str1="";
        String str2="Maha";
        System.out.println(EmptyObj.test(str1));
        System.out.println(EmptyObj.test(str2));
    }
}
/*output
  true
  fasle
  */
