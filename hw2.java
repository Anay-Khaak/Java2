// Задача 2. Создание CSV-строки из массива объектов
// Дан массив объектов, где каждый объект представляет собой строку данных, и массив заголовков. 
// Создайте строку CSV, где строки данных разделяются новой строкой, а значения в строках 
// разделяются запятыми.
// Пример:
// String[] headers = {"Name", "Age", "City"}; String[][] data = {
// {"John", "30", "New York"}, {"Alice", "25", "Los Angeles"}, {"Bob", "35", "Chicago"}
// };
// Результат:
// Name,Age,City John,30,New York Alice,25,Los Angeles Bob,35,Chicago

// Подсказка No 1
// Используйте метод String.join(), чтобы объединить элементы массива заголовков, разделенные запятыми. Это создаст первую строку CSV-файла, которая будет содержать заголовки.
// Подсказка No 2
// Пройдитесь по массиву данных и для каждой строки используйте метод String.join() для объединения элементов строки, разделенных запятыми. Не забудьте добавить перевод строки после каждой строки данных.
// Подсказка No 3
// Добавьте заголовки в начало строки, затем добавьте строки данных. Убедитесь, что в конце строки нет лишнего перевода строки. Вы можете использовать StringBuilder для эффективного формирования строки CSV.
// Подсказка No 4
// После формирования всей строки CSV, последняя новая строка может быть лишней. Используйте метод trim() для удаления последнего символа новой строки из итоговой строки CSV.

class CSVGenerator {
   public static String generateCSV(String[] headers, String[][]
data) {
       StringBuilder csv = new StringBuilder();
       // Добавление заголовков
csv.append(String.join(",", headers)).append("\n");
       // Добавление данных
for (String[] row : data) { csv.append(String.join(",", row)).append("\n");
}
       return csv.toString().trim(); // Удалить последнюю новую строку
} }
// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class hw2 {
     public static void main(String[] args) {
       String[] headers = {};
       String[][] data = {};
       if (args.length == 0) {
           headers = new String[]{"Name", "Age", "City"};
           data = new String[][] {
                   {"John", "30", "New York"},
                   {"Alice", "25", "Los Angeles"},
                   {"Bob", "35", "Chicago"}
}; } else {
           // Преобразование строковых параметров в массивы
           // Пример обработки данных можно дополнить в зависимости от формата args
}
       CSVGenerator ans = new CSVGenerator();
System.out.println(ans.generateCSV(headers, data)); }
}