package frc.robot;

import com.kauailabs.navx.frc.AHRS;

import edu.wpi.first.wpilibj.SerialPort;

public class NavX{
    protected final AHRS navX;
    /**
     * This constructor must be used only if the NavX isn't in the MXP port.
     * @param port define which port the NavX is using.
     */
    public NavX(SerialPort.Port port){
        navX = new AHRS(port);
    }
    /**
     * This constructor must be used when NavX is in the MXP port.
     */
    public NavX(){
        navX = new AHRS();
    }
    public float getAngleX(){
        return navX.getPitch();
    }
    public float getAngleZ(){
        return navX.getYaw();
    }
    public float getAngleY(){
        return navX.getRoll();
    }
    public boolean isMoving(){
        return navX.isMoving();
    }
    public boolean isRotating(){
        return navX.isRotating();
    }
    public float getAccelX(){
        return navX.getWorldLinearAccelX();
    }
    public float getAccelY(){
        return navX.getWorldLinearAccelY();
    }
    public float getAccelZ(){
        return navX.getWorldLinearAccelZ();
    }
    /**
     * <b> EXPERIMENTAL </b>
     * <p> This method is experimental, so use on your own risk.
     */
    public float getVelocityX(){
        return navX.getVelocityX();
    }
    /**
     * <b> EXPERIMENTAL </b>
     * <p> This method is experimental, so use on your own risk.
     */
    public float getVelocityY(){
        return navX.getVelocityY();
    }
    /**
     * <b> EXPERIMENTAL </b>
     * <p> This method is experimental, so use on your own risk.
     */
    public float getVelocityZ(){
        return navX.getVelocityZ();
    }
}