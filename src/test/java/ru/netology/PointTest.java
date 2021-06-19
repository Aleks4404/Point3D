package ru.netology;

import java.awt.*;

class PointTest {
    public static void main(String[] arguments) {
        Point location1 = new Point(11, 22);
        Point3D location2 = new Point3D(7, 6, 64);

        System.out.println("Двумерная точка находится в (" +
                location1.x + ", " + location1.y + ")");
        System.out.println("Она перемещается в (4, 13)");
        location1.move(4, 13);
        System.out.println("Teпepь двумерная точка находится в (" +
                location1.x + ", " + location1.y + ")");
        System.out.println("Oнa перемещена на -10 единиц по оси " +
                "х и по оси у");
        location1.translate(-10, -10);
        System.out.println("Теперь двумерная точка находится в (" +
                location1.x + ", " + location1.y + ")\n");

        System.out.println("Tpexмepнaя точка находится в (" +
                location2.x + ", " + location2.y + ", " +
                location2.z + ")");
        System.out.println("Oнa перемещается в (10, 22, 71)");
        location2.move(10, 22, 71);
        System.out.println("Теперь трехмерная точка находится в (" +
                location2.x + ", " + location2.y + ", " +
                location2.z + ")");
        System.out.println("Oнa перемещена на -20 единиц по осям " +
                "х, у и оси z");
        location2.translate(-20, -20);
        System.out.println("Teпepь трехмерная точка находится в (" +
                location2.x + ", " + location2.y + ", " +
                location2.z + ")");
    }
}