package ejemplodamjava;

public class Miedo {

        private String tipo;
        private byte escala;
        private String genero;


        public Miedo(String tipo, byte escala, String genero) {

            this.tipo = tipo;
            this.escala = escala;
            this.genero = genero;

        }



        public String getTipo() {
            return tipo;

        }



        public void setTipo(String tipo) {

            this.tipo = tipo;

        }



        public byte getEscala() {

            return escala;

        }



        public void setEscala(byte escala) {

            this.escala = escala;

        }



        public String getGenero() {

            return genero;

        }



        public void setGenero(String genero) {

            this.genero = genero;

        }



        @Override

        public String toString() {

            return "Miedo{" +

                    "tipo='" + tipo + '\'' +

                    ", escala=" + escala +

                    ", genero='" + genero + '\'' +

                    '}';

        }

    }
}
