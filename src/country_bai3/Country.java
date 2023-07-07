package country_bai3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Scanner;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Country implements ICountry {
    private String countryName;
    double area;
    @Override
    public void input(){
        Scanner s= new Scanner(System.in);
        System.out.println("Input CountryName");
        countryName=s.nextLine();
        System.out.println("Input area");
        area=s.nextDouble();


    }
    @Override
    public void display(){
        System.out.println("CountryName: "+countryName);
        System.out.println("Area "+area);
    }

//    public static void main(String[] args) {
//        List<Country> asiaCountries= new ArrayList<>();
//        for (int i = 0; i < 2; i++) {
//            Country country= new Country();
//            country.input();
//            asiaCountries.add(country);
////            country.display();
//        }
//        for (int i = 0; i < 2; i++) {
//            asiaCountries.get(i).display();
//        }
//
//    }
}
