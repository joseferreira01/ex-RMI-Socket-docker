/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.cliente.rmi;


import br.edu.ifpb.shared.Mensagem;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jose
 */
public class Cliente {
    public static void main(String[] args) {
        
        try {
              Registry registro = LocateRegistry.getRegistry("127.0.0.1", 10998);
            Mensagem msg = (Mensagem) registro.lookup("ServidorHello");
            System.err.println("Mensagem do Servidor: "+msg.ler());
        } catch (RemoteException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
