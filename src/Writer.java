/*
* File: Writer.java
* Author: Lengyel István
* Copyright: 2026, Lengyel István
* Group: Szoft / IIN
* Date: 2026-10-07
* Github: https://github.com/Bletox/Dolgozat_Writer.git
* Licenc: MIT
*/

import java.io.FileWriter;
import java.io.IOException;

public class Writer implements Writable {
    private final String fileName;

    public Writer(String fileName) {
        this.fileName = fileName;
    }

    @Override 
    public void writerContent(String content) {
        try (FileWriter fw = new FileWriter(this.fileName, true)) {
            fw.write(content + System.lineSeparator());
            System.out.println("Sikeresen kiíratva a " + this.fileName + " fájlba.");
        } catch (IOException e) {
            System.err.println("Hiba történt a fájlba írás során: " + e.getMessage());
        }
    }
}

