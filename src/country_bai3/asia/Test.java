package country_bai3.asia;

import country_bai3.Country;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    static void menu(List<Country> country, int n) {
        do {

            System.out.println("1.Input Information");
            System.out.println("2. Display Information");
            System.out.println("3. List Sort");
            System.out.println("4. Find Information");
            System.out.println("5. Exit");
            System.out.println("Chon menu");
            n = Integer.parseInt(new Scanner(System.in).nextLine());
            if (n == 5) {
                System.out.println("Kết thúc");
            }
            handleMenu(country, n);
        }while (n!=5);

        }

     static void handleMenu(List<Country> country, int n) {
         switch (n) {
             case 1:
                 input(country);
                 break;
             case 2:
                 display(country);
                 break;
             case 3:
                 sort(country);
                 break;
             case 4:
                 searchModel(country);
                 break;
             default:
                 break;
         }
     }

    static void input(List<Country> country) {
        System.out.println("Nhập 2");
        for (int i = 0; i < 2; i++) {
            AsiaCountry asiaCountry=new AsiaCountry();
            asiaCountry.input();
            country.add(asiaCountry);
        }


    }
    static void display(List<Country> country){
        for (int i = 0; i < country.size(); i++) {
            country.get(i).display();
        }
    }
    static void sort(List<Country> country){
        System.out.println("Trước sắp xếp");
        country.forEach(Country::display);
        System.out.println("Sau sắp xếp");
        country.sort((o1, o2) -> (int)(o1.getArea()- o2.getArea()));
        country.forEach(Country::display);
    }
    static void searchModel(List<Country> country){
        System.out.println("Nhập model cần tìm");
        String model= new Scanner(System.in).nextLine();
        boolean flag =false;

        for (int i = 0; i < country.size(); i++) {
            if (country.get(i).getCountryName().equals(country)){
                country.get(i).display();;
                flag=true;
            }
        }
        if (flag=false) System.out.println("Không tìm thấy");
    }

    public static void main(String[] args) {
        int n = 0;
        List<Country> country= new ArrayList<>();
        menu(country,n);
    }
}




