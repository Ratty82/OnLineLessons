public abstract class Person implements IPerson {
    protected String name;
    protected int age;
    protected String sex;
    protected String faculty;

    //конструктор с сеттерами
    public Person (String name,int age,String sex, String faculty){
        setName(name);
        setAge(age);
        setSex(sex);
        setFaculty(faculty);
    }
    
    //сеттеры с валидацией
    public void setName(String name){
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Имя не заполнено");
        }
        else {
            this.name = name;
        }   
    }

    public void setAge(int age){
        if (age <= 18 ) {
            throw new IllegalArgumentException("Возраст должен быть больше 18");
        }
        else {
            this.age = age;
        }  
    }

    public void setSex(String sex){
        if (sex == null ) {
            throw new IllegalArgumentException("Пол не должен быть равен null");
        }
        if (sex.isEmpty() || !(sex.equalsIgnoreCase("мужской") || sex.equalsIgnoreCase("женский"))) {
            throw new IllegalArgumentException("Пол введен неверно (нужно: мужской/женский)");
        }      
        else {
            this.sex = sex;
        }  
    }
              
    public void setFaculty(String faculty){
        if (faculty == null || faculty.isEmpty()) {
           throw new IllegalArgumentException("Факультет не заполнен");
        }
        else {
           this.faculty = faculty;
        }
        
    }

    //геттеры общие

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public String getFaculty() {
        return faculty;
    }

    //геттер общий - нужен ли но - вопрос?   
    public String getInfo(){
        return String.format("Имя: %s , Возраст: %s , Пол: %s",  name,age,sex );
     }

    //абстрактный метод для всех наследников
    public abstract String informAboutRole();


}
