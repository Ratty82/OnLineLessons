import java.util.Scanner;

public class CourseRunner {

    public static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        Course_lib course_lib = new Course_lib();
        course_lib.addCourse(new Course.Builder()
                .cName("Программирование JAVA")
                .cNumStudents(10)
                .cTeacher("Н.Петров")
                .cDur(30)
                .cActive(true)
                .cAdvanced(true)
                .build());

        course_lib.addCourse(new Course.Builder()
                .cName("Программирование Python")
                .cNumStudents(15)
                .cTeacher("Н.Петров")
                .cDur(30)
                .cActive(true)
                .cAdvanced(true)
                .build());

        while (isRunning) {
            System.out.println("\n=== МЕНЮ ===");
            System.out.println("1. Добавить курс");
            System.out.println("2. Найти курс");
            System.out.println("3. Назначить преподавателя");
            System.out.println("4. Изменить статус курса (активен/не активен)");
            System.out.println("5. Показать все курсы");
            System.out.println("0. Выход");
            System.out.print("Введите номер опции: ");

            int userChoice = scanner.nextInt();
            scanner.nextLine();

            switch (userChoice) {
                case 1:
                    System.out.println("Введите название курса");
                    String title = scanner.nextLine();

                    System.out.println("Введите преподавателя");
                    String teacher = scanner.nextLine();

                    System.out.println("Введите длительность курса (дней)");
                    int dur = scanner.nextInt();

                    System.out.println("Введите число студентов");
                    int students = scanner.nextInt();

                    System.out.println("Курс для продвинутых? (true/false)");
                    boolean complx = scanner.nextBoolean();
                    scanner.nextLine();

                    Course newCourse = new Course.Builder()
                            .cName(title)
                            .cTeacher(teacher)
                            .cNumStudents(students)
                            .cDur(dur)
                            .cActive(true)
                            .cAdvanced(complx)
                            .build();

                    course_lib.addCourse(newCourse);
                    System.out.println("Курс добавлен: " + newCourse);
                    break;

                case 2:
                    System.out.println("Введите название");
                    String title2 = scanner.nextLine();
                    Course found = course_lib.searchCourse(title2);
                    if (found != null) {
                        System.out.println("Найден: " + found);
                    } else {
                        System.out.println("Курс не найден");
                    }
                    break;

                case 3:
                    System.out.println("Введите название курса");
                    String cTitle = scanner.nextLine();

                    System.out.println("Введите ФИО преподавателя");
                    String cTeacher = scanner.nextLine();

                    String updatedTeacher = course_lib.assignTeacher(cTitle, cTeacher);
                    if (updatedTeacher != null) {
                        System.out.println("Обновлено: " + updatedTeacher);
                    } else {
                        System.out.println("Курс не найден");
                    }
                    break;

                case 4:
                    System.out.println("Введите название курса");
                    String cTitle2 = scanner.nextLine();

                    System.out.println("Курс активен? (true/false)");
                    boolean cActive = scanner.nextBoolean();
                    scanner.nextLine();

                    String updatedActive = course_lib.changeActive(cTitle2, cActive);
                    if (updatedActive != null) {
                        System.out.println("Обновлено: " + updatedActive);
                    } else {
                        System.out.println("Курс не найден");
                    }
                    break;

                case 5:
                    System.out.println("Все курсы:");
                    course_lib.listCourses();
                    break;

                case 0:
                    System.out.println("До свидания!");
                    isRunning = false;
                    break;

                default:
                    System.out.println("Неверный выбор");
                    break;
            }
        }

        scanner.close();
    }
}
