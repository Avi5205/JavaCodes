package com.jtcindia.jdbc;
class InsufficientFundsException extends Exception{
    public InsufficientFundsException(){}
    public String toString(){
        return "Sufficient Funds are not Available";
    }
}

public class JTC25 {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.transfer(11,22,33);
    }
}
class InvalidAccountNumberException extends Exception{
    int accno;
    public InvalidAccountNumberException() {}
    InvalidAccountNumberException(int accno){
        this.accno = accno;
    }
    public String toString(){
        return "Accno:"+accno+" is Not Found";
    }
}
