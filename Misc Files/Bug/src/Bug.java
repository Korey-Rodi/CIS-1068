public class Bug {
    String name;
    int position;
    boolean facingRight;


    public Bug(String n){
        name = n;
        position = 0;
        facingRight = true;

    }
    public int getPosition() {
        return position;
    }

    public void move() {
        if (facingRight) {
            position += 1;
        } else {
            position -= 1;
        }
    }

    public String toString() {
        String s = name;
        if (facingRight) {
            s += " [R] ";
        } else {
            s += " [L] ";
        }
        return s + "pos: " + position;
    }

    public void turn() {
        if (facingRight) {
            facingRight = false;
        } else {
                facingRight = true;
            }
        // OR... facingRight = !facingRight;
        }

    }

