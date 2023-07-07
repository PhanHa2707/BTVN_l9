package vehicle.car;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import vehicle.Vehicle;

import java.util.Scanner;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Car extends Vehicle {
    private String color;
    static Scanner s=new Scanner(System.in);
    @Override
    public void input(){
        super.input();
        System.out.println("Nhập color");
        color=s.nextLine();

    }
    @Override
    public void display(){
        System.out.println("Car");
        super.display();
        System.out.print(" "+color+"\n");
    }

}
