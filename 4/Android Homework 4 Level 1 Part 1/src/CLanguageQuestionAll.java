
import java.util.Scanner;

/**
 * ..
 *
 * @author 2023210515
 * @date 2023/11/19
 * 14:30
 */
public class CLanguageQuestionAll {
    public static CLanguageQuestion[] cLanguageQuestion = new CLanguageQuestion[20];

    public void getCl() {
        for (int i = 0; i < 20; i++) {
            cLanguageQuestion[i] = new CLanguageQuestion();
        }
        cLanguageQuestion[0].question = """
                int a=-19;
                则如下说法正确的是（    ）
                A、a%4的值为-1        B、a%-4的值为-3
                C、a%-4的值为3        C、a%4的值为3""";
        cLanguageQuestion[0].answer = "B";
        cLanguageQuestion[1].question = """
                int a;现有如下表达式，其中表达式的值不同的是（    ）
                A、a='0'      B、a=0
                C、a='\\0'     D、a='\\00'
                """;
        cLanguageQuestion[1].answer = "A";
        cLanguageQuestion[2].question = """
                int a=5,b=4,c=3，则表达式!a<=!b-c的值为:
                """;
        cLanguageQuestion[2].answer = "0";
        cLanguageQuestion[3].question = """
                #include <stdio.h>
                int main()
                {
                  int a=7;
                  if(a++>7)
                    printf("%d",++a);
                  else
                    printf("%d",a++);
                  return 0;
                }
                本题的输出为:
                """;
        cLanguageQuestion[3].answer = "8";
        cLanguageQuestion[4].question = """
                int a=2,b=2,c=0;
                则表达式a==b>c的值为_________
                """;
        cLanguageQuestion[4].answer = "0";
        cLanguageQuestion[5].question = """
                #include <stdio.h>
                int main()
                {
                    int a=5,b=4,c=3;
                    if(a>=b>=c)
                       printf("yes");
                    else  if(b<=c)
                       printf("no");
                    else
                       printf("ok");;
                    return 0;
                }
                本程序的输出为:
                """;
        cLanguageQuestion[5].answer = "ok";
        cLanguageQuestion[6].question = """
                #include <stdio.h>
                int main()
                {
                    int a=3;
                    while(a-- > 1)
                       printf("%d",a);
                    printf("%d",a);
                    return 0;
                }
                本程序输出:
                """;
        cLanguageQuestion[6].answer = "210";
        cLanguageQuestion[7].question = """
                for(char ch='3';ch--;)
                     printf("%d",ch);
                关于本程序说法正确的是（   ）
                A、输出3次            B、输出2次
                C、输出超过3次     D、无法正确编译
                """;
        cLanguageQuestion[7].answer = "C";
        cLanguageQuestion[8].question = """
                #include <stdio.h>
                int main()
                {
                    int i,j,m,n;
                    i=j=m=n=0;
                    for(;i++<2;)
                        for(;j++<2;)
                           if(j>i) m++;n++;
                    printf("%d%d",m,n);
                    return 0;
                }
                本题输出为
                """;
        cLanguageQuestion[8].answer = "11";
        cLanguageQuestion[9].question = """
                 
                  float x=1;
                   do{
                        x-=0.5;
                        printf("%f\\n",x);
                    }
                    while(x);
                关于本程序的描述正确的是（    ）
                A、该循环体会执行2次                  B、该循环体会执行1次
                C、该循环体执行次数不确定               D、这程序语法错误
                """;
        cLanguageQuestion[9].answer = "A";
        cLanguageQuestion[10].question = """
                有函数的调用func((a,b),(c,d-x));则该函数调用的实参数量为（     ）
                A、1个     B、2个     C、4个    D、5个
                """;
        cLanguageQuestion[10].answer = "B";
        cLanguageQuestion[11].question = """
                #include <stdio.h>
                void func()
                {
                    static int x=0;
                    int y=0;
                    printf("%d%d",x++,y++);
                }
                void main()
                {
                    func();
                    func();
                }
                //本程序的输出为
                """;
        cLanguageQuestion[11].answer = "0010";
        cLanguageQuestion[12].question = """
                在函数的调用过程中，若函数A调用了函数B，而函数B又调用了函数A，则如下说法正确的是（   ）
                A、这种调用会造成循环死锁，从而无法结束。
                B、这是函数的间接递归调用，可对函数A或B构造回归条件以在适当的时候返回。
                C、这种写法会造成编译通不过。
                D、以上说法都不对。
                """;
        cLanguageQuestion[12].answer = "B";
        cLanguageQuestion[13].question = """
                double func(int x,int y)
                {
                    if(x>y) return x;
                    else return y;
                }
                int main()
                {
                   double a=2.3,b=5.5;
                   printf("max=%f",func(a,b));
                   return 0;
                }
                                
                关于这个程序，函数在定义时指定返回值的类型为int型，但是return后面跟的表达式类型为double型，以下说法正确的是（    ）
                A、return所跟表达式值的类型会自动转换成返回值的定义类型
                B、编译通不过
                C、返回值以return后的那个表达式的实际类型为准
                D、这样做会默认返回一个空值
                """;
        cLanguageQuestion[13].answer = "A";
        cLanguageQuestion[14].question = """
                #include <stdio.h>
                int func(float x,float y)
                {
                  printf("%d\\n",x);
                }
                void main()
                {
                   float a=2,b=5;
                   printf("max=%d",func(a,b));
                }
                在定义函数时指定的返回值类型不是void，但是忘记用return返回一个值，这时会发生什么事？
                A、形参能接收到正确的值，函数调用者会得到一个不确定的值
                B、形参和函数的调用者都会得到一个不确定的值
                C、编译通不过，无法运行
                D、以上说法都不对
                """;
        cLanguageQuestion[14].answer = "B";
        cLanguageQuestion[15].question = """
                int a=1,b=1,c=1;
                printf("%d,%d,%d",-a++,b,(c=b=1.6*3));
                本程序会输出______________
                """;
        cLanguageQuestion[15].answer = "-1,4,4";
        cLanguageQuestion[16].question = """
                若把数组名作为函数调用的实参，则形参能获得的信息为（    ）
                A、只是数组所在的内存区域的第一个字节的地址
                B、数组的首地址以及数组的维数
                C、数组的首地址以及元素的个数
                D、数组的首地址以及数组所占的字节数
                """;
        cLanguageQuestion[16].answer = "A";
        cLanguageQuestion[17].question = """
                short a[5]={};
                关于这条语句以下说法正确的是（   ）
                A、表示给这个数组申请5个字节的内存
                B、表示这个数组总共有a[0]~a[5]这些元素
                C、这条语句执行之后，数组的元素是随机的值
                D、这条语句会对数组进行初始化，没有指定初始化元素的值，所有元素都初始化为0
                """;
        cLanguageQuestion[17].answer = "D";
        cLanguageQuestion[18].question = """
                #inlcude <studio.h>
                int mian（）
                {
                    print('Hello world!');
                    retunr 0;
                }
                如果想打印Hello World!
                以下程序有几个错误
                """;
        cLanguageQuestion[18].answer = "7";
        cLanguageQuestion[19].question = """
                #include <stdio.h>
                void main()
                {
                  int a[10],i=0;
                  while(i<10)
                       scanf("%d",___(1)_____);
                }
                填空（1）处，完成给数组各元素输入数字的功能，以下选项中（   ）办不到这事。
                A、&a[i++]         B、a+i++    C、a++    D、&a[0]+i++
                """;
        cLanguageQuestion[19].answer = "C";
//除19题外，其他题目来自通信学院C语言辅导网https://www.cmanfen.net/C_CIEI/#
    }

    public static int right = 0;

    public void printQuestion() throws CantDoCLanguage, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 20; i++) {
            System.out.println(cLanguageQuestion[i].question);
            String myAnswer = scanner.next();
            if (myAnswer.equals(cLanguageQuestion[i].answer)) {
                right++;
                System.out.println("你做对了" + right + "道题");
                Thread.sleep(1000);
                System.out.println("Good");
                Thread.sleep(3000);
            } else {
                try {
                    System.out.println("你做对了" + right + "道题");
                    Thread.sleep(1000);
                    throw new CantDoCLanguage();
                } catch(CantDoCLanguage e){
                    System.out.println("Wrong!");
                    Thread.sleep(3000);
                }

            }

            Thread.sleep(1000);
        }
        scanner.close();
    }
}
