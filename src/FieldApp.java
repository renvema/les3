public class FieldApp {

    public static void main(String[] args) {
        Robot robot = new Robot(1, 1, Direction.DOWN);
        FieldApp field = new FieldApp();
        System.out.println(robot.getX() + " " + robot.getY() + " " + robot.getDirection());
        field.moveRobot(robot, 3, 2);
        System.out.println(robot.getX() + " " + robot.getY() + " " + robot.getDirection());
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() < toX) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            while (robot.getX() < toX) {
                robot.stepForward();
            }
        } else {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
            while (robot.getX() > toX) {
                robot.stepForward();
            }
        }

        if (toY > robot.getY()) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
            while (robot.getY() < toY) {
                robot.stepForward();
            }

        } else {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnRight();
            }
            while (robot.getY() > toY) {
                robot.stepForward();
            }
        }
    }

    private static class Robot {
        int x = 0;
        int y = 0;
        Direction direction = Direction.UP;

        public Robot(int x, int y, Direction direction) {
            this.x = x;
            this.y = y;
            this.direction = direction;
        }

        public Direction getDirection() {
            return direction;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public void turnLeft() {
            if (direction == Direction.DOWN) {
                this.direction = Direction.RIGHT;
                return;
            }

            if (direction == Direction.UP) {
                this.direction = Direction.LEFT;
                return;
            }

            if (direction == Direction.LEFT) {
                this.direction = Direction.DOWN;
                return;
            }

            if (direction == Direction.RIGHT) {
                this.direction = Direction.UP;
                return;
            }
        }

        public void turnRight() {
            if (this.direction == Direction.DOWN) {
                this.direction = Direction.LEFT;
                return;
            }

            if (this.direction == Direction.UP) {
                this.direction = Direction.RIGHT;
                return;
            }

            if (this.direction == Direction.LEFT) {
                this.direction = Direction.UP;
                return;
            }

            if (this.direction == Direction.RIGHT) {
                this.direction = Direction.DOWN;
                return;
            }
        }

        public void stepForward() {
            if (direction == Direction.DOWN) {
                this.y--;
            }
            if (direction == Direction.UP) {
                this.y++;
            }
            if (direction == Direction.LEFT) {
                this.x--;
            }
            if (direction == Direction.RIGHT) {
                this.x++;
            }
        }
    }

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }
}
