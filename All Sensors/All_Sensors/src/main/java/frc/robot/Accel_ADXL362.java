package frc.robot;

import edu.wpi.first.wpilibj.ADXL362;
import edu.wpi.first.wpilibj.SPI.Port;
import edu.wpi.first.wpilibj.interfaces.Accelerometer.Range;

public class Accel_ADXL362{
    /**
     * Object to use the accelerometer ADXL362
     */
    protected final ADXL362 accel;
    /**
     * Don't use this unless you know what you are making.
     * @param range Defines the Range of your acceleration. With less range better precision, 
     * Accel & Gyro support enum values of 2G, 4G and 8G.
     */
    protected Accel_ADXL362(Range range){
        accel = new ADXL362(range);
    }
    /**
     * Create a new accelerometer object.
     * <p> Use this when you know which port is the Accel and when there aren`t the Accel & Gyro on the SPI.
     * @param port Define which SPI port is your accelerometer.
     * @param range Defines the Range of your acceleration. With less range better precision.
     */
    public Accel_ADXL362(Port port,Range range){
        accel = new ADXL362(port, range);
    }
    /**
     * Get one axis acceleration.
     * @param axe Define which axis will get the acceleration.
     * @return Return the numerical value of the acceleration.
     */
    public double getAccelerationByAxis(ADXL362.Axes axe){
        return accel.getAcceleration(axe);
    }
    /**
     * Get all axis from the acceleration
     * @return Return all the axis form the acceleration.
     */
    public ADXL362.AllAxes getAllAxis(){
        return accel.getAccelerations();
    }
}