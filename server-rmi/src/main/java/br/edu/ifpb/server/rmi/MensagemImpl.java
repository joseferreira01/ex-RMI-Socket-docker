/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.server.rmi;

import br.edu.ifpb.shared.Mensagem;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author jose
 */
public class MensagemImpl extends UnicastRemoteObject implements Mensagem{
    private String msg;
   public MensagemImpl(String msg) throws RemoteException{
       this.msg = msg;
   }

    @Override
    public String ler() throws RemoteException {
       return this.msg;
    }
    
}
