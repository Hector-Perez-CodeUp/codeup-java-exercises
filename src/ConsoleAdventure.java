import java.util.Scanner;

public class ConsoleAdventure {
    public static void main(String args[]) {
        System.out.println("  _____            _    _   _                                                                         \n" +
                " |  __ \\     /\\   | |  | | | |                                                                        \n" +
                " | |__) |   /  \\  | |__| | | |                                                                        \n" +
                " |  _  /   / /\\ \\ |  __  | | |                                                                        \n" +
                " | | \\ \\  / ____ \\| |  | | |_|                                                                        \n" +
                " |_|  \\_\\/_/ __ \\_\\_|  |_| (_) _               _____                        _____ _                   \n" +
                "     /\\     |  \\/  |          (_)             / ____|                      / ____| |                  \n" +
                "    /  \\    | \\  / | __ _ _ __ _ _ __   ___  | |     ___  _ __ _ __  ___  | (___ | |_ ___  _ __ _   _ \n" +
                "   / /\\ \\   | |\\/| |/ _` | '__| | '_ \\ / _ \\ | |    / _ \\| '__| '_ \\/ __|  \\___ \\| __/ _ \\| '__| | | |\n" +
                "  / ____ \\  | |  | | (_| | |  | | | | |  __/ | |___| (_) | |  | |_) \\__ \\  ____) | || (_) | |  | |_| |\n" +
                " /_/    \\_\\ |_|  |_|\\__,_|_|  |_|_| |_|\\___|  \\_____\\___/|_|  | .__/|___/ |_____/ \\__\\___/|_|   \\__, |\n" +
                "                                                              | |                                __/ |\n" +
                "                                                              |_|                               |___/ ");

        System.out.println("Enter your last name to play:  ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Well, welcome to the Marine Corps, Recruit " + name + ".  You ship off in 15 minutes.  \n**The recruiter walks to the back of the office.  Muffled words can be heard through the walls.**  \n'Yo Simmons, got another one!..  Nah no questions, they just signed... Said something about a text-adventure game,\n I don't know.  Weird kid.'**\n");

        System.out.println("I'm not entirely sure what we've got ourselves into here, but how am I supposed to know, I'm just the voice in \nyour head.  Really oughtta get that checked out.  But in the meantime, enough with all this 'be yourself crap'.  \nLet's reinvent.  Tell me about yourself:\n");

        System.out.println("A.  The monitor of the hallowed halls of high school, the enforcer of all dress code regulations, the chosen wielder of the whistle lanyard which slays all running through the school in an instant, he is... THE ROTC KID.");
        System.out.println("B.  You're the average American.  Not exactly eager to lay your life for country, but you will be a glorified janitor and get screamed at for 4 yours for some college.  Hey, maybe one day even join a coding bootcamp and continue to cry yourself to sleep every night.  You are the...DOING IT FOR THE BENEFITS GUY");
        System.out.println("C.  Let's be honest.  You got a high enough ASVAB score.  What are you doing here next to these crayon eaters?  Most these people's parents dropped them off then moved away.  Oh, yea, you're the...GOT LOST ON THE WAY TO THE AIR FORCE OFFICE DUDE.");

        System.out.println("Choose your preferred Devil Dog: ");
        String charName = "";
        int motivation = 0;
        int happiness = 0;
        int energyDrinks = 3;
        String characterNum = scanner.next();
        boolean confirmChoice = false;
        while (!confirmChoice) {
            if (characterNum.equalsIgnoreCase("a")) {
                charName = "The ROTC Kid.";
                motivation += 10;
                happiness += 4;
                System.out.println("        _.---._\n" +
                        "     .-' ((O)) '-.\n" +
                        "      \\ _.\\_/._ /\n" +
                        "       /..___..\\\n" +
                        "       ;-.___.-;\n" +
                        "      (| e ) e |)     .;.\n" +
                        "       \\  /_   /      ||||\n" +
                        "       _\\__-__/_    (\\|'-|\n" +
                        "     /` / \\V/ \\ `\\   \\ )/\n" +
                        "    /   \\  Y  /   \\  /=/\n" +
                        "   /  |  \\ | / {}  \\/ /\n" +
                        "  /  /|   `|'   |\\   /\n" +
                        "  \\  \\|    |.   | \\_/\n" +
                        "   \\ /\\    |.   |\n" +
                        "    \\_/\\   |.   |\n" +
                        "    /)_/   |    |\n" +
                        "   // ',__.'.__,'\n" +
                        "  //   |   |   |\n" +
                        " //    |   |   |\n" +
                        "(/     |   |   |\n" +
                        "       |   |   |\n" +
                        "       | _ | _ |\n" +
                        "       |   |   |\n" +
                        "       |   |   |\n" +
                        "       |   |   |\n" +
                        "       |___|___|\n" +
                        "       /  J L  \\\n" +
                        "      (__/   \\__)");
                System.out.println("With a shirt tucked deep, pants buckled up to the heavens, and an urge to tattle that would have Randall from the show RECESS envious, you prepare yourself.  You enter the fray with +10 to your 'Motivation' bar, and a meager +4 to your 'happiness' bar.  Who needs it anyway.");
            } else if (characterNum.equalsIgnoreCase("b")) {
                charName = "Did it for the Benefits Guy";
                motivation += 6;
                happiness += 8;
                System.out.println("      ////^\\\\\\\\\n" +
                        "      | ^   ^ |\n" +
                        "     @ (o) (o) @\n" +
                        "      |   <   |\n" +
                        "      |  ___  |\n" +
                        "       \\_____/\n" +
                        "     ____|  |____\n" +
                        "    /    \\__/    \\\n" +
                        "   /              \\\n" +
                        "  /\\_/|        |\\_/\\\n" +
                        " / /  |        |  \\ \\\n" +
                        "( <   |        |   > )\n" +
                        " \\ \\  |        |  / /\n" +
                        "  \\ \\ |________| / /\n" +
                        "   \\ \\|");
                System.out.println("You are skeptical, but happy to even have such an opportunity like this.  You tell yourself, if I can stay out of trouble, meet the right friends, I can walk out of here on top.  Hey, maybe even have a good time and re-enlist?  You poor sap, have no idea what lies ahead.  You receive a skeptical +6 to motivation and +8 to happiness...for now.");
            } else if (characterNum.equalsIgnoreCase("c")) {
                charName = "Got Lost On The Way To The Air Force Office Dude.";
                motivation += 7;
                happiness += 7;
                System.out.println(
                        "                        ;;\\\\/;;;;;;;;\n" +
                        "                   ;;;;;;;;;;;;;;;;;\n" +
                        "                ;;;;;;;;;;;;     ;;;;;\n" +
                        "               ;;;;;    ;;;         \\;;\n" +
                        "              ;;;;;      ;;          |;\n" +
                        "             ;;;;         ;          |\n" +
                        "             ;;;                     |\n" +
                        "              ;;                     )\n" +
                        "               \\    ~~~~ ~~~~~~~    /\n" +
                        "                \\    ~~~~~~~  ~~   /\n" +
                        "              |\\ \\                / /|\n" +
                        "               \\\\| %%%%%    %%%%% |//\n" +
                        "              [[====================]]\n" +
                        "               | |  ^          ^  |\n" +
                        "               | | :@: |/  \\| :@: | |\n" +
                        "                \\______/\\  /\\______/\n" +
                        "                 |     (@\\/@)     |\n" +
                        "                /                  \\\n" +
                        "               /  ;-----\\  ______;  \\\n" +
                        "               \\         \\/         /\n" +
                        "                )                  (\n" +
                        "               /                    \\\n" +
                        "               \\__                  /\n" +
                        "                \\_                _/\n" +
                        "                 \\______/\\/\\______/\n" +
                        "                  _|    /--\\    |_\n" +
                        "                 /%%\\  /\"'\"'\\  /%%\\\n" +
                        "  ______________/%%%%\\/\\'\"'\"/\\/%%%%\\______________\n" +
                        " / :  :  :  /  .\\%%%%%%%\\\"'/%%%%%%%/.  \\  :  :  : \\\n" +
                        ")  :  :  :  \\.  .\\%%%%%%/'\"\\%%%%%%/.  ./  :  :  :  (");
                System.out.println("Again, why are you here?  You've taken multiple AP courses, and the guy next to you almost drowned in the rain.  Anyways, you maintain an intelligent balance between +7 motivation and +7 happiness.");
            } //Add a catch all 'else' statement to ask for valid input

            System.out.println("Are you happy with your choice? [y/n]");
            String choiceYorN = scanner.next();

            if (choiceYorN.equalsIgnoreCase("y")) {
                confirmChoice = true;
                System.out.printf("Confirmed!  You have selected the '%s' Your Devil Dog has %d Happiness Points, %d Motivation Points , and %d energy drinks to sustain the good fight.%n", charName, happiness, motivation, energyDrinks);

//            } else {
//                System.out.println("Which warrior would you like to choose, then?");
//                confirmChoice = scanner.next();
//                scanner.nextLine();
//            }
            }


        }
    }
};