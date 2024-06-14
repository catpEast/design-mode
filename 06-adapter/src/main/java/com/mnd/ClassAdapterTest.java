package com.mnd;

public class ClassAdapterTest {

    public static void main(String[] args) {
        
        GasolineMotor gasolineMotor = new GasolineMotor();
        ElectricMotor gasolineMotorAdapter = new GasolineMotorAdapter(gasolineMotor);
        ElectricCar electricCar = new ElectricCar();
        electricCar.drive(gasolineMotorAdapter);
    }
}

/**
 * 老式发动机
 */
interface OldMotor {
    void drive();
}

/**
 * 汽油发动机
 */
class GasolineMotor implements OldMotor {

    @Override
    public void drive() {
        System.out.println("汽油发动机");
    }
}

/**
 * 电动发动机
 */
interface ElectricMotor {
    void ElectricDrive();
}

/**
 * 汽油发动机适配器
 */
class GasolineMotorAdapter implements ElectricMotor {
    
    private GasolineMotor gasolineMotor;

    public GasolineMotorAdapter(GasolineMotor gasolineMotor) {
        this.gasolineMotor = gasolineMotor;
    }
    
    @Override
    public void ElectricDrive() {
        gasolineMotor.drive();
    }
}

/**
 * 电动汽车
 */
class ElectricCar {
    public void drive(ElectricMotor motor) {
        motor.ElectricDrive();
    }
}
