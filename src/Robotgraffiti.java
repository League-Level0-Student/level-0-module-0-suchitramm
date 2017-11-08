import org.jointheleague.graphical.robot.Robot;

public class Robotgraffiti {
public static void main(String[] args) {
Robot r2d2 =new Robot("batman");
r2d2.turn(90);
r2d2.setSpeed(990);
r2d2.penDown();
r2d2.move(100);
for (int i = 0; i < 3; i++) {
r2d2.turn(60);
r2d2.move(100);
;
}r2d2.turn(90);
r2d2.move(100);

}
}
