package com.atguigu.spring.beans;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

		
	public static void main(String[] args) {
	/*
		//创建HelloWorld的一个对象
		HelloWorld helloWorld = new HelloWorld();
		//为name属性赋值
		helloWorld.setName("atguigu");
		*/
		//1.创建Spring的IOC容器对象
		//ApplicationContext 代表IOC容器
		//ClassPathXmlApplicationContext:是ApplicationContext 接口的实现类 该实现类从类路径下来加载配置文件
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//2.从IOC容器中获取Bean的实例
		
		//利用Id定位到IOC容器中的Bean
		HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld2");
	
		//利用类型返回IOC容器中的Bean 但要求IOC容器中必须只能有一个该类型的Bean
	//	HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
		System.out.println(helloWorld);
	
		//3.调用hello 方法
	//	helloWorld.hello();
		
		Car car = (Car) ctx.getBean("car");
		System.out.println(car);
		
		 car = (Car) ctx.getBean("car2");
		System.out.println(car);
		
		Person person =  (Person) ctx.getBean("person");
		System.out.println(person);
		
		
		
		
		
	}
}
