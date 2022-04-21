import java.util.*;
class Activity{
   String string1;
   String string2;
   public static Activity(String string1 , String string2)
   {
this.string1 = string1;
this.string2 = string2;
this.operator = operator;
   }
}
public class Main{

       String str = "";
       public String handlingException(Activity a){
try{
           if(a.operator!="+"||a.operator!="-")
           {
if(a.string1!=null&& a.string2!=null)
               {
str = "None Exception found";
               }
           }
       }
       }
catch(NullPointerException e){
e.printStackTrace();
           }
catch(Exception e)
           {
e.printStackTrace();
           }
       public String doOperation(Activity a)
       {
           String stringpp1="";
           if(a.operator=="+")
           {
               stringpp1 = a.string1.concat(a.string2);
           }
           return stringpp1;
       }
       public static void main(String args[]) throws Exception{
           Scanner sc = new Scanner(System.in);
           Activity ac = new Activity("Hello ", "world" , "+");
       }

}
