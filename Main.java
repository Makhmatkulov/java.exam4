import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Electronics electronics = new Electronics();
        Computers computers = new Computers();
        Sounds sounds = new Sounds();
        PC pc = new PC();
        Laptop laptop = new Laptop();
        Subwoofer subwoofer = new Subwoofer();
        Loudspeaker loudspeaker = new Loudspeaker();

        System.out.println(electronics.description);
        System.out.println();
        System.out.println(computers.description);
        System.out.println();
        System.out.println(sounds.description);
        System.out.println();
        System.out.println(pc.description);
        System.out.println();
        System.out.println(laptop.description);
        System.out.println();
        System.out.println(subwoofer.description);
        System.out.println();
        System.out.println(loudspeaker.description);
        System.out.println();


    }
}
