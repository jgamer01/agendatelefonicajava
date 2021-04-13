package com.company;

class campotxt {
    String pedir(String prompt) {
        return pedir(prompt, false);
    }

    String pedir(String prompt, boolean obligatiorio){
        System.out.println("\033[35m" + prompt + ":\033[0m");
        if(!obligatiorio){
            return Main.scanner.nextLine();
        } else {

            while(true){
                String texto = Main.scanner.nextLine();

                if(!texto.isEmpty()){
                    return texto;
                } else {
                    Tipoerrores tipoerrores = new Tipoerrores();
                    tipoerrores.Warning("!Introduzca el campo!");
                }
            }
        }
    }
}