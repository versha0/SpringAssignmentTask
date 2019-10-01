package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
public class Main {
    public static void main( String[] args )
    {
        //USING XML
        //XmlBeanFactory xmlBeanFactory= new XmlBeanFactory ( new ClassPathResource("beans.xml"));
        //Movie movieFirst= (Movie)xmlBeanFactory.getBean("movie1", Movie.class);


            AbstractApplicationContext  context = new ClassPathXmlApplicationContext("beans.xml");
            Movie appcontext= (Movie)context.getBean("Movie");
            appcontext.print();
        //USING APPLICATION CONTEXT
        //ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        //Movie movie=(Movie)applicationContext.getBean("movie3", Movie.class);
//        Movie movie1=(Movie)applicationContext.getBean("movie2", Movie.class);
//        Movie movie3=(Movie)applicationContext.getBean("movie3", Movie.class);
//        Movie moviesame=(Movie)applicationContext.getBean("movie4", Movie.class);
//        Movie movie4=(Movie)applicationContext.getBean("movie1", Movie.class);
//        Movie movie5=(Movie)applicationContext.getBean("movie2", Movie.class);
        //FOR THE PROTOTYPE
//        if(movie==movie4){
//           System.out.println(true);
//        } else{
//           System.out.println(false);
//        }
//        // FOR THE SINGLETON
//        if(movie1==movie5){
//            System.out.println(true);
//       } else{
//           System.out.println(false);
//        }


        //to get the Movie bean by its two different name.

        //USING BEAN DEFINITION
        //BeanDefinitionRegistry beanDefinitionRegistry = new DefaultListableBeanFactory();
        //XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanDefinitionRegistry);
        //reader.loadBeanDefinitions(new ClassPathResource("beans.xml"));
        //Movie movieReg= (Movie) ((DefaultListableBeanFactory)(beanDefinitionRegistry)).getBean("movie3",Movie.class);

        //PRINTING ALL THE ACTORS
        //System.out.println(movieReg);
        //System.out.println(movieFirst.getActor());
        //System.out.println(movie.getActor());
//        System.out.println(movie1.getActor());

        //THEY HAVE SAME SAME HENCE WILL PRINT SAME VALUE
        //System.out.println(movie3.getActor());
        //System.out.println(moviesame.getActor());



    }
}
