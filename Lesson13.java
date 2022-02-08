package com.company;

public class Lesson13 {

    // Lets make generic Record class, with different value
    public static class Record <V>{
        //fields
        private String key;
        private V value;

        //constructors
        public Record(String key, V value){
            this.key = key;
            this.value = value;
            System.out.println("The record successfully saved.");
        }

        //methods

        public String toString(){
            return "["+key+":"+value+"]";
        }
        public int compareTo (Record<V> other){
            return this.key.compareTo(other.key);
        }
        public V getValue(){
            return this.value;
        }
        public void setValue(V value){
            this.value = value;
        }
        public String getKey(){
            return this.key;
        }
        public void setKey(String key){
            this.key = key;}
        public boolean equalTo(Record<V> other){
            return this.key.equals(other.key) & this.value.equals(other.key);
        }
    }

    public static class PhoneNumber{
        //fields
        private String phoneNumber;

        //constructors
        public PhoneNumber(String phoneNumber){
            if(!isLeagel(phoneNumber))
                throw new IllegalArgumentException("Phone number unvalid.");
            this.phoneNumber = phoneNumber;
        }

        //methods

        public String toString(){return this.phoneNumber;}
        public String getPhoneNumber(){return this.phoneNumber;}
        private boolean isLeagel(String phoneNumber) {
            return phoneNumber.charAt(0) == '0' & phoneNumber.length() == 9 | phoneNumber.length() == 10;
        }
    }

    public static class ContactPerson extends Record<PhoneNumber>{
        //Fields
        private String contactType;
        //Constructors
        public ContactPerson (String name, PhoneNumber phoneNumber ,
                       String contactType){
            super(name, phoneNumber);
        this.contactType = contactType;
        }

        //Methods
        public String getContactType(){
            return contactType;
        }
        public String toString(){
            return "["+getKey()+" "+getValue()+" "+getContactType()+"]";
        }
    }
}
