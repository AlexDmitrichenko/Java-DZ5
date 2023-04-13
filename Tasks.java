// Задача 1. Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь 
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

// Задача 2. Пусть дан список сотрудников: Иван Иванов   Светлана Петрова   Кристина Белова   Анна Мусина   
// Анна Крутова   Иван Юрин   Петр Лыков   Павел Чернов   Петр Чернышов   Мария Федорова   Марина Светлова   
// Мария Савина   Мария Рыкова   Марина Лугова   Анна Владимирова   Иван Мечников   Петр Петин   Иван Ежов
// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности Имени.

// import java.io.BufferedReader;
// import java.io.FileReader;
// import java.io.IOException;
// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.HashMap;
// import java.util.Map.Entry;
// public class Tasks {
//     public static void main(String[] args) throws IOException {
//         ArrayList<String> names = new ArrayList<>();
//         BufferedReader br = new BufferedReader(new FileReader("names.txt"));
//         String line = br.readLine();
//         while (line != null) {
//             names.add(line.split(" ")[0]);
//             line = br.readLine();
//         }
//         br.close();
//         HashMap<String, Integer> counter = new HashMap<>();
//         for (int i = 0; i < names.size(); i++) {
//             if (!counter.containsKey(names.get(i))) {
//                 counter.put(names.get(i), 1);
//             } else
//                 counter.put(names.get(i), counter.get(names.get(i)) + 1);
//         }
//         StringBuilder sb = new StringBuilder();
//         ArrayList<Integer> ages = new ArrayList<>(counter.values());
//         Collections.sort(ages);
//         for (int i = ages.size() - 1; i >= 0; i--) {
//             for (Entry<String, Integer> entry : counter.entrySet()) {
//                 if (entry.getValue() > 1 && entry.getValue() == ages.get(i)) {
//                     sb.append(entry.getKey() + " - " + Integer.toString(entry.getValue()));
//                     sb.append(System.lineSeparator());
//                     counter.remove(entry.getKey());
//                     break;
//                 }
//             }
//         }
//         System.out.println(sb.toString());
//     }
// }

// Задача 3. На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга. И вывести Доску. 
// Пример вывода доски 8x8
// 0x000000
// 0000x000
// 00x00000
 
// public class Tasks {
//     public static void main(String[] args) {
//         int[] queens = new int[8];
//         findPosition(0, queens);
//         for (int row = 0; row < 8; row++) {
//             for (int col = 0; col < 8; col++) {
//                 if (queens[row] == col) {
//                     System.out.print("X");
//                 } else {
//                     System.out.print("0");
//                 }
//             }
//             System.out.println();
//         }
//     }

//     private static boolean findPosition(int row, int[] queens) {
//         if (row == 8) {
//             return true;
//         }
//         for (int col = 0; col < 8; col++) {
//             boolean isSafe = true;
//             for (int i = 0; i < row; i++) {             
//                 if (queens[i] == col || queens[i] == col - row + i || queens[i] == col + row - i) {
//                     isSafe = false;
//                     break;
//                 }
//             }
//             if (isSafe) {
//                 queens[row] = col; 
//                 if (findPosition(row + 1, queens)) { 
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
// }

