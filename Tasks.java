// Задача 3. Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь 
// несколько телефонов. Добавить функции 1) Добавление номера   2) Вывод всего
// Пример: Я ввожу: 1  К: Введите фамилию  Я: Иванов  К: Введите номер  Я: 1242353  К: Введите 1) Добавление номера
// 2) Вывод всего
// Я ввожу: 1 К: Введите фамилию Я: Иванов К: Введите номер Я: 547568 К: Введите 1) Добавление номера 
// 2) Вывод всего
// Я: 2 Иванов: 1242353, 547568

// import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.Scanner;

// public class Tasks {
//     public static void main(String[] args) {
//         HashMap <String, ArrayList<Integer>> phoneBook  = new HashMap<>();
//         Scanner scn = new Scanner(System.in, "cp866");
//         boolean book = true;
//         while (book) {
//             System.out.println();
//             System.out.println("Введите команду:\n1 - Добавление номера.\n" +
//                     "2 - Вывод всего.\n" +
//                     "0 - Выйти из телефонной книги.");
//             String operation = scn.nextLine();
//             switch (operation) {
//                 case "1":
//                     addContact(phoneBook, scn);
//                     break;
//                 case "2":
//                     showAllContacts(phoneBook);
//                     break;
//                 case "0":
//                     book = false;
//                     System.out.println("Вы вышли из программы.");
//                     break;
//                 default:
//                     System.out.println("Выбрана неверная операция.");
//                     break;
//             }
//         }
//     }

//     public static void addContact(HashMap <String, ArrayList<Integer>> book, Scanner scanner) {
//         System.out.printf("Введите фамилию: ");
//         String name = scanner.nextLine();
//         System.out.printf("Введите номер: ");
//         int num = scanner.nextInt();
//         if(!book.containsKey(name)){
//             book.put(name, new ArrayList<>());
//         }
//         book.get(name).add(num);
//         }
//     public static void showAllContacts(HashMap <String, ArrayList<Integer>> book) {
//         book.entrySet().forEach(entry -> {
//             System.out.println(entry.getKey() + ": " + entry.getValue().toString().replaceAll("\\[", 
//             "").replaceAll("\\]",""));
//         });
//     }
// }
