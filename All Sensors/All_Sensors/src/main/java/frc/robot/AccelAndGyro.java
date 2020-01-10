package frc.robot;

import edu.wpi.first.wpilibj.ADXL362;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.interfaces.Accelerometer.Range;

public class AccelAndGyro extends Accel_ADXL362{
    /**
     * Gyroscope object
     */
    protected Gyro_ADXRS450 gyro;
    /**
     * Create an object of the Accel&Gyro
     * @param range Defines the Range of your acceleration. With less range better precision, 
     * Accel & Gyro support enum values of 2G, 4G and 8G.
     */
    public AccelAndGyro(Range range){
        super(range);
        gyro = new Gyro_ADXRS450();
    }
    /**
     * Define the actual position to zero.
     */
    public void resetGyro(){
        gyro.reset();
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
    public PIDSourceType getPIDGyroType(){
        return gyro.getPIDSourceType();
    }
    /**
     * Get one axis acceleration.
     * @param axe Define which axis will get the acceleration.
     * @return Return the numerical value of the acceleration.
     */
    public double getAccelerationByAxis(ADXL362.Axes axe){
        return super.accel.getAcceleration(axe);
    }
    /**
     * Get all axis from the acceleration
     * @return Return all the axis form the acceleration.
     */
    public ADXL362.AllAxes getAllAxis(){
        return accel.getAccelerations();
    }
}