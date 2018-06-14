/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.socket.server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jose
 */
public class Servidor {

    private static Logger logger = Logger.getLogger("Lo");

    public static void main(String[] args) {
         logger.info("servidor ativo ");
        try {
            ServerSocket serverSocket = new ServerSocket(10999);
            logger.info("esperando cliente ");
            Socket socket = serverSocket.accept();
            logger.info("Cliente conectado ");
            InputStream inputStream = socket.getInputStream();
            OutputStream OutputStream = socket.getOutputStream();

            byte[] b = new byte[1024];
            inputStream.read(b);
            if ("HELO".equals(new String(b).trim())) {
                OutputStream.write("ok".getBytes());
            } else {
                OutputStream.write("erro".getBytes());
            }
            serverSocket.close();

        } catch (IOException ex) {
            Logger.getLogger(ex.getMessage());
        }
    }
}
