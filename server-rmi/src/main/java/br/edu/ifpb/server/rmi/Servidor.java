/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.server.rmi;

import br.edu.ifpb.shared.Mensagem;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author jose
 */
public class Servidor {
 
    public static void main(String args[]){
        try{
            
            Mensagem msg= new MensagemImpl("Oi");
            Registry registro = LocateRegistry.createRegistry(10998);
            // Registra nome do servidor
            registro.rebind("ServidorHello", msg);
            System.out.println("Servidor remoto pronto.");
        }
        catch(RemoteException e){
            System.out.println("Exceção remota: " + e);
        }
    }
}
