/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.socket.cliente;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 *
 * @author jose
 */
public class Cliente {

    public static void main(String[] args) throws IOException {
//        Socket socket = new Socket("localhost", 10999);
        Socket socket = new Socket("host-server-socket", 10999);
        InputStream input = socket.getInputStream();
        OutputStream outInput = socket.getOutputStream();
        outInput.write("HELO".getBytes());
        byte[] b = new byte[1024];
        input.read(b);
        System.out.println("saida " + new String(b));
        socket.close();
    }
}
