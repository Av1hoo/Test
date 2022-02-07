package com.company;

public class Lesson11 {

    public static class Record{
        //fields
        private String key;
        private String value;

        //constructors
        public Record(String key, String value){
            this.key = key;
            this.value = value;
            System.out.println("The record successfully saved.");
        }

        //methods

        public String toString(){
            return "["+key+":"+value+"]";
        }
        public int compareTo (Record other){
            return this.key.compareTo(other.key);
        }
        public String getValue(){
            return this.value;
        }
        public void setValue(String value){
            this.value = value;
        }
        public String getKey(){
            return this.key;
        }
        public void setKey(String key){
            this.key = key;}
        public boolean equalTo(Record other){
            return this.key.equals(other.key) & this.value.equals(other.key);
        }

    }
}
