package com.company;

public class Lesson18 {
    public static class Access{
        protected String secret;

        public Access(String secret){
            this.secret = secret;
        }

        public static void publico_static(){
            System.out.println("im publico, you dont even need to be in my class");
        }
        public void publico(){
            System.out.println("im publico, but you in my class");
        }
        private static void privato(){
            System.out.println("im privato, you cant access directly to me");
        }
        protected static void protcto(){
            System.out.println("We are in the same package, so ok");
        }
        public void to_privato(){
            System.out.println("im gonna call protcto");
            privato();
        }
    }
}
