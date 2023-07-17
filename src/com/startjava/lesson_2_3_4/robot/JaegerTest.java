package com.startjava.lesson_2_3_4.robot;

public class JaegerTest {

    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger();
        jaeger1.setModelName("Striker Eureka");
        jaeger1.setMark("Mark-5");
        jaeger1.setOrigin("Australia");
        jaeger1.setHeight(76.2);
        jaeger1.setWeight(1.850);
        jaeger1.setStrength(10);
        jaeger1.setArmor(9);
        jaeger1.setState(true);
        jaeger1.setWeapon("Assault Mount 3.25 \"Sting-Blades\"");

        System.out.println("Jaeger1:\nmodel name: " + jaeger1.getModelName() + "\n"
                + "mark: " + jaeger1.getMark() + "\norigin: " + jaeger1.getOrigin() + "\n"
                + "height: " + jaeger1.getHeight() + "\nweight: " + jaeger1.getWeight() + "\n"
                + "strength: " + jaeger1.getStrength() + "\narmor: " + jaeger1.getArmor() + "\n"
                + "drift: " + jaeger1.drift(jaeger1.getState()) + "\n"
                + jaeger1.useWeapon(jaeger1.getWeapon()) + "\n");
                
        Jaeger jaeger2 = new Jaeger("Crimson Typhoon", "Mark-4", "China", 76.2, 1.722, 8, 6,
                false, "IB22 Plasmacaster");

        System.out.println("Jaeger2:\nmodel name: " + jaeger2.getModelName() + "\n"
                + "mark: " + jaeger2.getMark() + "\norigin: " + jaeger2.getOrigin() + "\n"
                + "height: " + jaeger2.getHeight() + "\nweight: " + jaeger2.getWeight() + "\n"
                + "strength: " + jaeger2.getStrength() + "\narmor: " + jaeger2.getArmor() + "\n"
                + "drift: " + jaeger2.drift(jaeger2.getState()) + "\n"
                + jaeger2.useWeapon(jaeger2.getWeapon()));
    }
}