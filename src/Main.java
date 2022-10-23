import java.util.Arrays;

/**
 * @version 1.0
 * @auther 米豪
 */
public class Main {
    public static void main(String[] args) {
        test1();
        test2(47);
        test3(234.5);
        System.out.println("==========");
        test4();
        test5();

        test6();
    }

    public static void test4(){
        String str="12";
        char cha='a';
        double dou=Double.parseDouble(str);
        Double aDouble = Double.valueOf(str);
        String str1=String.valueOf(cha);


        System.out.println(dou+"=="+aDouble+"=="+str1);
    }

    public static void test1(){
        int i=1;


        System.out.println((i++));
    }

    public static void test2(int i){
        int  week=i/7;
        int day=i%7;
        char cha=45;
        System.out.println(week+day+"==="+(-10.%3));
        int i1 = Integer.parseInt("11");
        System.out.println(i1);
        System.out.println("cccccc"+cha);
    }
    public static void test3(double res){
        double sh=5/9.0*(res-100);
        System.out.println(sh);
    }

    public static void test5(){
        double money=100000;
        int num=0;
      while (true){
          if (money>50000){
             money=money*0.95;
             num++;
          } else if (money>=1000&&money<=50000) {
              money-=1000;
              num++;
          }else {
              break;
          }
      }
        System.out.println("总和："+num);
    }
    public static  void test6(){
        int[] i={1,21,51,3,4};
        int i1;
        int i2=i.length;
        for (int j = 0; j < i2/2; j++) {
            i1=i[j];
            i[j]=i[i2-j-1];
            i[i2-j-1]=i1;
        }
        System.out.println(Arrays.toString(i));
    }
}