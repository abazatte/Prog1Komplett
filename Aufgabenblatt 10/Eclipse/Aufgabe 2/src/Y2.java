public class Y2 extends Y1{
 @Override
 public void test(){
 System.out.println("2\n");
 }

 public void do1(){
 System.out.println("y2:do1 ");
 test();
 }

 public void do2(){
 System.out.println("y2:do2 ");
 super.test();
 }

 public void do3(){
 System.out.println("y2:do3 ");
 do4();
 }

 public void do4(){
 System.out.println("3\n");
 }
}
