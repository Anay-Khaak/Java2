// Задача 3. Удаление пустых строк из текста
// Дана строка с несколькими строками текста, разделенными переводами строки. Напишите метод, который удаляет все пустые строки из текста.
// Пример:
// line1
// line2
// line3
// Результат:
// line1 line2 line3

// Подсказка No 1
// Используйте метод split("\n"), чтобы разбить исходный текст на массив строк по символу
// перевода строки. Это позволит вам обработать каждую строку отдельно.
// Подсказка No 2
// Пройдитесь по массиву строк и используйте метод trim() для проверки, является ли строка 
// пустой (или состоит только из пробельных символов). Если строка не пуста, добавьте ее в
// результирующую строку.
// Подсказка No 3
// Используйте StringBuilder для формирования итоговой строки. При добавлении каждой непустой 
// строки проверьте, не является ли это первой строкой (чтобы избежать добавления лишнего 
// перевода строки в начале).
// Подсказка No 4
// После того как все строки будут обработаны и собраны, верните результат в виде строки с 
// помощью метода toString() у StringBuilder.

class TextCleaner {
   public static String removeEmptyLines(String text) {
       String[] lines = text.split("\n");
       StringBuilder cleanedText = new StringBuilder();
        for (String line : lines) {
           if (!line.trim().isEmpty()) {
               if (cleanedText.length() > 0) {
                   cleanedText.append("\n");
}
               cleanedText.append(line);
           }
}
       return cleanedText.toString();
   }
}
// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class hw3 {
   public static void main(String[] args) {
       String text = "";
       if (args.length == 0) {
           text = "line1\n\nline2\n\nline3";
       } else {
           text = args[0];
}
TextCleaner ans = new TextCleaner(); System.out.println(ans.removeEmptyLines(text));
} }