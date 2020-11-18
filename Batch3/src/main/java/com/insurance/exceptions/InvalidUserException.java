package com.insurance.exceptions;

public class InvalidUserException extends Exception{
    public String toString(){
    	return "Invalid Username or Password";
    }
}
