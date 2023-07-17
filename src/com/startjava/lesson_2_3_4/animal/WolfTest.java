package com.startjava.lesson_2_3_4.animal;

public class WolfTest {
    
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setName("February");
        wolf.setSex('m');
        wolf.setWeight(25);
        wolf.setAge(9);
        wolf.setColor("Grey");

        System.out.println("Wolf's name: " + wolf.getName() + "\nsex: " + wolf.getSex()
                + "\nweight: " + wolf.getWeight() + "\nage: " + wolf.getAge() 
                + "\ncolor: " + wolf.getColor() + "\n");

        wolf.move();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}