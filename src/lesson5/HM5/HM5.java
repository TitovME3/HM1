package lesson5.HM5;

public class HM5 {

    public static void main(String[] args) {

        Staff mainEmployee = new Staff("Павел", "Владимирович",
                "Толстов", "8(495)000-11-22",
                "Test Manager", 80000, 1986);

        Staff[] office = {
                mainEmployee,
                new Staff("Андрей", "Семенович",
                        "Семенов", "8(495)111-22-33",
                        "project owner", 520000, 1955),
                new Staff("Евгений", "Евгеньевич",
                        "Евгеньев", "8(495)222-33-44",
                        "project manager", 40000, 1963),
                new Staff("Наталья", "Васильевна",
                        "Смирнова", "8(495)333-44-55",
                        "senior developer", 90000, 1990),
                new Staff("Светлана", "Петровна",
                        "Тетенькова", "8(495)444-55-66",
                        "engineer", 50000, 1963)
        };

        getAllPersonsInOffice(office);
        System.out.println("***************");
        getOldPerson(office, 40);

    }

    private static void getOldPerson(Staff[] office, int year) {
        for (int i = 0; i < office.length; i++)
            if (office[i].getAge() > year) {
                System.out.println(office[i].getFullInfo());
            }
    }


    private static void getAllPersonsInOffice(Staff[] office) {
        System.out.println("All staff : ");
        for (int i = 0; i < office.length; i++)
            System.out.println((i + 1) + " " + office[i].getFullInfo());
    }
}



