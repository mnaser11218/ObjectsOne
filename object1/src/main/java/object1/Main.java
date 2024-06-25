package object1;

import org.w3c.dom.ls.LSOutput;

import java.util.logging.Logger;

public class Main {

    public static void main(String... args) {
        Logger logger=Logger.getLogger(Main.class.getName());
        logger.info("This is a module-using Hello World!");

        Person person = new Person("name testing", 4, 8);
        //System.out.println(person.getAge());



        Person[] peopleArray = new Person[10];
        peopleArray[0] = new Person("testing people array 0", 5,9);
        peopleArray[1] = new Person("people array number two", 8, 99);

        System.out.println(peopleArray[0].getName());
        System.out.println(peopleArray[1].getHeight());


        Person firstPerson = peopleArray[0];
        System.out.println( "printing firstPerson variable: " + firstPerson.getName());

        Car[]cars= new Car[5];

        cars[0] = new Car("toyota", "camry", 2020, 100000);
        Car firstCar = cars[0];
        System.out.println("the first car of the list is: " + firstCar.getModel());


    }




   // person.getName();




}
