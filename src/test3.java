/**
 * Project name(项目名称)：static关键字 static-keyword
 * Package(包名): PACKAGE_NAME
 * Class(类名): test3
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/6
 * Time(创建时间)： 13:13
 * Version(版本): 1.0
 * Description(描述)： 静态代码块
 * 静态代码块指 Java 类中的 static{ } 代码块，主要用于初始化类，为类的静态变量赋初始值，提升程序性能。
 * 静态代码块的特点如下：
 * 静态代码块类似于一个方法，但它不可以存在于任何方法体中。
 * 静态代码块可以置于类中的任何地方，类中可以有多个静态初始化块。
 * Java 虚拟机在加载类时执行静态代码块，所以很多时候会将一些只需要进行一次的初始化操作都放在 static 代码块中进行。
 * 如果类中包含多个静态代码块，则 Java 虚拟机将按它们在类中出现的顺序依次执行它们，每个静态代码块只会被执行一次。
 * 静态代码块与静态方法一样，不能直接访问类的实例变量和实例方法，而需要通过类的实例对象来访问。
 */

public class test3
{
    public static int count = 0;

    {
        count++;
        System.out.println("非静态代码块 count=" + count);
    }

    static
    {
        count++;
        System.out.println("静态代码块1 count=" + count);
    }

    static
    {
        count++;
        System.out.println("静态代码块2 count=" + count);
    }

    public static void main(String[] args)
    {
        //------------------------------------------------------
        long startTime = System.nanoTime();   //获取开始时间
        //------------------------------------------------------
        System.out.println("\033[32m" + "第一" + "\033[0m");
        test3 t = new test3();
        System.out.println("\033[32m" + "第二" + "\033[0m");
        test3 t2 = new test3();
        //------------------------------------------------------
        long endTime = System.nanoTime(); //获取结束时间
        if ((endTime - startTime) < 1000000)
        {
            double final_runtime;
            final_runtime = (endTime - startTime);
            final_runtime = final_runtime / 1000;
            System.out.println("算法运行时间： " + final_runtime + "微秒");
        }
        else if ((endTime - startTime) >= 1000000 && (endTime - startTime) < 10000000000L)
        {
            double final_runtime;
            final_runtime = (endTime - startTime) / 1000;
            final_runtime = final_runtime / 1000;
            System.out.println("算法运行时间： " + final_runtime + "毫秒");
        }
        else
        {
            double final_runtime;
            final_runtime = (endTime - startTime) / 10000;
            final_runtime = final_runtime / 100000;
            System.out.println("算法运行时间： " + final_runtime + "秒");
        }
        //------------------------------------------------------
    }
}
