package HW1;
import java.lang.*;

    public class Wow {
        private String name;
        private String breed;
        private char sex;
        private int age;

        public Wow (String name, String breed, char sex, int age) {
            this.name = name;
            this.breed = breed;
            this.sex = sex;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getBreed() {
            return breed;
        }

        public void setBreed(String breed) {
            this.breed = breed;
        }

        public char getSex() {
            return sex;
        }

        public void setSex(char sex) {
            this.sex = sex;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Wow{" +
                    "name='" + name + '\'' +
                    ", breed='" + breed + '\'' +
                    ", sex=" + sex +
                    ", age=" + age +
                    '}';
        }
    }
