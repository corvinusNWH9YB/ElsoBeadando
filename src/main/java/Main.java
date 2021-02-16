import encode.Encoder;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String [] args){
        Path currentRelativePath = Paths.get("");
        String currentFullPath = currentRelativePath.toAbsolutePath().toString();
        String inputFilePath = currentFullPath+"/input.txt";
        String outputFilePath = currentFullPath+"/output.txt";
        Encoder encoder = new Encoder(inputFilePath, outputFilePath);
        encoder.encode();
    }
}
