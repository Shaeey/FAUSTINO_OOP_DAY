package faustinolabact3;

import java.util.Scanner;

public class FAUSTINO_LAB_ACTIVITY_3 {

    static class Student {

        private final String firstName;
        private final String lastName;
        private int age;
        private boolean isMinor;

        public Student(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.isMinor = (age < 18);

        }

        public String getName() {

            return lastName + "," + firstName;
        }

        public void increaseAge() {
            age++;
            isMinor = (age < 18);
        }

        @Override
        public String toString() {
            String status = isMinor ? "minor" : "adult";
            return lastName + "," + firstName + "-" + age + status;

        }
    }
        public static void main(String[] args) {
            try (Scanner Scanner = new Scanner(System.in)) {
                System.out.print("Enter test case Number: ");
                int caseNum = Scanner.nextInt();
                
                switch (caseNum) {
                    case 1 -> {
                        Student Student1 = new Student("Jemar Jude", "Maranga", 17);
                        System.out.println("Test Case 1: Student under 18");
                        System.out.println(Student1);
                        break;
                    }
                    case 2 -> {
                        Student student2 = new Student("Jemar Jude", "Maranga", 17);
                        student2.increaseAge();
                        System.out.println("Test Case 2: Increase age of student1");
                        System.out.println(student2);
                        break;
                    }
                    case 3 -> {
                        Student student3 = new Student("Jose", "Cruz", 19);
                        System.out.println("Test Case 3: Student over 18");
                        System.out.println(student3);
                        break;
                    }
                    default -> {
                        System.out.println("Invalid test case number.");
                        break;
                    }
                    
                }
            }
        }

    }
