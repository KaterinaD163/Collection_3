import java.util.*;

public class Main {

    public static void main(String[] args) {
        //Задание 1.1
        HashMap<String, String> phoneNumbers = new HashMap<>();
        phoneNumbers.put("Захарова Зоя", "89283723845");
        phoneNumbers.put("Макеев Николай", "89283746325");
        phoneNumbers.put("Захаров Андрей", "89273643827");
        phoneNumbers.put("Кадиева Дарина", "84932734856");
        phoneNumbers.put("Сластенина Василиса", "89382738273");
        phoneNumbers.put("Хряпкина София", "80372837263");
        phoneNumbers.put("Афанасьев Артём", "894736251425");
        phoneNumbers.put("Левченко Андрей", "89271829384");
        phoneNumbers.put("Фирсова Милана", "89273847362");
        phoneNumbers.put("Николаева Арина", "89273627261");
        phoneNumbers.put("Быковская Василиса", "89281726352");
        phoneNumbers.put("Ипатьева Лидия", "89372837485");
        phoneNumbers.put("Самыкина Яна", "89483726374");
        phoneNumbers.put("Иванова Екатерина", "89382736475");
        phoneNumbers.put("Гочоян София", "89283748372");
        phoneNumbers.put("Кузнецова Анастасия", "89382736475");
        phoneNumbers.put("Хисамутдинова Альвина", "8984758695");
        phoneNumbers.put("Загадкина Елена", "89372837485");
        phoneNumbers.put("Задумкин Фёдор", "89283726374");
        phoneNumbers.put("Лапушкина Инна", "89384756473");
        System.out.println(phoneNumbers.values());
        System.out.println();

        //Задание 1.3
        HashMap<String, Integer> address = new HashMap<>();

        address.put("Московская", 39);
        address.put("Пензенская", 298);
        address.put("Стара-Загора", 8);
        address.put("Ново-Садовая", 295);
        address.put("Ново-Садовая", 29);
        address.put("Осипенко", 27);
        address.put("Фрунзе", 329);
        address.put("Шостаковича", 7);
        address.put("Володарского", 487);
        address.put("Владимирская", 2);
        putAddress(address, "Загорская", 35);
        putAddress(address, "Ново-Садовая", 445);
        putAddress(address, "Загорская", 27);
        System.out.println(address);
        System.out.println();

        // Задание 2.1
        HashMap<String, List<Integer>> point = new HashMap<>();

        point.put("Наталья", List.of(465, 384, 192));
        point.put("Андрей", List.of(2, 48, 383));
        point.put("Милана", List.of(1000, 0, 389));
        point.put("Зоя", List.of(10, 47, 23));
        point.put("Матвей", List.of(339, 1, 3));
        System.out.println(point);
        System.out.println();

        HashMap<String, Integer> points = new HashMap<>();
        putAllPoint(points, "Наталья", List.of(465, 384, 192));
        putAllPoint(points, "Андрей", List.of(2, 48, 383));
        putAllPoint(points, "Милана", List.of(1000, 0, 389));
        putAllPoint(points, "Зоя", List.of(10, 47, 23));
        putAllPoint(points, "Матвей", List.of(339, 1, 3));
        System.out.println(points);
        System.out.println();

        // Задание 2.2
        HashMap<Integer, String> listOfStudents = new LinkedHashMap<>();

        searchSameValues(listOfStudents, 1, "Дручинина Татьяна");
        searchSameValues(listOfStudents, 2, "Маркелова Екатерина");
        searchSameValues(listOfStudents, 3, "Завалина Александра");
        searchSameValues(listOfStudents, 4, "Закуткина Пелагея");
        searchSameValues(listOfStudents, 5, "Водовозова Наталья");
        searchSameValues(listOfStudents, 6, "Манушева Екатерина");
        searchSameValues(listOfStudents, 7, "Неткулова Татьяна");
        searchSameValues(listOfStudents, 8, "Афанасьев Григорий");
        searchSameValues(listOfStudents, 9, "Батяев Павел");
        searchSameValues(listOfStudents, 10, "Дручинина Татьяна");
    }


    private static void putAddress(HashMap<String, Integer> address, String key, Integer value) throws RuntimeException {
        if (!address.containsKey(key)) {
            address.put(key, value);
        } else if (address.containsKey(key) && address.get(key).equals(value)) {
            throw new RuntimeException("Такой адрес уже есть!");
        }
        address.put(key, value);
    }

    private static void putAllPoint(HashMap<String, Integer> points, String key, List<Integer> value) {
        int sum = 0;
        for (int i = 0; i < value.size(); i++) {
            sum += value.get(i);
            Integer put = points.put(key, sum);
        }
        }


    private static void searchSameValues(HashMap<Integer, String> listOfStudents, Integer key, String value) {
        if (!listOfStudents.containsValue(value)) {
            listOfStudents.put(key, value);
            System.out.println("Ключ: " + key + " :: Значение: " + value);
        }
    }
}





