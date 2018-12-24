/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sd.proyecto.servidor;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Ramon
 */
public interface RMIInterface extends Remote {
    
     public String testConnection(String name) throws RemoteException;
     
}
