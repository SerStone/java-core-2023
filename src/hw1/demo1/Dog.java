package hw1.demo1;

public class Dog {

  private String name;
  private int age;
  private String  bride;

  public Dog(String name, int age, String bride) {
      this.name = name;
      this.age = age;
      this.bride = bride;
  }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBride() {
        return bride;
    }

    public void setBride(String bride) {
        this.bride = bride;
    }
}