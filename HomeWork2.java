public class HomeWork2 {
    public static void main(String[] args) {
sum(2, 2);
check(4);
stack(42);
simple(0,10);
year(1968);
    }
    public static boolean sum(int a,int b){
        int c = 2;
        int d = 4;
        if (a+b<=10&&a+b>=20) {
            return true;
        }
            else{
                return false;
            }

    }
    public static boolean check(int v){
        if (v>=0){
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean stack(int a){
    if (a/1==a) {
    return true;
    }
    else {
    return false;
    }


    }
      public static void simple (int f, int e){
      while (e >= f){
          System.out.println(f);
          f++;
      }
    }
    public static boolean year(int year){
        if (year%4==0 && year%100 !=0 || year%400==0) {
        return true;
        }
        else {
            return false;
        }
    }
}
