package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;
@TeleOp(group = "Testing")
public class ServoTest extends LinearOpMode{
    public void runOpMode() throws InterruptedException{
        Servo servo = hardwareMap.get(Servo.class, "servo");
        ElapsedTime timer = new ElapsedTime();
        servo.setPosition(0);
        servo.setDirection(Servo.Direction.FORWARD);
        waitForStart();
        if (isStopRequested()) {return;}
        while(opModeIsActive()){
            if (timer.milliseconds() > 250){
                if(gamepad1.dpad_up){
                    servo.setPosition(servo.getPosition()+0.1);
                }
                else if 
            }
        }
    }
}
