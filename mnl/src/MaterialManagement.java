import java.time.LocalDate;
class MaterialManager {
    public static void main(String[] args) {
        // Tạo mới 5 đối tượng bột
        CrispyFlour crispyFlour1 = new CrispyFlour("1", "Crispy Flour 1", LocalDate.now(), 5, 2);
        CrispyFlour crispyFlour2 = new CrispyFlour("2", "Crispy Flour 2", LocalDate.now(), 6, 3);
        CrispyFlour crispyFlour3 = new CrispyFlour("3", "Crispy Flour 3", LocalDate.now(), 4, 1);
        CrispyFlour crispyFlour4 = new CrispyFlour("4", "Crispy Flour 4", LocalDate.now(), 7, 4);
        CrispyFlour crispyFlour5 = new CrispyFlour("5", "Crispy Flour 5", LocalDate.now(), 8, 5);
        Meat meat1 = new Meat("6", "Meat 1", LocalDate.now(), 10, 2.5);
        Meat meat2 = new Meat("7", "Meat 2", LocalDate.now(), 12, 3.0);
        Meat meat3 = new Meat("8", "Meat 3", LocalDate.now(), 15, 2.0);
        Meat meat4 = new Meat("9", "Meat 4", LocalDate.now(), 18, 1.5);
        Meat meat5 = new Meat("10", "Meat 5", LocalDate.now(), 20, 3.5);
    }
}