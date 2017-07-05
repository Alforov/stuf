package com.cs.alf;
import java.net.*;
import java.io.*;

public class Client {
    public static void main(String[] ar) {
        int serverPort = 8085; // здесь обязательно нужно указать порт к которому привязывается сервер.
        String address = "alligator"; // это IP-адрес компьютера, где исполняется наша серверная программа.
        // Здесь указан адрес того самого компьютера где будет исполняться и клиент.

        try {
            InetAddress ipAddress = InetAddress.getByName(address); // создаем объект который отображает вышеописанный IP-адрес.
            System.out.println("Any of you heard of a socket with IP address " + address + " and port " + serverPort + "?");
            Socket socket = new Socket(ipAddress, serverPort); // создаем сокет используя IP-адрес и порт сервера.
            System.out.println("Yes! I just got hold of the program.");

            // Берем входной и выходной потоки сокета, теперь можем получать и отсылать данные клиентом.
            InputStream sin = socket.getInputStream();
            OutputStream sout = socket.getOutputStream();

            // Конвертируем потоки в другой тип, чтоб легче обрабатывать текстовые сообщения.
            DataInputStream in = new DataInputStream(sin);
            DataOutputStream out = new DataOutputStream(sout);

            // Создаем поток для чтения с клавиатуры.
            String line = null;
            System.out.println("Type in something and press enter. Will send it to the server and tell ya what it thinks.");
            System.out.println();
                line = "<?xml version=\"1.0\" encoding=\"windows-1251\"?>\n" +
                        "<REQUEST OBJECT_CLASS=\"TMoneyOrderObject\" ACTION=\"CalcFee\" USER_ID=\"-1\" POINT_CODE=\"ваша тестовая точка (код)\" INT_SOFT_ID=\"присвоенный идентификационный параметр\" TO_BANK_CODE=\"CDPA\" TRANSACTION_AMOUNT=\"1234.00\" TRANSACTION_CUR=\"RUR\" ENTER_CUR=\"RUR\">\n" +
                        "\t<sIDwhom>ОУФМС</sIDwhom>\n" +
                        "\t<sIDtype>Паспорт гражданина РФ</sIDtype>\n" +
                        "\t<sIDtypeCode>RU.1</sIDtypeCode>\n" +
                        "\t<sCountry>RU</sCountry>\n" +
                        "\t<trnCurrency>RUR</trnCurrency>\n" +
                        "\t<trnSendPoint>ваша тестовая точка (код)</trnSendPoint>\n" +
                        "\t<sName>БЕЛКИН</sName>\n" +
                        "\t<sLastName>СЕРГЕЙ</sLastName>\n" +
                        "\t<sSurName>ПЕТРОВИЧ</sSurName>\n" +
                        "\t<trnAmount>1234.00</trnAmount>\n" +
                        "\t<trnDate>текущая дата в формате YYYYMMDD</trnDate>\n" +
                        "\t<sAddress>САДОВАЯ 14 КВ.10</sAddress>\n" +
                        "\t<trnClCurrency>RUR</trnClCurrency>\n" +
                        "\t<trnRate>1.0</trnRate>\n" +
                        "\t<sIDnumber>1234 567890</sIDnumber>\n" +
                        "\t<sCountryC>RU</sCountryC>\n" +
                        "\t<sResidentC>RU</sResidentC>\n" +
                        "\t<sIDdate>20140202</sIDdate>\n" +
                        "\t<trnPickupPoint>CDPA</trnPickupPoint>\n" +
                        "\t<sBirthday>19940101</sBirthday>\n" +
                        "\t<sPhone>7-916-1234567</sPhone>\n" +
                        "\t<trnService>2</trnService>\n" +
                        "\t<bName>ЗАЙЦЕВ</bName>\n" +
                        "\t<bLastName>ВЛАДИМИР</bLastName>\n" +
                        "\t<bSurName>ИВАНОВИЧ</bSurName>\n" +
                        "</REQUEST>"; // ждем пока пользователь введет что-то и нажмет кнопку Enter.
                System.out.println("Sending this line to the server...");
                out.writeUTF(line); // отсылаем введенную строку текста серверу.
                out.flush(); // заставляем поток закончить передачу данных.
                line = in.readUTF(); // ждем пока сервер отошлет строку текста.
                System.out.println("response : " + line);
                System.out.println();
        } catch (Exception x) {
            x.printStackTrace();
        }
    }
}