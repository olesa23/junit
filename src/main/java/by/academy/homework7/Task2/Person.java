package by.academy.homework7.Task2;

//a)	Создать свой класс Person с полями: firstName, lastName, age, dateOfBirth
//b)	Добавить класс User, который наследуется от Person, с полями: login, password, email
//c)	Добавить гетеры, сетеры. Добавить метод printUserInfo в User.
// Вывести с помощью рефлексии все поля и методы, сначала через
//getMethod("name")
//getMethods()
//getField("name")
//getFields()
//а затем через
//getDeclaredMethod("name")
//getDeclaredMethods()
//getDeclaredField("name")
//getDeclaredFields()
//Посмотреть разницу. Просетать все значения через Reflection. (set метод класса Field).
// Вывести значения полей через Reflection. (get метод класса Field). Вызвать toString через invoke.
public class Person {
    private String firstName;
    public String lastName;
    protected int age;
    public String dateOfBirth;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}

