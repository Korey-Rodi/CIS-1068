public class BugMain {
    public static void main(String[] args) {
        Bug h = new Bug("Hopper");

        System.out.println(h);
        h.turn();
        System.out.println("Hopper is at positon " + h.getPosition());
        h.move();
        System.out.println("Hopper is at positon " + h.getPosition());

    }
    
}
