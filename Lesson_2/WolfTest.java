public class WolfTest {
    
    public static void main(String[] args){
        Wolf wolf = new Wolf();
        wolf.name = "February";
        wolf.sex = 'f';
        wolf.weight = 25;
        wolf.age = 6;
        wolf.color = "Grey";

        System.out.println("Wolf's name: " + wolf.name + ", sex: " + wolf.sex
                + ", weight: " + wolf.weight + ", age: " + wolf.age + ", color: " + wolf.color);

        wolf.move();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}