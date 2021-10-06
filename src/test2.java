/**
 * Project name(项目名称)：static关键字
 * Package(包名): PACKAGE_NAME
 * Class(类名): test2
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/6
 * Time(创建时间)： 13:07
 * Version(版本): 1.0
 * Description(描述)： 静态方法
 * 与成员变量类似，成员方法也可以分为以下两种：
 * 静态方法（或称为类方法），指被 static 修饰的成员方法。
 * 实例方法，指没有被 static 修饰的成员方法。
 * 静态方法与实例方法的区别如下：
 * 静态方法不需要通过它所属的类的任何实例就可以被调用，因此在静态方法中不能使用 this 关键字，也不能直接访问所属类的实例变量和实例方法，
 * 但是可以直接访问所属类的静态变量和静态方法。另外，和 this 关键字一样，super 关键字也与类的特定实例相关，
 * 所以在静态方法中也不能使用 super 关键字。
 * 在实例方法中可以直接访问所属类的静态变量、静态方法、实例变量和实例方法。
 */

public class test2
{
    public static int count = 1;    // 定义静态变量count

    public int method1()
    {
        // 实例方法method1
        count++;    // 访问静态变量count并赋值
        System.out.println("在静态方法 method1()中的 count=" + count);    // 打印count
        return count;
    }

    public static int method2()
    {
        // 静态方法method2
        count += count;    // 访问静态变量count并赋值
        System.out.println("在静态方法 method2()中的 count=" + count);    // 打印count
        return count;
    }

    public static void PrintCount()
    {
        // 静态方法PrintCount
        count += 2;
        System.out.println("在静态方法 PrintCount()中的 count=" + count);    // 打印count
    }

    public static void main(String[] args)
    {
        //------------------------------------------------------
        long startTime = System.nanoTime();   //获取开始时间
        //------------------------------------------------------
        test2 sft = new test2();
        // 通过实例对象调用实例方法
        System.out.println("method1() 方法返回值 intro1=" + sft.method1());
        // 直接调用静态方法
        System.out.println("method2() 方法返回值 intro1=" + method2());
        // 通过类名调用静态方法，打印 count
        test2.PrintCount();
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
