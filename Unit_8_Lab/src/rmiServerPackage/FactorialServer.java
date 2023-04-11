package rmiServerPackage;


import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import rmiPackage.FactorialImplementation;

public class FactorialServer {

   public FactorialServer() {}

   public static void main(String[] args) {
      try {
         // Create an instance of the implementation class
         FactorialImplementation obj = new FactorialImplementation();

         // Bind the remote object's stub in the registry
         Registry registry = LocateRegistry.createRegistry(1092);
         registry.bind("Factorial", obj);

         System.err.println("Server ready");
      } catch (Exception e) {
         System.err.println("Server exception: " + e.toString());
         e.printStackTrace();
      }
   }
}

