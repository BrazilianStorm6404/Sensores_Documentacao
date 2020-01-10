package frc.robot;

import edu.wpi.first.wpilibj.DigitalSource;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;

public class Encoder_AMT103 {
    protected final Encoder encoder;
    /***************************************************************************************************
     * Create a Encoder object.                                                                        
     * <p> If the encoder is without the Index channel, then use another constructor.                  *
     * @param A The first channel.                                                                     *
     * @param B The second channel.                                                                    *
     * @param sense direction of the encoder, defalt is true, reverse is false.                        *
     * @param I The channel for the Index.                                                             *
     * @param dpp Define the distance per pulse measured by the encoder                                *
     ***************************************************************************************************/
    public Encoder_AMT103(DigitalSource A,DigitalSource B,boolean sense ,DigitalSource I,double dpp){
        encoder = new Encoder(A,B,I,sense);
    }
    /***************************************************************************************************
     * Create a Encoder object.                                                                        
     * <p> If the encoder is without the Index channel, then use another constructor.                 
     * <p> Use this constructor make sure to set the distance per pulse to take corectly.              *
     * @param A The first channel.                                                                     *
     * @param B The second channel.                                                                    *
     * @param sense direction of the encoder, defalt is true, reverse is false.                        *
     * @param I The channel for the Index.                                                             *
     ***************************************************************************************************/
    public Encoder_AMT103(DigitalSource A,DigitalSource B,boolean sense,DigitalSource I){
        encoder = new Encoder(A,B,I,sense);
    }
    /**
     * Create a Encoder object.
     * <p> If the encoder are with the Index channel, then use annoter constructor.
     * @param A The first channel.
     * @param B The second channel.
     * @param sense direction of the encoder, defalt is true, reverse is false. 
     * @param dpp Define the distance per pulse measured by the encoder
     */
    public Encoder_AMT103(DigitalSource A,DigitalSource B, boolean sense, double dpp){
        encoder = new Encoder(A,B,sense,EncodingType.k4X);
    }
    /**
     * Create a Encoder object.
     * <p> If the encoder are with the Index channel, then use annoter constructor.
     * <p> Use this constructor make sure to set the distance per pulse to take corectly.
     * @param A The first channel.
     * @param B The second channel.
     * @param sense direction of the encoder, defalt is true, reverse is false. 
     */
    public Encoder_AMT103(DigitalSource A,DigitalSource B, boolean sense){
        encoder = new Encoder(A,B,sense,EncodingType.k4X);
    }
    /**
     * Return the absolute distance measured by the encoder
     * @return return a double with the distance
     */
    public double getDistance(){
        return encoder.getDistance();
    }
    /**
     * Get the number counted of pulses.
     * @return the integer counts of pulses measured by the encoder
     */
    public int getRawPulse(){
        return encoder.getRaw();
    }
    /**
     * Get the number counted of pulses scaled by the precision.
     * @return The raw pulse scaled by the precision.
     */
    public int getScaledPulse(){
        return encoder.get();
    }
    /**
     * Says the last direction which the robot goes.
     * @return True means it is going ahead.
     */
    public boolean getSense(){
        return encoder.getDirection();
    }
    /***********************************
     * Says if the robot is stopped.  *
     * @return true if the robot is stopped*
     ***********************************/
    public boolean getStopped(){
        return encoder.getStopped();
    }
    /**
     * Use this if the distance per pulse isn't set or if it changes by any reason
     * @param dpp Define the distance per pulse measured by the encoder.
     */
    public void setDistancePerPulse(double dpp){
        encoder.setDistancePerPulse(dpp);
    }
}