package br.edu.ifpb.jefferson.nfs;

import java.util.ArrayList;
import java.util.List;

public class NFS {

    private final List<String> files = new ArrayList<>();

    public String process(String message) {
        String[] command = message.split(" ");
        switch (command[0]) {
            case "touch" -> touch(command[1]);
            case "rm" -> rm(command[1]);
            case "ls" -> {
                return ls();
            }
            default -> {
                return "Command not found";
            }
        }
        return "";
    }

    private void touch(String path) {
        files.add(path);
    }

    private void rm(String path) {
        files.remove(path);
    }

    private String ls() {
        return String.join(" ", files);
    }
}

