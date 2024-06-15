package Lesson_38.code.practica.Computer;

public class Notebook {
    private String model;
    private String manufacturer;
    private double monitor;
    private int hardDrive;

    public Notebook(String model, String manufacturer, double monitor, int hardDrive) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.monitor = monitor;
        this.hardDrive = hardDrive;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getMonitor() {
        return monitor;
    }

    public int getHardDrive() {
        return hardDrive;
    }

    public class Monitor {
        private double diagonal;
        private int brightness;

        public Monitor(double diagonal, int brightness) {
            this.diagonal = diagonal;
            this.brightness = brightness;
        }

        public class HardDisk{
            private int diskVolume;
        }

    }
}


