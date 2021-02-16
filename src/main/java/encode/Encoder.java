package encode;

import java.io.*;

public class Encoder {
    private final String inputFilePath;
    private final String outputFilePath;

    public Encoder(String inputFilePath, String outputFilePath){
        this.inputFilePath = inputFilePath;
        this.outputFilePath = outputFilePath;
    }

    /**
     * Karakterek eltolása eggyel és ennek rögzítése az outputfile-ba.
     */
    public void encode(){
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader(inputFilePath);
            BufferedReader br=new BufferedReader(fr);
            fw = new FileWriter(outputFilePath);
            BufferedWriter bw=new BufferedWriter(fw);
            int i;
            //Végig megyünk a charactereken és eltoljuk eggyel
            while ((i=br.read()) != -1) {
                bw.append((char)(i+1));
            }
            bw.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found:" + e.getMessage());
        } catch (IOException e){
            System.out.println("IO Exception: "+ e.getMessage());
        }
    }
}
