public class Robot {
    public static void main(String[] args)
    {
    
    RobotArm lx = new Lexmar234();
    RobotArm gr = new GR56A();
    //Do something with the Lexmar robot
    lx.moveDown(3, 27.87);
    lx.twistRight(22.0);
    //Do something with the General Robotics machine
    gr.moveUp(22.2, -34.0);
    gr.twistLeft(18);
    }
}
