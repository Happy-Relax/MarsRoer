package rover;

public enum Direction {
    N(0, 1),
    E(1, 0),
    S(0, -1),
    W(-1, 0);

    private final int x;
    private final int y;

    Direction(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Direction left() {
        return values()[(ordinal() + 3) % 4];
    }

    Direction right() {
        return values()[(ordinal() + 1) % 4];
    }

    Position moveDirection() {
        return new Position(x, y);
    }
}
