package lab5.dop;

import lab5.dop.exceptions.*;

import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

public class CommandHandler {

    public static void callCommand(String command) throws IncorrectCommandException, CannotCreateFileException, IncorrectFileNameException, IOException, AccessFileException, FileReadingException {
        if(command != null && command.length() != 0) {

            String[] args = new String[5];
            int count = 0;

            while (command != null) {
                command = skipCharacter(command, ' ');
                args[count] = getNextWord(command);
                count++;
                command = skipWord(command);
                if (count == 5 && command != null) throw new IncorrectCommandException("Wrong command");
            }

            int length = (int) Arrays.stream(args).filter(Objects::nonNull).count();

            if (!args[0].equals("comb") || length < 4) throw new IncorrectCommandException("Wrong command");

            if (length == 4) {
                CombTwoFiles.combineTwoFiles(args[1], args[2], false, args[3]);
            } else if (length == 5) {
                if (!args[1].equals("-rm") && args[1].charAt(0) == '-') throw new IncorrectCommandException("Wrong option");
                else if(!args[1].equals("-rm")) throw new IncorrectCommandException("Wrong command");
                CombTwoFiles.combineTwoFiles(args[2], args[3], true, args[4]);
            }

        }
    }


    private static String skipCharacter(String line, char c){
        int point = 0;
        while(line.charAt(point) == c){
            point++;
        }
        return line.substring(point);
    }

    private static String skipWord(String line){
//        if(line.)
        int point = 0;
        while(point != line.length() && line.charAt(point) != ' '){
            point++;
            if(point == line.length()) return null;
        }
        return line.substring(point);
    }

    private static String getNextWord(String line){
        int point = 0;
        StringBuilder word = new StringBuilder();
        while(point != line.length() && line.charAt(point) != ' '){
            word.append(line.charAt(point));
            point++;
        }
        return word.toString();
    }
}
