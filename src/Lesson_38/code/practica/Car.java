package Lesson_38.code.practica;

public class Car {
    public int NumberOfDoors;
    public int DoorLength;
    public int DoorHeight;

    public Car(int numberOfDoors, int doorLength, int doorHeight) {
        NumberOfDoors = numberOfDoors;
        DoorLength = doorLength;
        DoorHeight = doorHeight;
    }

    public int getNumberOfDoors() {
        return NumberOfDoors;
    }

    public int getDoorLength() {
        return DoorLength;
    }

    public int getDoorHeight() {
        return DoorHeight;
    }

    @Override
    public String toString() {
        return "Car{" +
                "NumberOfDoors=" + NumberOfDoors +
                ", DoorLength=" + DoorLength +
                ", DoorHeight=" + DoorHeight +
                '}';
    }
}
