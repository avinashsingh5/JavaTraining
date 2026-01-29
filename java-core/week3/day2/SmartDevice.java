public class SmartDevice{
    String deviceName;
    String os;
    int batteryCapacity;

    public SmartDevice(){
        this.deviceName = "Redmi";
        this.os = "21";
        this.batteryCapacity = 6000;
    }
    public SmartDevice(String deviceName){
        this();
        this.deviceName = deviceName;
    }
    public SmartDevice(String deviceName,String os){
        this();
        this.deviceName = deviceName;
        this.os = os;
    }
    public SmartDevice(String deviceName, String os, int batteryCapacity){
        this.deviceName = deviceName;
        this.os = os;
        this.batteryCapacity = batteryCapacity;
    }

    public static void PrintDetails(SmartDevice obj){
        System.out.println("Device name: "+obj.deviceName);
        System.out.println("os: "+obj.os );
        System.out.println("batterycapacity: "+obj.batteryCapacity);
    }
    public static void main(String[] args) {
        SmartDevice s1 = new  SmartDevice();
        PrintDetails(s1);
    }
}