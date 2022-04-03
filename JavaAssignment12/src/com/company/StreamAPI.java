import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.util.stream.Collectors;

public class StreamAPI {

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8));
        studentList.add(new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2));
        studentList.add(new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3));
        studentList.add(new Student(144, "Murali Gowda", 18, "Male","Electrical", 2018, 80));
        studentList.add(new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70));
        studentList.add(new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70));
        studentList.add(new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70));
        studentList.add(new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80));
        studentList.add(new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85));
        studentList.add(new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82));
        studentList.add(new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83));
        studentList.add(new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4));
        studentList.add(new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6));
        studentList.add(new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8));
        studentList.add(new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4));
        studentList.add(new Student(266, "Sanvi Pandey", 17, "Female","Electrical", 2019, 72.4));
        studentList.add(new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5));

        //Print the name of all departments in the college
        System.out.println("All Departments in the College: ");
        studentList.stream()
                .map(Student::getEngDepartment)
                .distinct()
                .forEach(System.out::println);

        System.out.println();
        System.out.println("===========================================================================================");

        //Get the names of all students who have enrolled after 2018
        System.out.println("Name of Students who enrolled after 2018: ");
        studentList.stream()
                    .filter(e -> e.getYearOfEnrollment() > 2018)
                    .map(Student::getName)
                    .forEach(System.out::println);

        System.out.println();
        System.out.println("===========================================================================================");

        //Get the details of all male student in the computer science department
        System.out.println("Male students details who are in Computer Science Department: ");
        studentList.stream()
                .filter(e -> e.getGender()=="Male" && e.getEngDepartment()=="Computer Science")
                .map(Student::toString)
                .forEach(System.out::println);

        System.out.println();
        System.out.println("===========================================================================================");

        //How many male and female student are there ?
        System.out.println("Count of Male and Female Students in the College: ");
        Map<String, Long> noOfMAleAndFemaleStudents=studentList.stream()
                .collect(Collectors.groupingBy(Student::getGender, Collectors.counting()));
        System.out.println(noOfMAleAndFemaleStudents);

        System.out.println();
        System.out.println("===========================================================================================");

        //What is the average age of male and female students?
        Map<String, Double> avgAgeOfMaleAndFemaleStudents=studentList.stream()
                .collect(Collectors.groupingBy(Student::getGender, Collectors.averagingInt(Student::getAge)));

        System.out.println("Average age of Male and Female Students: ");
        System.out.println(avgAgeOfMaleAndFemaleStudents);

        System.out.println();
        System.out.println("===========================================================================================");

        //Get the details of student having highest percentage
        Optional<Student> highestPercentageStudentWrapper = studentList.stream()
                .collect(Collectors.maxBy(Comparator.comparingDouble(Student::getPercTillDate)));

        Student highestPercStudent = highestPercentageStudentWrapper.get();

        System.out.println("Details Of Student having highest Percentage : ");
        System.out.println("ID : "+highestPercStudent.getId());
        System.out.println("Name : "+highestPercStudent.getName());
        System.out.println("Age : "+highestPercStudent.getAge());
        System.out.println("Gender : "+highestPercStudent.getGender());
        System.out.println("Engineering Department : "+highestPercStudent.getEngDepartment());
        System.out.println("Year Of Enrollment : "+highestPercStudent.getYearOfEnrollment());
        System.out.println("Percentage : "+highestPercStudent.getPercTillDate());

        System.out.println("===========================================================================================");

        //Count the number of students in each department
        Map<String, Long> studentCountByDepartment = studentList.stream()
                .collect(Collectors.groupingBy(Student::getEngDepartment, Collectors.counting()));

        Set<Map.Entry<String, Long>> entrySet1 = studentCountByDepartment.entrySet();

        System.out.println("Count of Students in each of Engineering Department: ");
        for (Map.Entry<String, Long> entry : entrySet1) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

        System.out.println();
        System.out.println("===========================================================================================");

        //What is the average percentage achieved in each department?
        Map<String, Double> avgPercentageOfDepartments = studentList.stream()
                .collect(Collectors.groupingBy(Student::getEngDepartment, Collectors.averagingDouble(Student::getPercTillDate)));

        Set<Map.Entry<String, Double>> entrySet2 = avgPercentageOfDepartments.entrySet();

        System.out.println("Average Percentage achieved in each of the Engineering Department: ");
        for (Map.Entry<String, Double> entry : entrySet2) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println();
        System.out.println("===========================================================================================");

        //Get the details of youngest male student in the Electronic department
        Optional<Student> youngestMaleStudentInElectronicDepartmentWrapper = studentList.stream()
                        .filter(e -> e.getGender()=="Male" && e.getEngDepartment()=="Electronic")
                        .min(Comparator.comparingInt(Student::getAge));

        Student youngestMaleStudentInElectronicDepartment = youngestMaleStudentInElectronicDepartmentWrapper.get();

        System.out.println("Details Of Youngest Male student of Electronic Department : ");
        System.out.println("ID : "+youngestMaleStudentInElectronicDepartment.getId());
        System.out.println("Name : "+youngestMaleStudentInElectronicDepartment.getName());
        System.out.println("Age : "+youngestMaleStudentInElectronicDepartment.getAge());
        System.out.println("Gender : "+youngestMaleStudentInElectronicDepartment.getGender());
        System.out.println("Engineering Department : "+youngestMaleStudentInElectronicDepartment.getEngDepartment());
        System.out.println("Year Of Enrollment : "+youngestMaleStudentInElectronicDepartment.getYearOfEnrollment());
        System.out.println("Percentage : "+youngestMaleStudentInElectronicDepartment.getPercTillDate());

        System.out.println();
        System.out.println("===========================================================================================");

        //How many male and female students are there in the computer science department
        Map<String, Long> countMaleFemaleStudentsInComputerScience =
                studentList.stream()
                        .filter(e -> e.getEngDepartment()=="Computer Science")
                        .collect(Collectors.groupingBy(Student::getGender, Collectors.counting()));

        System.out.println("Male & Female Students in Computer Science Department: ");
        System.out.println(countMaleFemaleStudentsInComputerScience);
    }
}
