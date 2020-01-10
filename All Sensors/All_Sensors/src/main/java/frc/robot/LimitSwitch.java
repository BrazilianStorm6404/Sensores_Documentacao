package frc.robot;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DigitalSource;

public class LimitSwitch {
    protected final DigitalInput dio;
    public LimitSwitch(DigitalSource source){
        dio = (DigitalInput)source;
    }
    /**
     * Get the signal from the limit
     * @return return the signal level of the switch
     */
    public boolean getPressed(){
        return dio.get();
    }
}