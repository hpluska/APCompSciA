public class MyClass{
    String a;

     MyClass(int a){

          this.a = String.valueOf(a);
     }

     MyClass(double a){
 
         this.a = String.valueOf(a);
     }

     MyClass(boolean a){

          this.a = String.valueOf(a);
     }

     String getA(){
         return a;
     }
}
