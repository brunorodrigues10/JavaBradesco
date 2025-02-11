import java.time.OffsetDateTime;

public class Person {

    private final String name;

    private int age;

    private int lastYearAgeInc = OffsetDateTime.now().getYear();

    public  String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public Person(String name) {
        this.name = name;
        this.age = 1;
    }


    /*public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }*/

    private static String teste;

    public static void setTeste(String testeParam){
        teste = testeParam;
    }

    public static String getTeste(){
        return teste;
    }

    public void incAge() {
        if(this.lastYearAgeInc >= OffsetDateTime.now().getYear()) return;

        this.age += 1;
        this.lastYearAgeInc = OffsetDateTime.now().getYear();
    }

}
