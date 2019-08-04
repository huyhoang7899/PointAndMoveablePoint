public class MoveablePointTest {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint();
        System.out.println(moveablePoint.toString());
        moveablePoint = new MoveablePoint(5, 6);
        System.out.println(moveablePoint.toString());
        moveablePoint = new MoveablePoint(1, 5, 9, 8);
        System.out.println(moveablePoint.toString());
        moveablePoint = moveablePoint.move();
        System.out.println(moveablePoint.toString());
    }
}
