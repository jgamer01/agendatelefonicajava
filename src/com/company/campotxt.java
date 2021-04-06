package com.company;

class campotxt {
    String recibir(String prompt) {
        return recibir(prompt, false);
    }

    String recibir(String prompt, boolean required) {
        System.out.println("\033[35m" + prompt + ":\33[0m");
        if (!required) {
        } else {
            while (true) {
                String txt = Main.scanner.nextLine();

                if (!txt.isEmpty()) {
                    return txt;
                } else {
                    Tipoerrores tipoerrores = new Tipoerrores();
                    tipoerrores.Warning("¡Introduce el campo por favor!");
                }
            }
        }
    }
}