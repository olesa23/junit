package by.academy.homework7.Task2;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class UMain {
    public static void main(String[] args) {

        User user = new User();
        Class<User> userClass = User.class;


        try {
            //getField("name") возвращает только public переменные.
            // Даже если поле с таким именем есть, но оно не публичное,
            // бросит NoSuchFieldException

            System.out.println("//getField(\"name\")" + "\n");

            Field loginField = userClass.getField("login");
            System.out.println(loginField);

//            Field passwordField = userClass.getField("password");//приват,будет NoSuchFieldException
//            System.out.println(passwordField);


            Field emailField = userClass.getField("email");
            System.out.println(emailField);

            //  Field firstNameField = userClass.getField("firstName");// приват, будет NoSuchFieldException
            // System.out.println(firstNameField);

            Field lastNameField = userClass.getField("lastName");
            System.out.println(lastNameField);

//            Field ageField = userClass.getField("age");//протектед, будет NoSuchFieldException
//            System.out.println(ageField);

            Field dateOfBirthField = userClass.getField("dateOfBirth");
            System.out.println(dateOfBirthField);

            //getMethod("name")  возвращает только публичные методы.
            // Если такого метода нет или он не публичный, мы получим NoSuchMethodException.

            System.out.println("//getMethod(\"name\")" + "\n");

            Method getLoginMethod = userClass.getMethod("getLogin");
            System.out.println(getLoginMethod);

//           Method getPasswordMethod = userClass.getMethod("getPassword");//приват,будет NoSuchFieldException
//           System.out.println(getPasswordMethod);

            Method getEmailMethod = userClass.getMethod("getEmail");
            System.out.println(getEmailMethod);

            Method getFirstNamenMethod = userClass.getMethod("getFirstName");
            System.out.println(getFirstNamenMethod);

            Method getLastMethod = userClass.getMethod("getLastName");
            System.out.println(getLastMethod);

            Method getAgeMethod = userClass.getMethod("getAge");
            System.out.println(getAgeMethod);

            Method getDateOfBirthMethod = userClass.getMethod("getDateOfBirth");
            System.out.println(getDateOfBirthMethod);

            //getDeclaredMethod("name")принимает имя и var-args с типами параметров метода.
            // Если такого метода в классе нет, мы получим checked NoSuchMethodException.

            System.out.println("//getDeclaredMethod(\"name\")" + "\n");

            Method getLoginDeclaredMethod = userClass.getDeclaredMethod("getLogin");
            System.out.println(getLoginDeclaredMethod);

            Method getPasswordDeclaredMethod = userClass.getDeclaredMethod("getPassword");//приват
            System.out.println(getPasswordDeclaredMethod);

            Method getEmailDeclaredMethod = userClass.getDeclaredMethod("getEmail");
            System.out.println(getEmailDeclaredMethod);

//            Method getFirstNameDeclaredMethod = userClass.getDeclaredMethod("getFirstName");//NoSuchMethodException.
//            System.out.println(getFirstNameDeclaredMethod);

//            Method getLastNameDeclaredMethod = userClass.getDeclaredMethod("getLastName");//NoSuchMethodException.
//            System.out.println(getLastNameDeclaredMethod);

//            Method getPrintUserInfoMethod = userClass.getMethod("getPrintUserInfo");//NoSuchMethodException.
//            System.out.println(getPrintUserInfoMethod);

            //getDeclaredField(name)Метод возвращает переменную по её имени.
            // Если переменной с таким именем нет, то метод выбросит checked NoSuchFieldException

            System.out.println("//getDeclaredField(name)" + "\n");
//           Field firstNameDeclaredField = userClass.getDeclaredField("firstName");// приват NoSuchMethodException.
//           System.out.println(firstNameDeclaredField);


            Field loginDeclaredField = userClass.getDeclaredField("login");
            System.out.println(loginDeclaredField);

            Field passwordDeclaredField = userClass.getDeclaredField("password");//приват
            System.out.println(passwordDeclaredField);

            Field emailDeclaredField = userClass.getDeclaredField("email");
            System.out.println(emailDeclaredField);


        } catch (NoSuchFieldException | NoSuchMethodException e) {
            e.printStackTrace();
        }
        //getFields() возвращает только public переменные
        System.out.println("//getFields()" + "\n");
        Field[] fields = userClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        //getMethods()Метод возвращает все public методы класса и public методы
        // его родительского класса/интерфейсов
        System.out.println("//getMethods()" + "\n");
        Method[] methods = userClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
        //getDeclaredMethods()Метод возвращает все объявленнные методы в классе
        System.out.println("//getDeclaredMethods()" + "\n");
        Method[] declaredMethods = userClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }
        //getDeclaredFields() Метод возвращает все объявленные переменные в классе
        System.out.println("//getDeclaredFields()" + "\n");
        Field[] declaredFields = userClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
        try {
            Method printUserInfo = userClass.getMethod("printUserInfo");
            System.out.println(printUserInfo.invoke(user));

            Field passwordDeclaredField = userClass.getDeclaredField("password");//приват
            passwordDeclaredField.setAccessible(true);
            passwordDeclaredField.set(user, "Пороль 1111");
            System.out.println(passwordDeclaredField.get(user));


            Field loginField = userClass.getField("login");
            loginField.set(user, "Логин 2323");
            System.out.println(loginField.get(user));

            Field emailField = userClass.getField("email");
            emailField.set(user, 1234);
            System.out.println("Емэил  " + emailField.get(user));

//            Field firstNameDeclaredField = userClass.getDeclaredField("firstName");// приват
//            firstNameDeclaredField.setAccessible(true);
//            firstNameDeclaredField.set(user, "Olesia");
//            System.out.println(firstNameDeclaredField.get(user));

            Field lastNameField = userClass.getField("lastName");
            lastNameField.set(user, "LastName Курчевская");
            System.out.println(lastNameField.get(user));

//            Field ageDeclaredField = userClass.getDeclaredField("age");//протектед
//            ageDeclaredField.setAccessible(true);
//            ageDeclaredField.set(user,34);
//            System.out.println(ageDeclaredField.get(user));

            Field dateOfBirthField = userClass.getField("dateOfBirth");
            dateOfBirthField.set(user, "DateOfBirth 23-06-1989");
            System.out.println(dateOfBirthField.get(user));


            Method method = userClass.getMethod("toString");
            System.out.println(method.invoke(user));

        } catch (NoSuchFieldException | SecurityException | IllegalArgumentException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}

