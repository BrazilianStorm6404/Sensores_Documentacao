package frc.robot;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.SPI.Port;

public class Gyro_ADXRS450{
    /**
     * Gyroscope object
     */
    protected final ADXRS450_Gyro gyro;
    /**
     * Create a new gyro object
     * <p> Use this when the Gyro is in the Standard SPI.
     */
    public Gyro_ADXRS450(){
        gyro = new ADXRS450_Gyro();
    }
    /**
     * Create a new gyro object
     * <p> Use this when the Gyro isn't in the Standard SPI
     * @param port Define which SPI is the Gyro
     */
    public Gyro_ADXRS450(Port port){
        gyro = new ADXRS450_Gyro(port);
    }
    /**
     * Get the angle from gyroscope
     * @return Return the actual angle from the gyroscope
     */
    public double getAngle(){
        return gyro.getAngle();
    }
    /**
     * Get the type of PID are the Gyro;
     * @return Return the PID type from gyro;
     */
    public PIDSourceType getPIDSourceType(){
        return gyro.getPIDSourceType();
    }
    /**
     * Define the actual position to zero.
     */
    public void reset(){
        gyro.reset();
    }
}