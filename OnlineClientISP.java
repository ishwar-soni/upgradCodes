package com.upGrad;

public class OnlineClientISP implements RestaurantISP {
    public void acceptOnlineOrder() {
        //logic for placing online order
    }
    public void takeTelephoneOrder() {
        //Not Applicable for Online Order
        throw new UnsupportedOperationException();
    }
    public void payOnline() {
        //logic for paying online
    }
    public void walkInCustomerOrder() {
        //Not Applicable for Online Order
        throw new UnsupportedOperationException();
    }
    public void payInPerson() {
        //Not Applicable for Online Order
        throw new UnsupportedOperationException();
    }

    public class Student
    {
        private Address address;
        public Student()
        {
            address = new Address();
        }
    }
}
