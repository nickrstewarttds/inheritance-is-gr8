package com.qa.main;

public class Runner {

    public static void main(String[] args) {

        Animal a = new Animal();
        System.out.println(a);
        // name is grabbed from Animal()

        Animal b = new Animal("Geoff", 5, "cheese", "odd");
        System.out.println(b);
        // all names replaced by Animal(<4 params>)

        Animal c = new Animal(17, "people", "like a fish");
        System.out.println(c);
        // name = null
        // everything else replaced by Animal(<3 params>)

        Bird boid = new Bird();
        System.out.println(boid.getName());
        System.out.println(boid.speak());
        System.out.println(boid);

        Fish fishy = new Fish();
        System.out.println(fishy.getName());
        System.out.println(fishy.speak());

        Penguin pingu = new Penguin();
        System.out.println(pingu.speak());
        System.out.println(pingu.swim());
//        System.out.println(pingu.fly()); // won't work

        FlyingFish larry = new FlyingFish();
        System.out.println(larry.swim());
        System.out.println(larry.fly());
    }

}
