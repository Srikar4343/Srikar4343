package Assignment2;

public class chaitanyadema {
    int i = 10;
    String str = "Hello";
    static int j = 10;

    void display(){
        System.out.println("In display method");
    }
    public static void main(String[] args) {
        int a =20;

        chaitanyadema classobject = new chaitanyadema();
       // classobject.i = 800;
       // classobject.str ="Bach";
      //  classobject.j = 80;y();

        chaitanyadema cobject1 = new chaitanyadema();
        cobject1.str = "Egiles";
       // cobject1.i = 200;
       // cobject1.j = 1000;
        cobject1.display();

        System.out.println(classobject.i+"   "+classobject.str +"  " +classobject.j);
        System.out.println(cobject1.i+"  "+cobject1.str);
    }
}

