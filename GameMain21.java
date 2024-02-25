/**
 * GameMain21
 */
public class GameMain21 {

    public static void main(String[] args) {
        Game21 game = new Game21(13, 5, 10, 10);
        game.moveUp();
        game.moveLeft();
        game.moveRight();
        game.moveDown();

        game.printPosition();
    }
}