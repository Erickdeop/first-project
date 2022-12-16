package tabia.app;

import java.util.Scanner;

public class Player {
    private String playerName;
    private String email;
    private String password;
    private int playerNumber;

    public Player(String playerName){
        this.playerName = playerName;
    }
    public int getPlayerNumber(){return playerNumber;}
    public void setPlayerNumber(){
        Scanner input = new Scanner(System.in);
        int number = 0;
        boolean cond = true;
        while (cond){
            System.out.print("Choose an integer number between 1 and 100: ");
            // Verify if input value is int
            String value = input.nextLine();
            Validator validator = new Validator();
            if (validator.isNumeric(value) == true){
                // Verify if the value is greater than 0 and lesser or equal to 100
                int valueInt = Integer.parseInt(value);

                if (valueInt > 0 && valueInt <= 100){
                    number = valueInt;
                    cond = false;
                }
                else{
                    System.out.println("Choose a valid number.\n");
                }
            }
            else{
                System.out.println("Enter an int number.\n");
            }
        }
        playerNumber = number;
    }
    public String getName() {return playerName;}
    public void setName(String name) {this.playerName = name;}

    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}

    public String getPassword() {return password;}
    public void setPassword(String password){this.password = password;}


}
