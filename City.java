import java.util.Scanner;

public class City
{
    static Scanner sc = new Scanner(System.in);
    static int counter = 0;
    static CityNode head = null;

    static class CityNode
    {
        String name;
        int x, y;
        CityNode next;
    }

    public static void main(String[] args)
    {
        while (true)
        {
            System.out.println("\n1. Add city");
            System.out.println("2. Print all cities");
            System.out.println("3. Search city by name");
            System.out.println("4. Search city by x and y coordinate");
            System.out.println("5. Delete city");
            System.out.println("6. Print cities within given distance");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice)
            {
                case 1:
                    addCity();
                    break;
                case 2:
                    printCities();
                    break;
                case 3:
                    searchCityByName();
                    break;
                case 4:
                    searchCityByXandY();
                    break;
                case 5:
                    deleteCity();
                    break;
                case 6:
                    printCityWithinDistance();
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("\nInvalid choice\n");
            }
        }
    }

    static void addCity()
    {
        CityNode newCity = new CityNode();
        System.out.print("\nEnter name of city: ");
        newCity.name = sc.next();
        System.out.print("Enter x coordinate: ");
        newCity.x = sc.nextInt();
        System.out.print("Enter y coordinate: ");
        newCity.y = sc.nextInt();
        newCity.next = null;
        counter++;
        if (head == null)
        {
            head = newCity;
        }
        else
        {
            CityNode temp = head;
            while (temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = newCity;
        }
    }

    static void printCities()
    {
        int i = 1;
        CityNode temp = head;
        if (temp == null)
        {
            System.out.println("\nNo cities are there in database!!!\n");
        }
        while (temp != null)
        {
            System.out.println("\nCITY " + i + " ");
            System.out.println("Name: " + temp.name);
            System.out.println("X : " + temp.x);
            System.out.println("Y : " + temp.y + "\n");
            temp = temp.next;
            i++;
        }
    }

    static void printGivenCity(CityNode temp)
    {
        System.out.println("\n ");
        System.out.println("Name: " + temp.name);
        System.out.println("X : " + temp.x);
        System.out.println("Y : " + temp.y + "\n");
    }

    static void searchCityByName()
    {
        String name;
        System.out.print("\nEnter name of city: ");
        name = sc.next();
        CityNode temp = head;
        while (temp != null)
        {
            if (name.equals(temp.name))
            {
                printGivenCity(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("\nGiven city not found\n");
    }

    static void searchCityByXandY()
    {
        int x, y;
        System.out.print("\nEnter x coordinate: ");
        x = sc.nextInt();
        System.out.print("Enter y coordinate: ");
        y = sc.nextInt();
        CityNode temp = head;
        while (temp != null)
        {
            if (temp.x == x && temp.y == y)
            {
                printGivenCity(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("\nGiven city not found\n");
    }

    static float calculateDistance(CityNode temp1, int x, int y)
    {
        float distance = (float) Math.sqrt(Math.pow(x - temp1.x, 2) + Math.pow(y - temp1.y, 2));
        return distance;
    }

    static void deleteCity()
    {
        int flag = 0;
        String name;
        System.out.print("\nEnter name of city: ");
        name = sc.next();
        CityNode temp = head;
        CityNode prev = null;
        while (temp != null)
        {
            if (name.equals(temp.name))
            {
                if (prev == null)
                {
                    head = temp.next;
                }
                else
                {
                    prev.next = temp.next;
                }
                //free(temp);
                counter--;
                flag++;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        if (flag == 0)
        {
            System.out.println("\nGiven city not found\n");
        }
    }

    static void printCityWithinDistance()
    {
        int x, y;
        float distance;
        int flag = 0;
        System.out.print("\nEnter x coordinate: ");
        x = sc.nextInt();
        System.out.print("Enter y coordinate: ");
        y = sc.nextInt();
        System.out.print("Enter distance: ");
        distance = sc.nextFloat();
        CityNode temp = head;
        while (temp != null)
        {
            if (calculateDistance(temp, x, y) <= distance)
            {
                printGivenCity(temp);
                flag++;
            }
            temp = temp.next;
        }
        if (flag == 0)
        {
            System.out.println("\nNo city found within given distance\n");
        }
    }
}