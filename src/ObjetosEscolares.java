enum ObjetosEscolares {
    LÁPIZ("Madera🪵", "HB", 0.5f, 3000) {
        @Override
        public void usarObjeto() {
            System.out.println("Escribiendo con el lápiz...");
        }
    },
    BORRADOR("Plástico", "Blanco", 2.0f, 4000) {
        @Override
        public void usarObjeto() {
            System.out.println("Borrando con el borrador...");
        }
    },
    CUADERNO("Papel", "Cuadriculado", 100, 2000) {
        @Override
        public void usarObjeto() {
            System.out.println("Escribiendo en el cuaderno...");
        }
    },
    REGLA("Plástico", "Transparente", 30.0f, 10000) {
        @Override
        public void usarObjeto() {
            System.out.println("Midiendo con la regla...");
        }
    };

    private String material;
    private String tipo;
    private float medida;
    private int precio;

    ObjetosEscolares(String material, String tipo, float medida, int precio) {
        this.material = material;
        this.tipo = tipo;
        this.medida = medida;
        this.precio = precio;
    }

    public static void mostrarObjetosEscolares() {
        System.out.println("Objetos escolares disponibles:");
        for (ObjetosEscolares objeto : ObjetosEscolares.values()) {
            System.out.println(objeto + ": Material= " + objeto.material + ", Tipo= " + objeto.tipo + ", Medida= " + objeto.medida + ", Precio= " + objeto.precio);
        }
    }

    public abstract void usarObjeto();
    }