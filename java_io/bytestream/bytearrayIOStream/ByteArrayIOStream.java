package java_io.bytestream.bytearrayIOStream;

import java.io.*;

public class ByteArrayIOStream {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream bOut = new ByteArrayOutputStream();
        String output = "India is a good country";
        byte ch[] = output.getBytes();
        bOut.write(ch);
        bOut.writeTo(new FileOutputStream("rabri.txt"));
        bOut.writeTo(new FileOutputStream("rabri123.txt"));
        System.out.println(bOut.toString());
        byte z[] = bOut.toByteArray();
        ByteArrayInputStream fileReader = new ByteArrayInputStream(z);
        int i =0;
        while((i=fileReader.read())!=-1){
            System.out.println((char)i);
        }

    }
}