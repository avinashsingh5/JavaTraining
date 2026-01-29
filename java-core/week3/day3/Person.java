class Hidden {
    private String name;
    private int age;
    private String country;

    // Setter 
    public void setValues(String name, int age, String country) {
        if (name == null || name.isEmpty()) {
            this.name = "user";
        } else {
            this.name = name;
        }

        if (age <= 0) {
            this.age = 17;
        } else {
            this.age = age;
        }

        if (country == null || country.isEmpty()) {
            this.country = "India";
        } else {
            this.country = country;
        }
    }

    // Getter
    public void getValues() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Country: " + this.country);
    }
}

public class Person {
    public static void main(String[] args) {
        Hidden h1 = new Hidden();
        h1.setValues("Avinash", 18, "India"); 
    }
}
