package pl.gornik;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Shape("kwadrat",'S',Color.RED));
        shapes.add(new Shape("kwadrat",'M',Color.BLUE));
        shapes.add(new Shape("kwadrat",'S',Color.GREEN));
        shapes.add(new Shape("koło",'S',Color.PURPLE));
        shapes.add(new Shape("Trapez",'L',Color.RED));
        shapes.add(new Shape("kwadrat",'S',Color.YELLOW));


        System.out.println("Wprowadz nazwe, rozmiar ('S', 'M', 'L') oraz kolor");
        System.out.println("Nazwa : ");
        String name = scanner.nextLine();
        System.out.println("Rozmiar : ");
        char size = scanner.nextLine().charAt(0);
        System.out.println("Kolor : ");
        String nameColor = scanner.nextLine();

        Color color = getColor(nameColor);
        if(color != null){
            shapes.add(new Shape(name,size,color));
        }else System.out.println("podałeś wartość z poza enum");

        for (Shape s: shapes
        ) {
            System.out.println(s.toString());
        }
    }

    public static Color getColor(String nameColor){
        switch (nameColor){
            case "Czerwony" -> {
                return Color.RED;

            }
            case "Niebieski" ->{
                return Color.BLUE;
            }
            case "Żółty" ->{
                return Color.YELLOW;
            }
            case "Zielony" ->{
                return Color.GREEN;
            }
            case "Fioletowy" ->{
                return Color.PURPLE;
            }
            default -> {
                return null;
            }
        }
    }
}