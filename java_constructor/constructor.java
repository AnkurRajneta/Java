 class Great {
     int roll_no;
     String name;
     Great(){
         roll_no=207003;
         name="Ankur";
     }
     Great(int a, int b){
         roll_no=a*b;
         name="Hector";

     }
     Great(int a){
         roll_no=a;
         name="Vector";

     }
     public static void main(String[] args) {
         Great boy=new Great();
         System.out.println(boy.name);
         System.out.println(boy.roll_no);

         //With the help of parameters
         Great fruits=new Great(5,6);
         System.out.println(fruits.name);
         System.out.println(fruits.roll_no);

         //with single parameter
         Great classic=new Great(8);
         System.out.println(classic.name);
         System.out.println(classic.roll_no);

    }
}