##final

**1.属性**

声明数据为常亮，可以使编译时常量，也可以是运行时被初始化后不能被修改的常量

- 基本类型，final数量值不可变
- 应用类型，final引用不变，不能引用其他对象

**2.方法**

声明方法不能被子类覆盖（overwrite）

**3.类**

类不能被继承

##static

**1.静态变量**

- 静态变量：类中所有实例共享，可以直接通过
- 实例变量：

**2.静态方法**



**3.静态代码块**



**4.静态内部类**

非静态内部内依赖外部类的实例创建，而内部类不需要

```
public class MyInnerClass {
	class InnerClass{
		
	}
	static class StaticInnerCLass{
		
	}
	public static void main(String[] args) {
		MyInnerClass myInnerClass = new MyInnerClass();
		InnerClass innerClass = myInnerClass.new InnerClass();//非静态内部类
		StaticInnerCLass staticInnerCLass = new StaticInnerCLass();//静态内部类
	}
}
```

**5.静态导包**



**6.初始化顺序**



## 七、反射



