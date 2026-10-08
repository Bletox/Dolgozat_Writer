/*
* File: App.java
* Author: Lengyel István
* Copyright: 2026, Lengyel István
* Group: Szoft / IIN
* Date: 2026-10-07
* Github: https://github.com/Bletox/Dolgozat_Writer.git
* Licenc: MIT
*/

public class App {
    public static void main(String[] args) {
        System.out.println("Fájl kiíratás!");
        Writable writer = new Writer("writer.txt");
        

        writer.writerContent("Ez a szöveg a fájlba íródik az interfészen keresztül!");

    }
}

