package lab5.dop;

import lab5.dop.exceptions.*;

import java.io.*;

public class CombTwoFiles {

    public static void combineTwoFiles(String pathFistFile, String pathSecondFile, boolean flagRemoveFiles, String fileName)
            throws IncorrectFileNameException, AccessFileException, CannotCreateFileException, FileReadingException, FileWritingException {

        File fileOne = loadFile(pathFistFile);
        File fileTwo = loadFile(pathSecondFile);

        String fileOneData = loadFileData(fileOne);
        String fileTwoData = loadFileData(fileTwo);

        File newFile = createNewFile(fileName);
        checkAccessWriteFile(fileName);

        writeDataIntoFile(newFile.getAbsolutePath(), fileOneData + fileTwoData);

        if(flagRemoveFiles) {
            try{
                removeFile(fileOne);
            }catch (AccessFileException e){
                System.err.println(e.getMessage());
            }
            try{
                removeFile(fileTwo);
            }catch (AccessFileException e){
                System.err.println(e.getMessage());
            }

        }
        

    }

    private static void removeFile(File file) throws AccessFileException {
        if(!file.delete()) throw new AccessFileException("Unable to delete file on the path " + file.getAbsolutePath());
    }

    private static File createNewFile(String path) throws CannotCreateFileException, IncorrectFileNameException {
        try {
            File newFile = new File(path);
            if(newFile.createNewFile()){
                return newFile;
            }else{
                throw new CannotCreateFileException("Such a file on the path " + path + " already exists");
            }
        }catch (IOException e){
            throw new CannotCreateFileException("Such a file on the path " + path + " already exists", e);
        }catch (NullPointerException e){
            throw new IncorrectFileNameException("The file name cannot be empty");
        }
    }

    private static void writeDataIntoFile(String path, String data) throws AccessFileException, FileWritingException {
        checkAccessWriteFile(path);
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path))){
            bufferedWriter.write(data);
            bufferedWriter.flush();
        } catch (IOException e) {
            throw new FileWritingException("Unable to write data to a file");
        }
    }

    private static File checkFilePath(String path) throws IncorrectFileNameException {
        try {
            File file = new File(path);
            if (!file.isFile() && !new File(new File("").getAbsolutePath() + "\\" + path).isFile()){
                throw new IncorrectFileNameException("The file on the path " + path + " does not exist");
            }
            return file;
        }catch (NullPointerException e){
            throw new IncorrectFileNameException("The file name cannot be empty");
        }
    }

    private static void checkAccessReadFile(File file) throws AccessFileException {
        if(!file.canRead()) throw new AccessFileException("The file on the path" + file.getAbsolutePath() + " is not readable");
    }

    private static void checkAccessWriteFile(String path) throws AccessFileException {
        File file = new File(path);
        if(!file.canWrite()) throw new AccessFileException("The file on the path " + path + " is not writable");
    }

    private static String loadFileData(File file) throws IncorrectFileNameException, AccessFileException, FileReadingException {
        try(BufferedReader reader
                    = new BufferedReader(new FileReader(file.getAbsolutePath()))){
            StringBuilder stringBuilder = new StringBuilder();
            String line;
            while((line = reader.readLine()) != null){
                stringBuilder.append(line).append("\n");
            }
            return stringBuilder.toString();
        } catch (FileNotFoundException e) {
            throw new IncorrectFileNameException("The file on the path " + file.getAbsolutePath() + " does not exist", e);
        }catch (IOException e){
            throw new FileReadingException("File reading exception on the path " + file.getAbsolutePath(), e);
        }
    }

    private static File loadFile(String path) throws AccessFileException, IncorrectFileNameException {
        File file = checkFilePath(path);
        checkAccessReadFile(file);
        return file;
    }
}
