/**
 * Game21
 */
public class Game21 {
    int x;
    int y;
    int width;
    int height;

    public Game21(int v, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void moveLeft() {
        if (x > 0) {
          x--;  
          detectCollision();
        }
    }

    public void moveRight() {
        if (x < width - 1) {
            x++;
            detectCollision();
        }
    }

    public void moveUp() {
        if (y > 0) {
            y--;
            detectCollision();
        }
    }

    public void moveDown() {
        if (y < height -1) {
            y++;
            detectCollision();
        }
    }

    public void printPosition() {
        System.out.println("Posisi Dragon: (" + x + ", " + y + ")");
    }

    public void detectCollision() {
       if (x == 0 || x == width - 1 || y == 0 || y == height - 1) {
            System.out.println("Game Over");
        }  
    }
}