public class Program3 {}
 abstract class Marks 
 {
     abstract void getPercentage();

 }

 class A extends Marks
 {
     double sub1;
     double sub2;
     double sub3;
void getPercentage(){
        double Aper = ((sub1+sub2+sub3)/300)*100;
        System.out.println("The percentage of student A is "+Aper);
}
  A(double Msub1, double Msub2, double Msub3){
    sub1 = Msub1;
    sub2 = Msub2;
    sub3 = Msub3;
  }

  public static void main(String[] args) {
      A Aobj = new A(50.3, 85, 95);
      Aobj.getPercentage();
  }
 }
 class B extends Marks
 {
    double sub1;
    double sub2;
    double sub3;
    double sub4;
void getPercentage(){
       double Bper = ((sub1+sub2+sub3+sub4)/400)*100;
       System.out.println("The percentage of student B is "+Bper);
}
 B(double Msub1, double Msub2, double Msub3, double Msub4){
   sub1 = Msub1;
   sub2 = Msub2;
   sub3 = Msub3;
   sub4 = Msub4;
 }

 public static void main(String[] args) {
     B Bobj = new B(55.5, 85.5, 94, 95);
     Bobj.getPercentage();
 }
}