class Main {
    public static void main(String[] args) {
        ObjetosEscolares.mostrarObjetosEscolares();

        for (ObjetosEscolares objeto : ObjetosEscolares.values()) {
            objeto.usarObjeto();
        }
    }}