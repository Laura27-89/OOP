package com.ucreativa.familia;

public class Jorge {

    private int age;
    private String hobby;

        public Jorge(String saludo) {
            this.age = 60;
            this.hobby = "Jugar Futball";
            System.out.println(saludo);
        }

    public void setAge() {
            this.age = this.age +1;
    }

    public int getAge(){
            return this.age;
        }

    public String getHobby() {
        return this.hobby;
    }
}
