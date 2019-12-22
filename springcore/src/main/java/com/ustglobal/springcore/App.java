package com.ustglobal.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ustglobal.springcore.di.Animal;
import com.ustglobal.springcore.di.Hello;
import com.ustglobal.springcore.di.Pet;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        Hello hello=context.getBean(Hello.class);
   System.out.println(hello.getMsg());
   System.out.println(hello.getMap());
   System.out.println("hello world!..");
   
   Hello hello2=context.getBean(Hello.class);
   System.out.println(hello);
   System.out.println(hello2);

   
   Animal animal=context.getBean(Animal.class);
   animal.makeSound();
   
   Animal animal2=(Animal)context.getBean("dog");
   animal2.makeSound();
   System.out.println("=================");
   
   Pet pt=context.getBean(Pet.class);
   System.out.println(pt.getName());
   pt.getAnimal().makeSound();
    }
}
