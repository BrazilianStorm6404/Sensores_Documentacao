
package frc.robot;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DigitalSource;

public class Optical_VisiSight{
    protected final DigitalInput dio;
    public Optical_VisiSight(DigitalSource dio){
        this.dio = (DigitalInput)dio;
    }
    public boolean get(){
        return dio.get();
    }
}