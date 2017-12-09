package ru.job4j.collectiosss;


import java.util.*;


public class SortUser {
    Set<User> sort(List<User> list) {
        list = new ArrayList<User>();
        list.add(new User(10, "Bob"));
        list.add(new User(15, "Sam"));
        list.add(new User(8, "Grek"));
        // Set<User> set = new TreeSet<User>(list);

        //  Collections.sort(list);
        //  System.out.println((set));
        // return set;
        return new TreeSet(list);
    }


        public List<User> sortNameLength(List<User> list) {
        list = new ArrayList<User>();
        list.add(new User(10, "Bobasasasas"));
        list.add(new User(15, "Sam"));
        list.add(new User(8, "Grek"));
        list.add(new User(8, "Grek11"));
        list.add(new User(8, "Grek112655454545"));


        list.sort(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                if (o1.getName().length() > o2.getName().length())
                    return 1;
                if (o1.getName().length() < o2.getName().length())
                    return -1;
                else
                    return 0;
            }
        });
        System.out.println(list);
        return list;

    }

      public List<User> sortByAllFields(List<User> list) {
        list = new ArrayList<User>();
        list.add(new User(10, "Bobasasasas"));
        list.add(new User(15, "Sam"));
        list.add(new User(4, "Grek"));
        list.add(new User(25, "Grek11"));
        list.add(new User(8, "Grek112655454545"));
        list.sort(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                if (o1.name.compareTo(o2.name) == 1) {
                    return 1;
                }
                if (o1.name.compareTo(o2.name) == -1) {
                    return -1;
                } else if (Integer.valueOf(o1.age) > Integer.valueOf(o2.age) && o1.name.compareTo(o2.name) == 0) {
                    return 1;
                } else if (Integer.valueOf(o1.age) < Integer.valueOf(o2.age) && o1.name.compareTo(o2.name) == 0) {
                    return -1;
                } else
                    return 0;

            }
        });
        System.out.println(list);
        return list;
    }





    public  static class User implements Comparable<User> {


        int age;

        @Override
        public String toString() {
            return "User{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }

        String name;

        public User(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }


        @Override
        public int compareTo( User o) {
            if (this.getAge() > o.getAge())
                return 1;
            if (this.getAge() < o.getAge())
                return -1;
            else
                return 0;
        }




    }
}



