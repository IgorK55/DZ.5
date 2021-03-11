
                       //Домашка - 5//
                     
/*

Task1:

1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
2. Конструктор класса должен заполнять эти поля при создании объекта;
3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
4. Создать массив из 5 сотрудников
5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет

*/

                       import java.util.Scanner;

//1. Создать класс "Сотрудник" -Employee.

                       class Employee {

                           String Name;
                           String Profession;
                           String email;
                           long Telephone;
                           long Salary;
                           int Age;

                           //ввод данных о сотруднике
                           void GetData() {
                               Scanner sc = new Scanner(System.in);

                               System.out.print("\n\tEnter Employee Name : ");
                               Name = sc.nextLine();

                               System.out.print("\n\tEnter Employee Profession : ");
                               Profession = sc.nextLine();

                               System.out.print("\n\tEnter Employee email : ");
                               email = sc.nextLine();

                               System.out.print("\n\tEnter Employee Telephone : ");
                               Telephone = Long.parseLong(sc.nextLine());

                               System.out.print("\n\tEnter Employee Salary : ");
                               Salary = Long.parseLong(sc.nextLine());

                               System.out.print("\n\tEnter Employee Age : ");
                               Age = Integer.parseInt(sc.nextLine());
                           }

                           //выводим информацию об объекте в консоль
                           void PutData()

                           {
                               System.out.print("\n\tEmployee Name : " + Name);
                               System.out.print("\n\tEmployee Profession : " + Profession);
                               System.out.print("\n\tEmployee email : " + email);
                               System.out.print("\n\tEmployee Telephone : " + Telephone);
                               System.out.print("\n\tEmployee Salary : " + Salary);
                               System.out.print("\n\tEmployee Age : " + Age);
                           }
                       }

// 2. это конструктор, он будет прописывать Name, Profession ...автоматический, при создании обьекта в ячейке массива E[0], E[1]...

                           public Employee(String Name, String Profession, String email, String Telephone, long Salary, int Age)
                           {}
                       }

                       public class Main {
                           public static
                           void main(String args[]) {

//создаем массив на 5 человек, и заполняем ячейки массива при помощи конструктора

                               Employee[] E = new Employee[5];
                               //для каждой ячейки массива задаем объект 2. Конструктор класса должен заполнять эти поля при создании объекта;

                               E[0] = new Employee("ivan ivanov", "Engineer", "ivanov@mailbox.com", "5675685685644", 120000, 36);
                               E[1] = new Employee("Antonio Banderas", "Actor", "banderaspapandreas@mail.ru", "8944389289", 100000, 50);
                               E[2] = new Employee("Chuck Norris", "Actor", "ChuckFu@yandex.ru", "856756755", 2000000, 78);
                               E[3] = new Employee("Silvestor Stalonij", "Actor", "RamboForeva@gmail.com", "8585858585", 1000000, 68);
                               E[4] = new Employee("Arnold Schwarznegger", "Actor", "janenegr@dmx.de", "453222534", 2500000, 70);

*/
                               //С помощью цикла вывести информацию только о сотрудниках старше 40 лет

                               //-не получилось вывести через цикл

// вводим данные о работнике и выводим результат ввода в консоль
                               Employee A = new Employee();
                               A.GetData();
                               A.PutData();


                           }
                       }
