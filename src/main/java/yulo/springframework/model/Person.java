package yulo.springframework.model;

/**
 * Created by yulo0717 on 10/24/2018.
 */
public class Person {
    private String name;
    private String lastName;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
