// Задание 1. Формирование URL с параметрами
// Дана строка базового URL:
// https://example.com/search?
// Сформируйте полный URL, добавив к нему параметры для поиска. Параметры передаются в виде строки, где ключи и значения разделены =, а пары ключ-значение разделены &. Если значение null, то параметр не должен попадать в URL.
// Пример:
// params = "query=java&sort=desc&filter=null"
// Результат:
// https://example.com/search?query=java&sort=desc

// Подсказка No 1
// Разделите строку параметров на части, используя символ & в качестве разделителя. Это даст вам массив строк, каждая из которых представляет собой пару "ключ=значение".
// Подсказка No 2
// Для каждой строки, представляющей пару "ключ=значение", разделите её на ключ и значение с помощью символа =. Это позволит вам обработать ключ и значение отдельно.
// Подсказка No 3
// Проверьте, если значение после символа = равно "null". В этом случае, этот параметр не должен добавляться к итоговому URL.
// Подсказка No 4
// Используйте StringBuilder для построения итогового URL. Начните с базового URL и добавляйте параметры, разделяя их символом &, если это необходимо.
// Подсказка No 5
// При добавлении первого параметра в URL, не забудьте проверить, есть ли уже символ ? в базовом URL. Если он присутствует, параметры должны быть добавлены после него. Если его нет, начните с ?.


class URLBuilder {
   public static String buildURL(String baseURL, String params) {
       StringBuilder url = new StringBuilder(baseURL);
       String[] pairs = params.split("&");
       for (int i = 0; i < pairs.length; i++) {
           String[] keyValue = pairs[i].split("=");
           if (!"null".equals(keyValue[1])) {
               if (i > 0) {
                   url.append("&");
}
url.append(keyValue[0]).append("=").append(keyValue[1]);
           }
}
       return url.toString();
   }
}
// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class hw1 {
   public static void main(String[] args) {
       String baseURL = "";
       String params = "";
       if (args.length == 0) {
           baseURL = "https://example.com/search?";
           params = "query=java&sort=desc&filter=null";
       } else {
           baseURL = args[0];
           params = args[1];
}
       URLBuilder ans = new URLBuilder();
System.out.println(ans.buildURL(baseURL, params)); }
}