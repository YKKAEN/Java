package Lesson13;

public class Main {
    public static void main(String[] args) {
        Staff staff1 = new Staff(1, "A", "B", 25000);
        Staff staff2 = new Staff(2, "C", "E", 130000);
        Staff staff3 = new Staff(3, "J", "K", 35000);
        Staff staff4 = new Staff(4, "L", "M", 140000);
        Staff staff5 = new Staff(5, "N", "O", 45000);

        HRManagers hrManagers1 = new HRManagers(1, "ABC", 50000);
        HRManagers hrManagers2 = new HRManagers(2, "DEF", 155000);
        HRManagers hrManagers3 = new HRManagers(3, "GJK", 60000);
        HRManagers hrManagers4 = new HRManagers(4, "LMN", 165000);
        HRManagers hrManagers5 = new HRManagers(5, "OPQ", 70000);

        Programmers programmers1 = new Programmers(1, "STEVE", 75000, 1000, 1);
        Programmers programmers2 = new Programmers(2, "ELON", 75500, 1500, 0);
        Programmers programmers3 = new Programmers(3, "BILL", 80000, 2000, 0);
        Programmers programmers4 = new Programmers(4, "OBAMA", 85000, 2500, 1);
        Programmers programmers5 = new Programmers(5, "TRUMP", 85500, 3000, 1);

        Workers[] workers = {staff1, staff2, staff3, staff4, staff5, hrManagers1, hrManagers2, hrManagers3, hrManagers4, hrManagers5, programmers1, programmers2, programmers3, programmers4, programmers5};
        Workers max = workers[0];

        for (int i = 0; i < workers.length; i++) { // a. Выведите данные рабочего, у которого самая высокая зарплата.
            if (workers[i].getSalary() > max.getSalary())
                max = workers[i];
        }
        System.out.println(max.getWorkerData());

        for (int i = workers.length - 1; i > 0; i--) { // b. Отсортируйте рабочих, по зарплате, по убыванию.
            for (int j = 0; j < i; j++) {
                if (workers[j].getSalary() > workers[j + 1].getSalary()) {
                    Workers temp = workers[j];
                    workers[j] = workers[j + 1];
                    workers[j + 1] = temp;
                }
            }
            System.out.println(workers[i].getWorkerData());
        }
        for (int i = 0; i < workers.length - 1; i++) { // c. Отсортируйте рабочих, по зарплате, по возрастанию.
            for (int j = workers.length - 1; j > i; j--) {
                if (workers[j - 1].getSalary() > workers[j].getSalary()) {
                    Workers tmp = workers[j - 1];
                    workers[j - 1] = workers[j];
                    workers[j] = tmp;
                }
            }
            System.out.println(workers[i].getWorkerData());
        }
    }
}