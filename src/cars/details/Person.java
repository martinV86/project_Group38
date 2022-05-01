package cars.details;

public class Person {
    private String name;
    private String family_name;
    private String patronymic;

    public Person(String name,String family_name,String patronymic) {
        this.name = name;
        this.family_name=family_name;
        this.patronymic=patronymic;
    }

    public String getFamily_name() {
        return family_name;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    @Override
    public String toString() {
        return
                "имя: " + name + '\'' +
                        ", фамилия: " + family_name + '\'' +
                        ", отчество: " + patronymic ;
    }
}
