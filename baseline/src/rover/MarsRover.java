package rover;

public class MarsRover {

    private Position position;
    private Direction direction;

    public MarsRover(int startingX, int startingY, String direction) {
        this.position = new Position(startingX, startingY);
        this.direction = Direction.valueOf(direction);
    }

    public String run(String input) {
        String[] commands = InputParser.convertInputIntoCommands(input);

        for (String command : commands) {
            switch (command) {
                case "M":
                    move();
                    break;
                case "R":
                    turnRight();
                    break;
                case "L":
                    turnLeft();
                    break;
            }
        }

        return asString();
    }

    private void move() {
        position = position.change(direction.moveDirection());
    }

    private void turnLeft() {
        direction = direction.left();
    }

    private void turnRight() {
        direction = direction.right();
    }

    private String asString() {
        return position.asString() + " " + direction.toString();
    }

}
