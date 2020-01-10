package frc.robot;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DigitalOutput;
import edu.wpi.first.wpilibj.DigitalSource;
import edu.wpi.first.wpilibj.PIDSourceType;

public class Ultrasonic{
    protected final edu.wpi.first.wpilibj.Ultrasonic ultra;
    public Ultrasonic(DigitalSource sourceA,DigitalSource sourceB){
        ultra = new edu.wpi.first.wpilibj.Ultrasonic((DigitalOutput)sourceA,(DigitalInput)sourceB,edu.wpi.first.wpilibj.Ultrasonic.Unit.kMillimeters);
    }
    /**
     * Get the actual range in milimeters
     * @return
     */
    public double getRangeMM(){
        return ultra.getRangeMM();
    }
    public PIDSourceType getPIDSourceType(){
        return ultra.getPIDSourceType();
    }
}