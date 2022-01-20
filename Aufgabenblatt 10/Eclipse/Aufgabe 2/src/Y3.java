public class Y3 extends Y2{
 @Override
 public void do1(){
 System.out.println("y3:do1 ");
 test();
 }

 @Override
 public void do2(){
 System.out.println("y3:do2 ");
 super.do3();
 }

 @Override
 public void do3(){
 System.out.println("y3:do3 ");
 super.do2();
 }

 @Override
 public void do4(){
 System.out.println("y3:do4 ");
 do2();
 }
}