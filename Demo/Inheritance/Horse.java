package Inheritance;

//Instance methods are preferred over interface default methods.

//Consider the following classes and interfaces:

public class Horse {
    public String identifyMyself() {
        return "I am a horse.";
    }
}
interface Flyer {
    default public String identifyMyself() {
        return "I am able to fly.";
    }
}
interface Mythical {
    default public String identifyMyself() {
        return "I am a mythical creature.";
    }
}
