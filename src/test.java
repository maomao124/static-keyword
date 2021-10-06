/**
 * Project name(项目名称)：static关键字
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/6
 * Time(创建时间)： 13:02
 * Version(版本): 1.0
 * Description(描述)：
 * 在类中，使用 static 修饰符修饰的属性（成员变量）称为静态变量，也可以称为类变量，常量称为静态常量，方法称为静态方法或类方法，
 * 它们统称为静态成员，归整个类所有。
 * 静态成员不依赖于类的特定实例，被类的所有实例共享，就是说 static 修饰的方法或者变量不需要依赖于对象来进行访问，
 * 只要这个类被加载，Java 虚拟机就可以根据类名找到它们。
 * 调用静态成员的语法形式如下：
 * 类名.静态成员
 * 注意：
 * static 修饰的成员变量和方法，从属于类。
 * 普通变量和方法从属于对象。
 * 静态方法不能调用非静态成员，编译会报错。
 * 静态变量
 * 类的成员变量可以分为以下两种：
 * 静态变量（或称为类变量），指被 static 修饰的成员变量。
 * 实例变量，指没有被 static 修饰的成员变量。
 * <p>
 * 静态变量与实例变量的区别如下：
 * <p>
 * 1）静态变量
 * 运行时，Java 虚拟机只为静态变量分配一次内存，在加载类的过程中完成静态变量的内存分配。
 * 在类的内部，可以在任何方法内直接访问静态变量。
 * 在其他类中，可以通过类名访问该类中的静态变量。
 * <p>
 * 2）实例变量
 * 每创建一个实例，Java 虚拟机就会为实例变量分配一次内存。
 * 在类的内部，可以在非静态方法中直接访问实例变量。
 * 在本类的静态方法或其他类中则需要通过类的实例对象进行访问。
 * <p>
 * 静态变量在类中的作用如下：
 * 静态变量可以被类的所有实例共享，因此静态变量可以作为实例之间的共享数据，增加实例之间的交互性。
 * 如果类的所有实例都包含一个相同的常量属性，则可以把这个属性定义为静态常量类型，从而节省内存空间。例如，在类中定义一个静态常量 PI。
 */

public class test
{
    public static String str1 = "Hello";

    public static void main(String[] args)
    {
        //------------------------------------------------------
        long startTime = System.nanoTime();   //获取开始时间
        //------------------------------------------------------
        String str2 = "World!";
        // 直接访问str1
        String accessVar1 = str1 + str2;
        System.out.println("第 1 次访问静态变量，结果为：" + accessVar1);
        // 通过类名访问str1
        String accessVar2 = test.str1 + str2;
        System.out.println("第 2 次访问静态变量，结果为：" + accessVar2);
        // 通过对象svt1访问str1
        test svt1 = new test();
        svt1.str1 = svt1.str1 + str2;
        String accessVar3 = svt1.str1;
        System.out.println("第3次访向静态变量，结果为：" + accessVar3);
        // 通过对象svt2访问str1
        test svt2 = new test();
        String accessVar4 = svt2.str1 + str2;
        System.out.println("第4次访问静态变量，结果为：" + accessVar4);
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
