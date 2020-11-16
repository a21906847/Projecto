package pt.ulusofona.lp2.theWalkingDEISIGame;

import java.io.File;
import java.lang.reflect.Array;
import java.util.List;

public class TWDGameManager {
    String nome;
    int status;

    TWDGameManager(String nome,int status){
        this.status=status;
        this.nome=nome;
    }
    TWDGameManager(){

    }
    String vivoOuMorto(int status){
        if (status==1) {
            return "Humano";
        }
        return "Zombie";
    }

    public boolean startGame(File ficheiroInicial){
        return false;
    }

    public int[] getWorldSize(){
        int[] numeros = new int[] { 3, 6, 7 };
        return numeros;
    }

    public int getInitialTeam(){
        return 0;
    }

    public List<Humano> getHumans(){
        return null;
    }
    public List<Zombie> getZombies(){
        return null;
    }
    public boolean move(int xO, int yO, int xD, int yD){
        return false;
    }
    public boolean gameIsOver(){
        return false;
    }
    public List<String> getAuthors(){
        return null;
    }
    public int getCurrentTeamId(){
        return 0;
    }
    public int getElementId(int x, int y){
        return 0;
    }
    public List<String> getSurvivors(){
        return null;
    }
    public boolean isDay(){
        return false;
    }
    public boolean hasEquipment(int creatureId, int equipmentTypeId){
        return false;
    }
    @Override
    public String toString() {
        return nome+":"+vivoOuMorto(status);
    }
}
