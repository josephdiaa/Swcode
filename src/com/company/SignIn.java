package com.company;

public interface SignIn {
   public default boolean logIn(){
      return false;
   }
}
