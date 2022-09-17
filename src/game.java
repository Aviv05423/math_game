import java.util.*;
class game {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int game_level = 0;
        int score = 0;
        System.out.println("select level 1-3 of the game!");


        boolean game_level_val = true;
        while(game_level_val) {
        try {
            game_level = input.nextInt();
            game_level_val = false;

        } catch (Exception e) {
            System.out.println("select NUMBER 1, 2 or 3 Please. thank you");
            input.next();
        }}


        if (game_level == 1) {
            System.out.println("ok, we go now!");
            while (true) {
                System.out.println("""







                        """);
                System.out.println("To escape this nightmare just write \"Exit\"");
                System.out.println("scoreBoard: " + score);

                int num1 = random.nextInt(100);
                int num2 = random.nextInt(100);
                System.out.println("try this one:");
                System.out.println(num1 + " + " + num2 + "?");
                int unserNum = unserCheker();
//                int unser = input.nextInt();
                if (unserNum == (num1 + num2)) {
                    System.out.println("You are equal to God");
                    System.out.println("I gonna give u 2 points! ");
                    score = score + 2;

                } else {
                    System.out.println("are you stupid?");
                    System.out.println("i gonna take take back 5 points...");
                    score = score - 5;
                }
            }
        } else {
            System.out.println("Why the fu*k don't you pick 1? Are you a masochist?");
        }
    }

    public static int unserCheker(){
//        System.out.println("חזירים");
        Scanner input = new Scanner(System.in);
        int unser = 0;
        boolean game_unser_valid = false;
        while(!(game_unser_valid)) {

            try {
                String user_Unser = input.nextLine();
                user_Unser = user_Unser.toLowerCase();
                if (Objects.equals(user_Unser, "exit")){
                    System.out.println("goodbye my old friend (:");
                    System.exit(0);
                }
                else {
                    unser = Integer.parseInt(user_Unser);
                    game_unser_valid = true;
                }

            } catch (Exception e) {
                System.out.println("answer NUMBER Please. thank you \nTo escape this nightmare just write \"Exit\"");

            }}

        return unser;
    }

}



//1