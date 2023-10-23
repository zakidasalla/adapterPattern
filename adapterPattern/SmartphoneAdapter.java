package adapterPattern;
public class SmartphoneAdapter implements PowerOutlet{
    private SmartphoneCharger phoneCharge;
    public SmartphoneAdapter(SmartphoneCharger phoneCharge){
        this.phoneCharge = phoneCharge;
    }
    @Override
    public String plugIn(){
        return phoneCharge.chargePhone();
    }
}