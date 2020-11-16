package pt.ulusofona.lp2.theWalkingDEISIGame;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    static ArrayList<TWDGameManager> status = new ArrayList<>();
    static int linhasIgnoradas = 0;
    static int linhasIgnoradas1 = 0;
    static int linhasIgnoradas2 = 0;
    static int linhasIgnoradas3 = 0;
    static int linhasIgnoradas4 = 0;
    static int linhasIgnoradas5 = 0;
    static HashMap<String, TWDGameManager> statusPorId = new HashMap<>();
    public static ArrayList<TWDGameManager> getStatus() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("testestatus.txt"));
            String line = null;
            line = reader.readLine();
            while (line != null) {
                String[] info = line.split(",");
                if (info.length == 5) {
                    int id = Integer.parseInt(info[0].trim());
                    String titulo = info[1];
                    if (!statusPorId.containsKey(titulo)) {
                        TWDGameManager statusCon = new TWDGameManager(titulo, id);
                        status.add(statusCon);
                        statusPorId.put(titulo, statusCon);
                    }

                } else {
                    linhasIgnoradas++;
                }
                line = reader.readLine();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        return status;
    }
}

