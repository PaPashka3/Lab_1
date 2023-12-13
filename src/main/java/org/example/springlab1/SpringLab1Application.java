package org.example.springlab1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringLab1Application {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Street street = context.getBean("street", Street.class);
        System.out.println(street.getName());

        Person person = street.getHouse().getApartment().getResident();
        System.out.printf("Person's name is %s!", person.getName());

        context.close();
    }

}
