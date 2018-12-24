/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sd.proyecto.servidor;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author David
 */
public class SDProyectoServidor extends UnicastRemoteObject implements RMIInterface{

    /**
     * Constructor
     * @throws RemoteException 
     */
    protected SDProyectoServidor() throws RemoteException {
        super();
    }
    
    //Atributos
    private static String ip = "localhost";
    
    /**
     * 
     * @param name
     * @return
     * @throws RemoteException 
     */
    @Override
    public String testConnection(String name) throws RemoteException{

        System.err.println(name + " is trying to contact!");
        return "conexión correcta con " + name;

    }
    
    /**
     * Main method
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            
            //System.setProperty("java.rmi.server.hostname",ip);
            Naming.rebind("//"+ip+":4000/MyServer", new SDProyectoServidor());            
            System.err.println("Server ready");

        } catch (Exception e) {

            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();

        }
    }
    
}
