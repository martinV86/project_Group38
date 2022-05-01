package cars.details;

public class Driver extends Person{
    private int driving_experience;


    public Driver(String name, String family_name, String patronymic,int driving_experience) {
        super(name, family_name, patronymic);
        this.driving_experience=driving_experience;
    }

    public int getDriving_experience() {
        return driving_experience;
    }

    @Override
    public String toString() {
        return
                " стаж вождения "+  driving_experience +
                        " лет, "+super.toString();
    }
}
